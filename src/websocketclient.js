// Create a new websocket

var socket = new WebSocket('ws://echo.websocket.org');

socket.onopen = function (event) {
    console.log("Connection Established");
    var label = document.getElementById("Status");
    label.innerHTML = "Connection Established";
};
