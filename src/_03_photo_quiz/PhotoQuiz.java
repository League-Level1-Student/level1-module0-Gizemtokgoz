package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address”)
		String george = "https://patch.com/img/cdn/users/83443/2015/01/raw/20150154b83821dbaa3.png";
		// 2. create a variable of type "Component" that will hold your image
		Component com;
		// 3. use the "createImage()" method below to initialize your Component
		com = createImage(george);
		// 4. add the image to the quiz window
		quizWindow.add(com);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String answer = JOptionPane.showInputDialog("Who is this?");
		// 7. print "CORRECT" if the user gave the right answer
		if (answer.equals("curious george")) {
			JOptionPane.showMessageDialog(null, "You are correct!");
		}
		// 8. print "INCORRECT" if the answer is wrong
		else {
			JOptionPane.showMessageDialog(null, "You are incorrect :(");
		}
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		quizWindow.remove(com);
		// 10. find another image and create it (might take more than one line
		// of code)
		String shrek = "https://vignette.wikia.nocookie.net/cinemasins/images/9/98/Shrek.png/revision/latest?cb=20170119184541";
		Component add;
		add = createImage(shrek);
		// 11. add the second image to the quiz window
		quizWindow.add(add);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String ans = JOptionPane.showInputDialog("Who is this?");
		// 14+ check answer, say if correct or incorrect, etc.
		if (ans.equals("shrek")) {
			JOptionPane.showMessageDialog(null, "You are correct!");
		}

		else {
			JOptionPane.showMessageDialog(null, "You are incorrect :(");
		}
	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
