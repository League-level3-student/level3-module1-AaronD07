package STEAMproj;
import java.awt.Rectangle;
//basically since each file needs values, gameobject is a super which acts as a parent or polymorph for the other classes
public class GameObject {
	 int x;
	 int y;
	 int width;
	 int height;
int speed=0;
Rectangle collisionBox;
boolean isActive=true;
public GameObject(int x, int y, int width, int height, int speed) {
	this.x=x;
	this.y=y;
	this.width=width;
	this.height=height;
	this.speed=speed;
	collisionBox=new Rectangle(10, 10, 10 , 10);
}
//this is creating an area that can control what happens when the alien or rocket get hit
public void update() {
	 collisionBox.setBounds(x, y, width, height);
}
}
