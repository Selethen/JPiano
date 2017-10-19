import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JButton;

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
		frame.getContentPane().setLayout(null);
		
		SmallPianoButton cSmallButton = new SmallPianoButton("C#", 45);
		frame.getContentPane().add(cSmallButton);
		
		SmallPianoButton dSmallButton = new SmallPianoButton("D#", 105);
		frame.getContentPane().add(dSmallButton);
		
		SmallPianoButton fSmallButton = new SmallPianoButton("F#", 225);
		frame.getContentPane().add(fSmallButton);
		
		SmallPianoButton gSmallButton = new SmallPianoButton("G#", 285);
		frame.getContentPane().add(gSmallButton);
		
		SmallPianoButton aSmallButton = new SmallPianoButton("G#", 345);
		frame.getContentPane().add(aSmallButton);
		
		SmallPianoButton c2SmallButton = new SmallPianoButton("C#", 465);
		frame.getContentPane().add(c2SmallButton);
		
		SmallPianoButton d2SmallButton = new SmallPianoButton("D#", 525);
		frame.getContentPane().add(d2SmallButton);
		
		SmallPianoButton f2SmallButton = new SmallPianoButton("F#", 645);
		frame.getContentPane().add(f2SmallButton);
		
		SmallPianoButton g2SmallButton = new SmallPianoButton("G#", 705);
		frame.getContentPane().add(g2SmallButton);
		
		SmallPianoButton a2SmallButton = new SmallPianoButton("G#", 765);
		frame.getContentPane().add(a2SmallButton);
		
		PianoButton cButton = new PianoButton("C", 0);
		frame.getContentPane().add(cButton);
		
		PianoButton dButton = new PianoButton("D", 60);
		frame.getContentPane().add(dButton);
		
		PianoButton eButton = new PianoButton("E", 120);
		frame.getContentPane().add(eButton);
		
		PianoButton fButton = new PianoButton("F", 180);
		frame.getContentPane().add(fButton);
		
		PianoButton gButton = new PianoButton("G", 240);
		frame.getContentPane().add(gButton);
		
		PianoButton aButton = new PianoButton("A", 300);
		frame.getContentPane().add(aButton);
		
		PianoButton bButton = new PianoButton("B", 360);
		frame.getContentPane().add(bButton);
		
		PianoButton c2Button = new PianoButton("C2", 420);
		frame.getContentPane().add(c2Button);
		
		PianoButton d2Button = new PianoButton("D2", 480);
		frame.getContentPane().add(d2Button);
		
		PianoButton e2Button = new PianoButton("E2", 540);
		frame.getContentPane().add(e2Button);
		
		PianoButton f2Button = new PianoButton("F2", 600);
		frame.getContentPane().add(f2Button);
		
		PianoButton g2Button = new PianoButton("G2", 660);
		frame.getContentPane().add(g2Button);
		
		PianoButton a2Button = new PianoButton("A2", 720);
		frame.getContentPane().add(a2Button);
		
		PianoButton b2Button = new PianoButton("B2", 780);
		frame.getContentPane().add(b2Button);
		
		PianoButton c3Button = new PianoButton("C3", 840);
		frame.getContentPane().add(c3Button);
		
		
	}
}
