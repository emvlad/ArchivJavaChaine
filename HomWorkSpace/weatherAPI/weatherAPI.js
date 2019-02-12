function setup() {
  createCanvas(200,200);
  
loadJSON('http://api.openweathermap.org/data/2.5/weather?q=London&APPID=d8cf90d489005944c9bbda255fc32fbe',gotData)
}
var weather;
function gotData(data){
  weather=data;
}

function draw() {

}
