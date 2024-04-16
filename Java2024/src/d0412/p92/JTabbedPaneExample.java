package d0412.p92;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingUtilities;

public class JTabbedPaneExample extends JFrame {
	private JTabbedPane jTabbedPane;
	private JPanel tab1Panel, tab2Panel;

	public JTabbedPaneExample() {
		this.setTitle("JTabbedPaneExample");
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().add(getJTabbedPane(), BorderLayout.CENTER);
	}

	private JTabbedPane getJTabbedPane() {
		if (jTabbedPane == null) {
			jTabbedPane = new JTabbedPane();
			jTabbedPane.setTabPlacement(JTabbedPane.LEFT);
			jTabbedPane.addTab("ег1", getTab1Panel());
			jTabbedPane.addTab("ег2", getTab2Panel());
		}

		return jTabbedPane;
	}

	private JPanel getTab1Panel() {
		if(tab1Panel == null) {
			tab1Panel = new JPanel();
			JLabel jLabel = new JLabel();
			jLabel.setIcon(new ImageIcon(getClass().getResource("img/../../../eye.jpg")));
			tab1Panel.add(jLabel);
		}
		return tab1Panel;
	}

	private JPanel getTab2Panel() {
		if(tab2Panel == null) {
			tab2Panel = new JPanel();
			JLabel jLabel = new JLabel();
			jLabel.setIcon(new ImageIcon(getClass().getResource("img/../../../guitar1.png")));
			tab2Panel.add(jLabel);
		}
		return tab2Panel;
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				JTabbedPaneExample jFrame = new JTabbedPaneExample();
				jFrame.setVisible(true);
			}
		});
	}
}
