import React, { Component } from "react";

class Me extends Component {
    render() {
        if (!this.props.me) {
            return <div>No logged in yet... <a href="/greeting">here</a> </div>
        }
        return (
            <div id="me">
            {this.props.me}
                </div>
        );
    }
}

export default Me;