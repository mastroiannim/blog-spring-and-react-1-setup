import React, { Component } from "react";
import ReactDOM from 'react-dom';
import FriendList from './FriendList';
import Me from './Me';
import YoutubeVideoList from './YoutubeVideoList';
import '../css/Main.css';

class Main extends Component {
    constructor(props) {
        super(props)
        this.state = {
            friends: []
        }
    }
    
    componentDidMount() {
        this.fetchFriends();
        this.ferchMe();
        this.fetchVideos();
    }

    fetchVideos(){
        fetch("/youtube")
        .then(res => res.json())
        .then(
            (response) => {
                //console.log(response);
                this.setState({
                    videos: response
                });
            },
            (error) => {
                alert(error);
            }
            )
    }

    ferchMe() {
        fetch("/api/me")
        .then(res => res.json())
        .then(
            (response) => {
                this.setState({
                    me: response.name
                });
            },
            (error) => {
                alert(error);
            }
            )
    }
    
    fetchFriends() {
        fetch("/api/friends")
        .then(res => res.json())
        .then(
            (response) => {
                this.setState({
                    friends: response
                });
            },
            (error) => {
                alert(error);
            }
            )
        }
        
        handleSubmit(evt) {
            evt.preventDefault();
            fetch("/api/friends", {
                method: "POST",
                body: new FormData(evt.target)
            }).then((response) => {
                if (response.ok) {
                    this.fetchFriends();
                } else {
                    alert("Failed to create friend");
                }
            }
            ).catch((error) => {
                alert(error);
            });
            evt.target.reset();
            return false;
        }
        
        render() {
            return (
                <div id="main">
                    <p>Get your greeting <a href="/greeting">here</a></p>
                    <h1> <Me me={this.state.me}/></h1>
                    <FriendList friends={this.state.friends}/>
                    <form onSubmit={this.handleSubmit.bind(this)}>
                        <input id="name" name="name" type="text" placeholder="Enter name"/>
                        <button type='submit'>Create</button>
                    </form>
                    <YoutubeVideoList videos={this.state.videos}/>
                </div>
                );
            }
        }
        
        ReactDOM.render(
            <Main />,
            document.getElementById('react-mountpoint')
            );