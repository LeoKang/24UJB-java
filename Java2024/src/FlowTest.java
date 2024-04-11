import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FlowTest implements WindowListener, ActionListener {
	private Frame frame;
	private Button button1, button2, button3;

	public FlowTest() {
		frame = new Frame("adapter example");
		button1 = new Button("Ok");
		button2 = new Button("Open");
		button3 = new Button("Close");
	}

	public void actionPerformed(ActionEvent e) {
//      if(e.getActionCommand().equals("Ok")) {
//         System.out.println("Ok");
//      }
//      if(e.getActionCommand().equals("Open")) {
//         System.out.println("Open");
//      }
//      if(e.getActionCommand().equals("Close")) {
//         System.exit(0);
//      }
	}

	@Override
	public void windowOpened(WindowEvent e) {

	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {

	}

	@Override
	public void windowIconified(WindowEvent e) {

	}

	@Override
	public void windowDeiconified(WindowEvent e) {

	}

	@Override
	public void windowActivated(WindowEvent e) {

	}

	@Override
	public void windowDeactivated(WindowEvent e) {

	}

	public void startFrame() {
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("OK!");
			}
		});
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Open!");
			}
		});
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});

		frame.addWindowListener(this);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		frame.setLayout(new FlowLayout());

		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		FlowTest g = new FlowTest();

		g.startFrame();
	}
}