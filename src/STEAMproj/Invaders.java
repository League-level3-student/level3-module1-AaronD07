package STEAMproj;
import javax.swing.JFrame;

public class Invaders {
	JFrame frame;
	GamePanel gamepanel;
	public static final int WIDTH = 500;
	public static final int HEIGHT = 800;

	public static void main(String[] args) {
		Invaders invaders = new Invaders();
		invaders.setup();

	}

	public Invaders() {
		frame = new JFrame();
		gamepanel = new GamePanel();
		frame.addKeyListener(gamepanel);
	}

	public void setup() {
		frame.add(gamepanel);
		frame.setVisible(true);
		frame.setSize(WIDTH, HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
