package _09_sound_effects_machine;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffectMachine {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(300, 300);
		JPanel panel = new JPanel();
		panel.setSize(300, 300);
		frame.add(panel);
		
		JButton button = new JButton();
		button.setSize(50, 50);
		panel.add(button);
		
		JButton but = new JButton();
		but.setSize(50, 50);
		panel.add(but);
		
		JButton buton = new JButton();
		buton.setSize(50, 50);
		panel.add(buton);
		
		JButton buttn = new JButton();
		buttn.setSize(50, 50);
		panel.add(buttn);
		
		JButton butto = new JButton();
		butto.setSize(50, 50);
		panel.add(butto);
		
		JButton btton = new JButton();
		btton.setSize(50, 50);
		panel.add(btton);
		
		frame.pack();
	}
}
