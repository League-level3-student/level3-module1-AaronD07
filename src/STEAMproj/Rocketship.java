package STEAMproj;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class Rocketship extends GameObject{
	//these member values hold the values f
	public static BufferedImage image;
	public static boolean needImage = true;
	public static boolean gotImage = false;	
	public Rocketship(int x, int y, int width, int height, int speed) {
		super(x, y, width, height, speed);
		speed=10;
		if (needImage) {
		    loadImage ("rocket.png");
		}
		// TODO Auto-generated constructor stub
	}
	public void update() {
	
		 super.update();
		 
	}
	//the ship is loaded and drawn
public void draw(Graphics g){
    g.setColor(Color.BLUE);
    g.fillRect(x, y, width, height);

if (gotImage) {
	g.drawImage(image, x, y, width, height, null);
} else {
	g.setColor(Color.BLUE);
	g.fillRect(x, y, width, height);
}
}
//since the ship is controlled by the user, this uses a mouselistener to move the ship according to the keys pressed
public void right() {
    x+=speed;
}
public void left() {
    x-=speed;
}
public void up() {
    y-=speed;
}
public void down() {
    y+=speed;
}
void loadImage(String imageFile) {
    if (needImage) {
        try {
            image = ImageIO.read(this.getClass().getResourceAsStream(imageFile));
	    gotImage = true;
        } catch (Exception e) {
            
        }
        needImage = false;
    }
}
public Projectile getProjectile() {
    return new Projectile(x+width/2, y, 10, 10);
} 
}

