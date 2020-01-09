package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
	public void showButton() {
		System.out.println("Button clicked");
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JButton button = new JButton();
		button.setSize(50, 50);
		JPanel panel = new JPanel();
		frame.add(button);
		frame.pack();
		button.addActionListener(this);
		
		button.setSize(50, 50);
		panel.add(button);
		
		JButton but = new JButton();
		but.setSize(50, 50);
		panel.add(but);
		
		JButton buton = new JButton();
		buton.setSize(50, 50);
		panel.add(buton);
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
		
	}
}
