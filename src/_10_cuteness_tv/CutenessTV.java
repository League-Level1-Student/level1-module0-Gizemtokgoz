package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
	JButton button = new JButton();
	JButton but = new JButton();
	JButton buton = new JButton();
	
	public void start() {
		System.out.println("Button clicked");
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		frame.add(panel);
		button.setSize(50, 50);
		panel.add(button);
		but.setSize(50, 50);
		panel.add(but);
		buton.setSize(50, 50);
		panel.add(buton);
		buton.addActionListener(this);
		but.addActionListener(this);
		button.addActionListener(this);
		frame.pack();
	}
	
	void showDucks() {
	      playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	 }

	void showFrog() {
	      playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	 }

	void showFluffyUnicorns() {
	      playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	 }

	void playVideo(String videoID) {
	      try {
	           URI uri = new URI(videoID);
	           java.awt.Desktop.getDesktop().browse(uri);
	      } catch (Exception e) {
	           e.printStackTrace();
	      }
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) arg0.getSource();
		if (buttonPressed == button) {
			playVideo("showDucks");
		}
		
		if (buttonPressed == but) {
			playVideo("showFrog");
		}
		
		if (buttonPressed == buton) {
			playVideo("showFluffyUnicorns");
		}
	}
}
