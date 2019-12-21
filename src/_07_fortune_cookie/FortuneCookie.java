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

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Woohoo!");
		int rand = new Random().nextInt(5);
	}

}
