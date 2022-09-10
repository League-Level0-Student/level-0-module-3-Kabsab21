
void setup() {
 
  // set the size of your sketch
  size(500,500);
}

void draw() {
  
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  for( int i = 300; i > 0; i-=25){
    if( i % 2 == 0){
      fill(#712525);
      ellipse(250,250,i,i); 
    }else{
      fill(#FFF7F7);
      ellipse(250,250,i,i); 
    }
  }
}
    
  //Use an if statement and remainder to alternate the color of your rings.
  
  
