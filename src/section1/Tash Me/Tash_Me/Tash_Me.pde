PImage mustache;
PImage friend;

void setup() {
  
  friend = loadImage("friend.jpg");
  size(800, 600);
  friend.resize(width,height);
  mustache = loadImage("mustache.png");
  size(800,600);
  mustache.resize(70,70);

}

void draw() {
  image(mustache, 150, 400);
  image(friend, 400,600);
}
