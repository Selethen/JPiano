import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;

public class Piano {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Piano window = new Piano();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Piano() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 915, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLayeredPane layeredPane = new JLayeredPane();
		
		SmallPianoButton cSmallButton = new SmallPianoButton("C#", 45);
		layeredPane.add(cSmallButton, 1, -1);
		
		SmallPianoButton dSmallButton = new SmallPianoButton("D#", 105);
		layeredPane.add(dSmallButton, 1, -1);
		
		SmallPianoButton fSmallButton = new SmallPianoButton("F#", 225);
		layeredPane.add(fSmallButton, 1, -1);
		
		SmallPianoButton gSmallButton = new SmallPianoButton("G#", 285);
		layeredPane.add(gSmallButton, 1, -1);
		
		SmallPianoButton aSmallButton = new SmallPianoButton("G#", 345);
		layeredPane.add(aSmallButton, 1, -1);
		
		SmallPianoButton c2SmallButton = new SmallPianoButton("C#", 465);
		layeredPane.add(c2SmallButton, 1, -1);
		
		SmallPianoButton d2SmallButton = new SmallPianoButton("D#", 525);
		layeredPane.add(d2SmallButton, 1, -1);
		
		SmallPianoButton f2SmallButton = new SmallPianoButton("F#", 645);
		layeredPane.add(f2SmallButton, 1, -1);
		
		SmallPianoButton g2SmallButton = new SmallPianoButton("G#", 705);
		layeredPane.add(g2SmallButton, 1, -1);
		
		SmallPianoButton a2SmallButton = new SmallPianoButton("G#", 765);
		layeredPane.add(a2SmallButton, 1, -1);
		
		PianoButton cButton = new PianoButton("C3", 0);
		layeredPane.add(cButton, 0, -1);
		
		PianoButton dButton = new PianoButton("D3", 60);
		layeredPane.add(dButton, 0, -1);
		
		PianoButton eButton = new PianoButton("E3", 120);
		layeredPane.add(eButton, 0, -1);
		
		PianoButton fButton = new PianoButton("F3", 180);
		layeredPane.add(fButton, 0, -1);
		
		PianoButton gButton = new PianoButton("G3", 240);
		layeredPane.add(gButton, 0, -1);
		
		PianoButton aButton = new PianoButton("A3", 300);
		layeredPane.add(aButton, 0, -1);
		
		PianoButton bButton = new PianoButton("B3", 360);
		layeredPane.add(bButton, 0, -1);
		
		PianoButton c2Button = new PianoButton("C4", 420);
		layeredPane.add(c2Button, 0, -1);
		
		PianoButton d2Button = new PianoButton("D4", 480);
		layeredPane.add(d2Button, 0, -1);
		
		PianoButton e2Button = new PianoButton("E4", 540);
		layeredPane.add(e2Button, 0, -1);
		
		PianoButton f2Button = new PianoButton("F4", 600);
		layeredPane.add(f2Button, 0, -1);
		
		PianoButton g2Button = new PianoButton("G4", 660);
		layeredPane.add(g2Button, 0, -1);
		
		PianoButton a2Button = new PianoButton("A4", 720);
		layeredPane.add(a2Button, 0, -1);
		
		PianoButton b2Button = new PianoButton("B4", 780);
		layeredPane.add(b2Button, 0, -1);
		
		PianoButton c3Button = new PianoButton("C5", 840);
		layeredPane.add(c3Button, 0, -1);
		
		frame.setContentPane(layeredPane);
	}
}
