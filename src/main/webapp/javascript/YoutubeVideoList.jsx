import React, { Component } from "react";

class YoutubeVideoList extends Component {
    render() {
        if (!this.props.videos) {
            return <div>No Videos yet...</div>
        }
        return (
            <ul id="video-list">
            {this.props.videos.map(video => (
                <li key={video.id}>
                    <h4>{video.title}</h4>
                    <a href={"https://www.youtube.com/watch?v=" +video.videoId}>
                        <img src={video.thumbnailUrl} height="42" width="42"/>    
                    </a>
                    <p>{video.description}</p>
                </li>
            ))}
            </ul>
        );
    }
}

export default YoutubeVideoList;