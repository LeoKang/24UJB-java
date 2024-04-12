import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Calculator extends WindowAdapter implements ActionListener {
	private Frame f;
	private Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17;
	private TextField scr, op, v;

	public Calculator() {
		f = new Frame("Calculator");
		f.setLayout(null);
		f.setSize(400, 600);
		scr = new TextField("", 20);
		op = new TextField("", 20);
		v = new TextField(20);
		b0 = new Button("0");
		b1 = new Button("1");
		b2 = new Button("2");
		b3 = new Button("3");
		b4 = new Button("4");
		b5 = new Button("5");
		b6 = new Button("6");
		b7 = new Button("7");
		b8 = new Button("8");
		b9 = new Button("9");

		b10 = new Button("=");
		b11 = new Button("+");
		b12 = new Button("-");
		b13 = new Button("*");
		b14 = new Button("/");
		b15 = new Button("C");
		b16 = new Button(".");
		b17 = new Button("+/-");

	}

	public void startFrame() {
		f.addWindowListener(this);
		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		b12.addActionListener(this);
		b13.addActionListener(this);
		b14.addActionListener(this);
		b15.addActionListener(this);
		b16.addActionListener(this);
		b17.addActionListener(this);
		b0.setLocation(100, 300);
		b1.setLocation(50, 250);
		b2.setLocation(100, 250);
		b3.setLocation(150, 250);
		b4.setLocation(50, 200);
		b5.setLocation(100, 200);
		b6.setLocation(150, 200);
		b7.setLocation(50, 150);
		b8.setLocation(100, 150);
		b9.setLocation(150, 150);
		b10.setLocation(200, 250);
		b11.setLocation(200, 200);
		b12.setLocation(200, 150);
		b13.setLocation(50, 100);
		b14.setLocation(100, 100);
		b15.setLocation(150, 100);
		b16.setLocation(150, 300);
		b17.setLocation(50, 300);
		scr.setLocation(50, 50);
		op.setLocation(200, 50);
		b0.setSize(50, 50);
		b1.setSize(50, 50);
		b2.setSize(50, 50);
		b3.setSize(50, 50);
		b4.setSize(50, 50);
		b5.setSize(50, 50);
		b6.setSize(50, 50);
		b7.setSize(50, 50);
		b8.setSize(50, 50);
		b9.setSize(50, 50);
		b10.setSize(50, 100);
		b11.setSize(50, 50);
		b12.setSize(50, 50);
		b13.setSize(50, 50);
		b14.setSize(50, 50);
		b15.setSize(100, 50);
		b16.setSize(50, 50);
		b17.setSize(50, 50);
		scr.setSize(150, 50);
		op.setSize(50, 50);
		f.add(scr);
		f.add(op);
		f.add(b0);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);
		f.add(b8);
		f.add(b9);
		f.add(b10);
		f.add(b11);
		f.add(b12);
		f.add(b13);
		f.add(b14);
		f.add(b15);
		f.add(b16);
		f.add(b17);
		f.add(scr);
		f.add(v);
		f.setVisible(true);

	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (e.getActionCommand().equals("C")) {
			scr.setText("0");
			op.setText("");

		} else if (e.getActionCommand().equals("0")) {
			if (scr.getText().equals("0")) {
			} else {
				scr.setText(scr.getText() + "0");
			}
		} else if (e.getActionCommand().equals("1")) {
			if (scr.getText().equals("0")) {
				scr.setText("1");
			} else {
				scr.setText(scr.getText() + "1");
			}
		} else if (e.getActionCommand().equals("2")) {
			if (scr.getText().equals("0")) {
				scr.setText("2");
			} else {
				scr.setText(scr.getText() + "2");
			}

		} else if (e.getActionCommand().equals("3")) {
			if (scr.getText().equals("0")) {
				scr.setText("3");
			} else {
				scr.setText(scr.getText() + "3");
			}

		} else if (e.getActionCommand().equals("4")) {
			if (scr.getText().equals("0")) {
				scr.setText("4");
			} else {
				scr.setText(scr.getText() + "4");
			}

		} else if (e.getActionCommand().equals("5")) {
			if (scr.getText().equals("0")) {
				scr.setText("5");
			} else {
				scr.setText(scr.getText() + "5");
			}

		} else if (e.getActionCommand().equals("6")) {
			if (scr.getText().equals("0")) {
				scr.setText("6");
			} else {
				scr.setText(scr.getText() + "6");
			}

		} else if (e.getActionCommand().equals("7")) {
			if (scr.getText().equals("0")) {
				scr.setText("7");
			} else {
				scr.setText(scr.getText() + "7");
			}

		} else if (e.getActionCommand().equals("8")) {
			if (scr.getText().equals("0")) {
				scr.setText("8");
			} else {
				scr.setText(scr.getText() + "8");
			}

		} else if (e.getActionCommand().equals("9")) {
			if (scr.getText().equals("0")) {
				scr.setText("9");
			} else {
				scr.setText(scr.getText() + "9");
			}

		} else if (e.getActionCommand().equals("+")) {
			op.setText("+");
			v.setText(scr.getText());
		} else if (e.getActionCommand().equals("-")) {
			op.setText("-");
			v.setText(scr.getText());
		} else if (e.getActionCommand().equals("*")) {
			op.setText("*");
			v.setText(scr.getText());
		} else if (e.getActionCommand().equals("/")) {
			op.setText("/");
			v.setText(scr.getText());
		} else if (e.getActionCommand().equals("+/-")) {
			double a = Double.parseDouble(scr.getText());
			double d = a * (-1); // 양수면음수로 음수면 양수로
			String z = Double.toString(d); // 다시 스트링
			scr.setText(z);

		} else if (e.getActionCommand().equals("=")) {
			if (scr.getText().equals(null) || op.getText().equals(null)) {
				System.out.print("x");
			}
			double a = Double.parseDouble(scr.getText());
			double b = Double.parseDouble(v.getText());
			if (op.getText().equals("+")) {
				String c = Double.toString(a + b);
				scr.setText(c);
			} else if (op.getText().equals("-")) {
				String c = Double.toString(a - b);
				scr.setText(c);
			} else if (op.getText().equals("*")) {
				String c = Double.toString(a * b);
				scr.setText(c);
			} else if (op.getText().equals("/")) {
				String c = Double.toString(a / b);
				scr.setText(c);
				/*
				 * } else if (op.getText().equals(".")) { String c = Double.toString(a);
				 * scr.setText(c);
				 */
			} else {

			}

		}
		if (e.getActionCommand().equals("/") || e.getActionCommand().equals("-") || e.getActionCommand().equals("+")
				|| (e.getActionCommand().equals("*"))) {
			scr.setText("");
		}

	}

	public static void main(String[] args) {
		Calculator g = new Calculator();
		g.startFrame();

	}
}