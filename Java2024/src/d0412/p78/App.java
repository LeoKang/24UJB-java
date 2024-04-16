package d0412.p78;

import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class App extends JFrame {
	public App() {
		setTitle("Swing App");
		setSize(300, 100);
		getContentPane().add(new JButton("Ok"), BorderLayout.SOUTH);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		App app = new App();
		app.setVisible(true);
	}
}
