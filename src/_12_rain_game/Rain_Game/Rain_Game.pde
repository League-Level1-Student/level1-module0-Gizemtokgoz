int x = 100 ;
int y = 50;
int score = 0;
void setup() {
  size(400, 700);
}

void draw() {
    int randomNumber = (int) random(width);
    background(250, 250, 250);
    fill(#BCB6B6);
    rect(mouseX, 600, 75, 75);
    fill(#A1C9FC);
    stroke(#A1C9FC);
    ellipse(x, y, 50, 50);
    y=y+15;
    
    if (y > 600) {
      y = 0;
      ellipse(x, y, 50, 50);
      y=y+15;
      checkCatch(x);
      x = randomNumber;
    }
    
     fill(0, 0, 0);
    textSize(16);
    text("Score: " + score, 20, 20);
}

void checkCatch(int x){
         if (x > mouseX && x < mouseX+100)
            score++;
         else if (score > 0) 
            score--;
        println("Your score is now: " + score);
    }
