import java.awt.Color;

import javax.swing.JButton;

public class SmallPianoButton extends JButton{
	
	SmallPianoButton(int x) {
		this.setBounds(x, 0, 30, 150);
		this.setBackground(Color.BLACK);
	}
}
