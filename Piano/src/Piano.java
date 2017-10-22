import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import sun.audio.*;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

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
		
		SmallPianoButton cSmallButton = new SmallPianoButton(45);
		cSmallButton.addActionListener(new x30Listener());
		layeredPane.add(cSmallButton, 1, -1);
		
		SmallPianoButton dSmallButton = new SmallPianoButton(105);
		dSmallButton.addActionListener(new x32Listener());
		layeredPane.add(dSmallButton, 1, -1);
		
		SmallPianoButton fSmallButton = new SmallPianoButton(225);
		fSmallButton.addActionListener(new x35Listener());
		layeredPane.add(fSmallButton, 1, -1);
		
		SmallPianoButton gSmallButton = new SmallPianoButton(285);
		gSmallButton.addActionListener(new x37Listener());
		layeredPane.add(gSmallButton, 1, -1);
		
		SmallPianoButton aSmallButton = new SmallPianoButton(345);
		aSmallButton.addActionListener(new x39Listener());
		layeredPane.add(aSmallButton, 1, -1);
		
		SmallPianoButton c2SmallButton = new SmallPianoButton(465);
		c2SmallButton.addActionListener(new x42Listener());
		layeredPane.add(c2SmallButton, 1, -1);
		
		SmallPianoButton d2SmallButton = new SmallPianoButton(525);
		d2SmallButton.addActionListener(new x44Listener());
		layeredPane.add(d2SmallButton, 1, -1);
		
		SmallPianoButton f2SmallButton = new SmallPianoButton(645);
		f2SmallButton.addActionListener(new x47Listener());
		layeredPane.add(f2SmallButton, 1, -1);
		
		SmallPianoButton g2SmallButton = new SmallPianoButton(705);
		g2SmallButton.addActionListener(new x49Listener());
		layeredPane.add(g2SmallButton, 1, -1);
		
		SmallPianoButton a2SmallButton = new SmallPianoButton(765);
		a2SmallButton.addActionListener(new x51Listener());
		layeredPane.add(a2SmallButton, 1, -1);
		
		PianoButton cButton = new PianoButton("C3", 0);
		cButton.addActionListener(new x29Listener());
		layeredPane.add(cButton, 0, -1);
		
		PianoButton dButton = new PianoButton("D3", 60);
		dButton.addActionListener(new x31Listener());
		layeredPane.add(dButton, 0, -1);
		
		PianoButton eButton = new PianoButton("E3", 120);
		eButton.addActionListener(new x33Listener());
		layeredPane.add(eButton, 0, -1);
		
		PianoButton fButton = new PianoButton("F3", 180);
		fButton.addActionListener(new x34Listener());
		layeredPane.add(fButton, 0, -1);
		
		PianoButton gButton = new PianoButton("G3", 240);
		gButton.addActionListener(new x36Listener());
		layeredPane.add(gButton, 0, -1);
		
		PianoButton aButton = new PianoButton("A3", 300);
		aButton.addActionListener(new x38Listener());
		layeredPane.add(aButton, 0, -1);
		
		PianoButton bButton = new PianoButton("B3", 360);
		bButton.addActionListener(new x40Listener());
		layeredPane.add(bButton, 0, -1);
		
		PianoButton c2Button = new PianoButton("C4", 420);
		c2Button.addActionListener(new x41Listener());
		layeredPane.add(c2Button, 0, -1);
		
		PianoButton d2Button = new PianoButton("D4", 480);
		d2Button.addActionListener(new x43Listener());
		layeredPane.add(d2Button, 0, -1);
		
		PianoButton e2Button = new PianoButton("E4", 540);
		e2Button.addActionListener(new x45Listener());
		layeredPane.add(e2Button, 0, -1);
		
		PianoButton f2Button = new PianoButton("F4", 600);
		f2Button.addActionListener(new x46Listener());
		layeredPane.add(f2Button, 0, -1);
		
		PianoButton g2Button = new PianoButton("G4", 660);
		g2Button.addActionListener(new x48Listener());
		layeredPane.add(g2Button, 0, -1);
		
		PianoButton a2Button = new PianoButton("A4", 720);
		a2Button.addActionListener(new x50Listener());
		layeredPane.add(a2Button, 0, -1);
		
		PianoButton b2Button = new PianoButton("B4", 780);
		b2Button.addActionListener(new x52Listener());
		layeredPane.add(b2Button, 0, -1);
		
		PianoButton c3Button = new PianoButton("C5", 840);
		c3Button.addActionListener(new x53Listener());
		layeredPane.add(c3Button, 0, -1);
		
		frame.setContentPane(layeredPane);
	}
	
	private class x53Listener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			InputStream iAudio;

			try {
				iAudio = new FileInputStream(new File("resources/053.wav"));
				AudioStream iMusic = new AudioStream(iAudio);
				AudioPlayer.player.start(iMusic);
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, ex);
			}
		}
	}

	private class x52Listener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			InputStream iAudio;

			try {
				iAudio = new FileInputStream(new File("resources/052.wav"));
				AudioStream iMusic = new AudioStream(iAudio);
				AudioPlayer.player.start(iMusic);
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, ex);
			}
		}
	}

	private class x51Listener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			InputStream iAudio;

			try {
				iAudio = new FileInputStream(new File("resources/051.wav"));
				AudioStream iMusic = new AudioStream(iAudio);
				AudioPlayer.player.start(iMusic);
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, ex);
			}
		}
	}

	private class x50Listener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			InputStream iAudio;

			try {
				iAudio = new FileInputStream(new File("resources/050.wav"));
				AudioStream iMusic = new AudioStream(iAudio);
				AudioPlayer.player.start(iMusic);
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, ex);
			}
		}
	}

	private class x49Listener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			InputStream iAudio;

			try {
				iAudio = new FileInputStream(new File("resources/049.wav"));
				AudioStream iMusic = new AudioStream(iAudio);
				AudioPlayer.player.start(iMusic);
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, ex);
			}
		}
	}

	private class x48Listener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			InputStream iAudio;

			try {
				iAudio = new FileInputStream(new File("resources/048.wav"));
				AudioStream iMusic = new AudioStream(iAudio);
				AudioPlayer.player.start(iMusic);
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, ex);
			}
		}
	}

	private class x47Listener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			InputStream iAudio;

			try {
				iAudio = new FileInputStream(new File("resources/047.wav"));
				AudioStream iMusic = new AudioStream(iAudio);
				AudioPlayer.player.start(iMusic);
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, ex);
			}
		}
	}

	private class x46Listener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			InputStream iAudio;

			try {
				iAudio = new FileInputStream(new File("resources/046.wav"));
				AudioStream iMusic = new AudioStream(iAudio);
				AudioPlayer.player.start(iMusic);
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, ex);
			}
		}
	}

	private class x45Listener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			InputStream iAudio;

			try {
				iAudio = new FileInputStream(new File("resources/045.wav"));
				AudioStream iMusic = new AudioStream(iAudio);
				AudioPlayer.player.start(iMusic);
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, ex);
			}
		}
	}

	private class x44Listener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			InputStream iAudio;

			try {
				iAudio = new FileInputStream(new File("resources/044.wav"));
				AudioStream iMusic = new AudioStream(iAudio);
				AudioPlayer.player.start(iMusic);
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, ex);
			}
		}
	}

	private class x43Listener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			InputStream iAudio;

			try {
				iAudio = new FileInputStream(new File("resources/043.wav"));
				AudioStream iMusic = new AudioStream(iAudio);
				AudioPlayer.player.start(iMusic);
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, ex);
			}
		}
	}

	private class x42Listener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			InputStream iAudio;

			try {
				iAudio = new FileInputStream(new File("resources/042.wav"));
				AudioStream iMusic = new AudioStream(iAudio);
				AudioPlayer.player.start(iMusic);
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, ex);
			}
		}
	}

	private class x41Listener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			InputStream iAudio;

			try {
				iAudio = new FileInputStream(new File("resources/041.wav"));
				AudioStream iMusic = new AudioStream(iAudio);
				AudioPlayer.player.start(iMusic);
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, ex);
			}
		}
	}

	private class x40Listener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			InputStream iAudio;

			try {
				iAudio = new FileInputStream(new File("resources/040.wav"));
				AudioStream iMusic = new AudioStream(iAudio);
				AudioPlayer.player.start(iMusic);
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, ex);
			}
		}
	}

	private class x39Listener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			InputStream iAudio;

			try {
				iAudio = new FileInputStream(new File("resources/039.wav"));
				AudioStream iMusic = new AudioStream(iAudio);
				AudioPlayer.player.start(iMusic);
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, ex);
			}
		}
	}

	private class x38Listener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			InputStream iAudio;

			try {
				iAudio = new FileInputStream(new File("resources/038.wav"));
				AudioStream iMusic = new AudioStream(iAudio);
				AudioPlayer.player.start(iMusic);
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, ex);
			}
		}
	}

	private class x37Listener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			InputStream iAudio;

			try {
				iAudio = new FileInputStream(new File("resources/037.wav"));
				AudioStream iMusic = new AudioStream(iAudio);
				AudioPlayer.player.start(iMusic);
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, ex);
			}
		}
	}

	private class x36Listener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			InputStream iAudio;

			try {
				iAudio = new FileInputStream(new File("resources/036.wav"));
				AudioStream iMusic = new AudioStream(iAudio);
				AudioPlayer.player.start(iMusic);
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, ex);
			}
		}
	}

	private class x35Listener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			InputStream iAudio;

			try {
				iAudio = new FileInputStream(new File("resources/035.wav"));
				AudioStream iMusic = new AudioStream(iAudio);
				AudioPlayer.player.start(iMusic);
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, ex);
			}
		}
	}

	private class x34Listener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			InputStream iAudio;

			try {
				iAudio = new FileInputStream(new File("resources/034.wav"));
				AudioStream iMusic = new AudioStream(iAudio);
				AudioPlayer.player.start(iMusic);
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, ex);
			}
		}
	}

	private class x33Listener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			InputStream iAudio;

			try {
				iAudio = new FileInputStream(new File("resources/033.wav"));
				AudioStream iMusic = new AudioStream(iAudio);
				AudioPlayer.player.start(iMusic);
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, ex);
			}
		}
	}

	private class x32Listener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			InputStream iAudio;

			try {
				iAudio = new FileInputStream(new File("resources/032.wav"));
				AudioStream iMusic = new AudioStream(iAudio);
				AudioPlayer.player.start(iMusic);
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, ex);
			}
		}
	}

	private class x31Listener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			InputStream iAudio;

			try {
				iAudio = new FileInputStream(new File("resources/031.wav"));
				AudioStream iMusic = new AudioStream(iAudio);
				AudioPlayer.player.start(iMusic);
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, ex);
			}
		}
	}

	private class x30Listener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			InputStream iAudio;

			try {
				iAudio = new FileInputStream(new File("resources/030.wav"));
				AudioStream iMusic = new AudioStream(iAudio);
				AudioPlayer.player.start(iMusic);
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, ex);
			}
		}
	}

	private class x29Listener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			InputStream iAudio;

			try {
				iAudio = new FileInputStream(new File("resources/029.wav"));
				AudioStream iMusic = new AudioStream(iAudio);
				AudioPlayer.player.start(iMusic);
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, ex);
			}
		}
	}


	
}
