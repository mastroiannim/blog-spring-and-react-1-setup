import React, { Component } from "react";

class Me extends Component {
    render() {
        if (!this.props.me) {
            return <div>No logged in yet...</div>
        }
        return (
            <div id="me">
            {this.props.me} Best Friends
                </div>
        );
    }
}

export default Me;