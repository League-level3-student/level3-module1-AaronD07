package STEAMproj;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager implements ActionListener{
	//member variables that add in rocket, aliens, and projectile
	//these will only work once I finish the alien, projectile, and rocket classes
	Rocketship rocket;
	ArrayList<Projectile> projectiles = new ArrayList<Projectile>();
	ArrayList<Alien> aliens = new ArrayList<Alien>();
	Random random = new Random();
	//this keeps count of how many aliens are shot
	int score = 0;
//constructor initializes rocket so that it can be repainted within this file
	public ObjectManager(Rocketship rocket) {
		this.rocket = rocket;

	}
//aliens and projectile are added
	public void addProjectile(Projectile projectile) {
		projectiles.add(projectile);
	}

	public void addAlien() {
		aliens.add(new Alien(random.nextInt(Invaders.WIDTH), 0, 50, 50));
	}

	public void update() {
		for (int i = 0; i < aliens.size(); i++) {
			aliens.get(i).update();
			
			if (Invaders.HEIGHT < aliens.get(i).y) {
				aliens.get(i).isActive = false;
			}
			
		}
		for(int i = 0; i<projectiles.size(); i++) {
			projectiles.get(i).update();
		
			
		}
		rocket.update();
		//this calls the checkcollision methos to see if the ship was hit, if so, the objects will be "purged" or reinitialized
		checkCollision();
purgeObjects();
	}
//the draw method draws everything and is used to repaint
	public void draw(Graphics g) {
		rocket.draw(g);
		for (int i = 0; i < aliens.size(); i++) {
			aliens.get(i).draw(g);
		}

		for (int t = 0; t < projectiles.size(); t++) {
			projectiles.get(t).draw(g);
		}
	}

	public void purgeObjects() {
		for (int i = 0; i < aliens.size(); i++) {
			if (aliens.get(i).isActive == false) {
				aliens.remove(i);
			}
		
		}
		for (int t = 0; t < projectiles.size(); t++) {
			if (projectiles.get(t).isActive == false) {
				projectiles.remove(t);
			}
		
		}
	
	}
	//this is for if an alien gets hit or if the rocket is hit

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		addAlien();
	}
	public void checkCollision() {
		for(int i=0; i<aliens.size(); i++) {
			if (rocket.collisionBox.intersects(aliens.get(i).collisionBox)) {
				rocket.isActive=false;
			}
		
			for(int o=0; o<projectiles.size(); o++) {
				if (aliens.get(i).collisionBox.intersects(projectiles.get(o).collisionBox)) {
					aliens.get(i).isActive=false;
					score =score+1;
				}
			}
		}
				
			}
	//this returns the final score
	public int getScore() {
		return score;
	}
		
	}
	

