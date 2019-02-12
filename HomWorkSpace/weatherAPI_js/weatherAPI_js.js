
var weather;
function setup() {
  createCanvas(200,200);
  
loadJSON('http://api.openweathermap.org/data/2.5/weather?q=London&APPID=d8cf90d489005944c9bbda255fc32fbe')
}

function gotData(data){
  //println(data);
  
  weather=data;
  
}

function draw() {
  background(0);
  if(weather){
    ellipse(100,200,weather.main.temp, weather.main.temp);
    ellipse(300,200,weather.main.humidity, weather.main.humidity);
    
  }

}
