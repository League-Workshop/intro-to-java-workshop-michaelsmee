int foodx=100;
int foody=20;
void setup(){
foodx=(int) random(width-20);
size(700,700);
background(147,233,237);
}
void draw(){
 background(147,233,237); 
fill(141,233,237);
noStroke();
fill(250,170,30);
ellipse(foodx,foody,20,100);
foody=foody+1;
foodx=(int) random(width-20);
}