import React, { Component } from "react";
import ReactDOM from 'react-dom';
import '../css/Main.css';

class Main extends Component {
    render() {
        return (
            <div id="main">
                <h1>Demo Component</h1>
                <p>Get your greeting <a href="/greeting">here</a></p>
                <img src="https://upload.wikimedia.org/wikipedia/commons/a/a7/React-icon.svg"/>
            </div>
        );
    }
}

ReactDOM.render(
    <Main />,
    document.getElementById('react-mountpoint')
);
