package _08_jack_in_the_box;

import java.applet.AudioClip;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.print.DocFlavor.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JackInTheBox implements MouseListener {
	int mousePressed = 0;
	public void showPicture(String fileName) {
		try {
			JLabel imageLabel = createLabelImage(fileName);
			JFrame frame = new JFrame();
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.add(imageLabel);
			frame.setVisible(true);
			frame.addMouseListener(this);
			frame.pack();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private JLabel createLabelImage(String fileName) {
		try {
			java.net.URL imageURL = getClass().getResource(fileName);
			if (imageURL == null) {
				System.err.println("Could not find image " + fileName);
				return new JLabel();
			} else {
				Icon icon = new ImageIcon(imageURL);
				JLabel imageLabel = new JLabel(icon);
				return imageLabel;
			}
		} catch (Exception e) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
	}

	private void playSound(String soundFile) { 
	    try {
	        AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
	        sound.play();
	    } catch (Exception e) {
	        e.printStackTrace();
	    	}
		}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
			}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
		mousePressed += 1;
		if(mousePressed == 5){
		showPicture("jackInTheBox.png");
		playSound("homer-woohoo.wav");
		
	}
System.out.println(mousePressed);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
