package _09_sound_effects_machine;

import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffectMachine implements ActionListener {
	JButton button = new JButton();
	JButton but = new JButton();
	JButton buton = new JButton();
	JButton buttn = new JButton();
	JButton butto = new JButton();
	JButton btton = new JButton();
	public void start() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(600, 300);
		JPanel panel = new JPanel();
		panel.setSize(600, 300);
		frame.add(panel);
		
		button.setPreferredSize(new Dimension(150,150));
		button.setOpaque(true);
		button.setBackground(Color.magenta);
		button.addActionListener(this);
		panel.add(button);
		
		but.setPreferredSize(new Dimension(150,150));
		but.setOpaque(true);
		but.setBackground(Color.cyan);
		but.addActionListener(this);
		panel.add(but);
		
		buton.setPreferredSize(new Dimension(150,150));
		buton.setOpaque(true);
		buton.setBackground(Color.green);
		buton.addActionListener(this);
		panel.add(buton);
		
		buttn.setPreferredSize(new Dimension(150,150));
		buttn.setOpaque(true);
		buttn.setBackground(Color.orange);
		buttn.addActionListener(this);
		panel.add(buttn);
		
		butto.setPreferredSize(new Dimension(150,150));
		butto.setOpaque(true);
		butto.setBackground(Color.pink);
		butto.addActionListener(this);
		panel.add(butto);
		
		btton.setPreferredSize(new Dimension(150,150));
		btton.setOpaque(true);
		btton.setBackground(Color.yellow);
		btton.addActionListener(this);
		panel.add(btton);
		
		frame.pack();
	}

	private void playSound(String fileName) {

	    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 

	    sound.play();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed == button) {
			playSound("Bagpipe.wav");
		}
		
		if (buttonPressed == but) {
			playSound("Dial.wav");
		}
		
		if (buttonPressed == buton) {
			playSound("heart.wav");
		}
		
		if (buttonPressed == buttn) {
			playSound("pour.wav");
		}
		
		if (buttonPressed == butto) {
			playSound("sawing-wood-daniel_simon.wav");
		}
		
		if (buttonPressed == btton) {
			playSound("Siren.wav");
		}
	}
}
