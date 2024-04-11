package d0411.p21;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWTEvent2 {
	private Frame f;
	private Button btn1, btn2, btn3, btn4, btn5;

	public AWTEvent2() {
		f = new Frame("event handler example2");
		btn1 = new Button("Button1");
		btn2 = new Button("Button2");
		btn3 = new Button("Button3");
		btn4 = new Button("Button4");
		btn5 = new Button("Button5");
	}

	

	public void startFrame() {
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Button1 Click!");
			}
		});
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Button2 Click!");
			}
		});
		btn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Button3 Click!");
			}
		});
		btn4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Button4 Click!");
			}
		});
		btn5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Button5 Click!");
			}
		});
		
		f.add(btn1, "North");
		f.add(btn2, "South");
		f.add(btn3, BorderLayout.WEST);
		f.add(btn4, BorderLayout.EAST);
		f.add(btn5, BorderLayout.CENTER);

		f.setSize(300, 300);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		AWTEvent2 at = new AWTEvent2();
		at.startFrame();
	}
}
