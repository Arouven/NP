
var lon = null;
var lat = null;

window.RetrieveLocation = function RetrieveLocation(element) {
    console.log("Server says hello to client");
    console.log("client location is : ");
    getLocation();
    element.$server.clientPosition(lon, lat);
};

function getLocation() {
    if (navigator.geolocation) {
        navigator.geolocation.getCurrentPosition(showPosition);
    } else {
        console.log("Geolocation is not supported by this browser.");
    }
}

function showPosition(position) {
    lon = position.coords.longitude;
    lat = position.coords.latitude;
    console.log("Latitude: " + lat + "\nLongitude: " + lon);
    loadDoc();
}

function loadDoc() {
  var xhttp = new XMLHttpRequest();
  xhttp.onreadystatechange = function() {
//    if (this.readyState == 4 && this.status == 200) {
//      document.getElementById("demo").innerHTML = this.responseText;
//    }
  };
  xhttp.open("GET", "location.jsp?latitude="+lat+"&longitude="+lon, true);
  xhttp.send();
}