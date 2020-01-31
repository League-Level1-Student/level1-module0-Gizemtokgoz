float x = 0;
float y = 0;
void setup() {
   size(600,600);
   background(#050000);
}

void draw() {
  makeMagical();
  for (int i = 0; i < 300; i++) {
    fill(225, 0, 0);
    ellipse(getWormX(i), getWormY(i), 20, 20);
  }
  x = random(width);
  y = random(height);
}

    float frequency = .005;
    float noiseInterval = PI;

    void makeMagical() {
        fill( 0, 0, 0, 10 );
        rect(0, 0, width, height);
        noStroke();
    }

    float getWormX(int i) {
        return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
    }

    float getWormY(int i) {
        return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
    }
