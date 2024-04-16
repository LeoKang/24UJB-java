import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Component;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class FrameEx extends Frame {
	public FrameEx() {
		setTitle("AWT App");
		setSize(800, 600);

		add(new Button("OK"), BorderLayout.SOUTH);

		Component[] temp = this.getComponents();

		for (int i = 0; i < temp.length; ++i) {
			if (temp[i] instanceof Button && ((Button) temp[i]).getLabel().equals("OK")) {
				((Button) temp[i]).addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						System.out.println("Ok click");
					}
				});
			}
		}

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}

	public FrameEx(String str) {
		super(str);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}
}