package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	public void showButton() {
		System.out.println("Button clicked");
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JButton button = new JButton();
		button.setSize(50, 50);
		frame.add(button);
		frame.pack();
		button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Your fortune is....");
		int rand = new Random().nextInt(5);
		if (rand == 0) {
			JOptionPane.showMessageDialog(null, "I cannot help you, for I am just a computer");
		}

		else if (rand == 1) {
			JOptionPane.showMessageDialog(null, "You will marry a professional athlete - if competitive eating can be considered a sport");
		}

		else if (rand == 2) {
			JOptionPane.showMessageDialog(null, "If you think we're going to sum up your whole life on this little fraction of the screen, you're crazy");
		}

		else if (rand == 3) {
			JOptionPane.showMessageDialog(null, "I see money in your future... it is not yours though");
		}

		else if (rand == 4) {
			JOptionPane.showMessageDialog(null, "Your pet is planning to eat you");
		}
	}

}
