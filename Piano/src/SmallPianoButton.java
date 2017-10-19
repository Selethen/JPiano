import javax.swing.JButton;

public class SmallPianoButton extends JButton{
	
	SmallPianoButton(String text, int x) {
		super(text);
		this.setBounds(x, 0, 30, 150);
	}
}
