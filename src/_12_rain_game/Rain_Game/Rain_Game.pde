int x = 100  ;
int y = 50;
void setup() {
  size(400, 700);
}

void draw() {
    background(250, 250, 250);
    fill(#A1C9FC);
    stroke(#A1C9FC);
    ellipse(x, y, 50, 50);
    y++;
    
    if (y > 700) {
      y = 0;
      ellipse(x, y, 50, 50);
      y++;
    }
}
