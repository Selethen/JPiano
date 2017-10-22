import java.awt.Color;

import javax.swing.JButton;

public class PianoButton extends JButton{
	
	PianoButton(String text, int x) {
		super(text);
		this.setBounds(x, 0, 60, 300);
		this.setBackground(Color.WHITE);
	}
}
