package d0412.calculator;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWTCalc implements ActionListener {
	private Frame f;
	private TextField tf;
	private Panel p;
	private Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9;
	private Button bPlus, bMinus, bMul, bDiv, bRes;
	private int operand = 0;

	private enum OP {
		OP_NULL, OP_PLUS, OP_MINUS, OP_MUL, OP_DIV
	};

	private OP op = OP.OP_NULL;
	private OP opOne = OP.OP_NULL;

	public AWTCalc() {
		f = new Frame("Calculator!");
		f.setSize(400, 300);
		f.setLocation(50, 50);

		tf = new TextField("0");

		p = new Panel();
		p.setLayout(new GridLayout(4, 0));

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

		bPlus = new Button("+");
		bMinus = new Button("-");
		bMul = new Button("*");
		bDiv = new Button("/");
		bRes = new Button("=");

		bPlus.addActionListener(this);
		bMinus.addActionListener(this);
		bMul.addActionListener(this);
		bDiv.addActionListener(this);
		bRes.addActionListener(this);

		p.add(b0);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(b7);
		p.add(b8);
		p.add(b9);

		p.add(bPlus);
		p.add(bMinus);
		p.add(bMul);
		p.add(bDiv);
		p.add(bRes);

		f.add(tf, BorderLayout.NORTH);
		f.add(p, BorderLayout.CENTER);

		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String tfText = tf.getText();

		if (e.getActionCommand().equals("0")) {
			System.out.println("0");

			if (tfText.equals("0")) {

			} else {
				tfText += "0";
				tf.setText(tfText);
			}
		}
		if (e.getActionCommand().equals("1")) {
			System.out.println("1");

			if (op == OP.OP_NULL) {
				if (tfText.equals("0") && (op == OP.OP_NULL)) {
					tf.setText("1");
				} else {
					tfText += "1";
					tf.setText(tfText);
				}
			} else {
				tf.setText("1");
				op = OP.OP_NULL;
			}
		}
		if (e.getActionCommand().equals("2")) {
			System.out.println("2");

			if (op == OP.OP_NULL) {
				if (tfText.equals("0") && (op == OP.OP_NULL)) {
					tf.setText("2");
				} else {
					tfText += "2";
					tf.setText(tfText);
				}
			} else {
				tf.setText("2");
				op = OP.OP_NULL;
			}
		}
		if (e.getActionCommand().equals("3")) {
			System.out.println("3");

			if (op == OP.OP_NULL) {
				if (tfText.equals("0") && (op == OP.OP_NULL)) {
					tf.setText("3");
				} else {
					tfText += "3";
					tf.setText(tfText);
				}
			} else {
				tf.setText("3");
				op = OP.OP_NULL;
			}
		}
		if (e.getActionCommand().equals("4")) {
			System.out.println("4");

			if (op == OP.OP_NULL) {
				if (tfText.equals("0") && (op == OP.OP_NULL)) {
					tf.setText("4");
				} else {
					tfText += "4";
					tf.setText(tfText);
				}
			} else {
				tf.setText("4");
				op = OP.OP_NULL;
			}
		}
		if (e.getActionCommand().equals("5")) {
			System.out.println("5");

			if (op == OP.OP_NULL) {
				if (tfText.equals("0") && (op == OP.OP_NULL)) {
					tf.setText("5");
				} else {
					tfText += "5";
					tf.setText(tfText);
				}
			} else {
				tf.setText("5");
				op = OP.OP_NULL;
			}
		}
		if (e.getActionCommand().equals("6")) {
			System.out.println("6");

			if (op == OP.OP_NULL) {
				if (tfText.equals("0") && (op == OP.OP_NULL)) {
					tf.setText("6");
				} else {
					tfText += "6";
					tf.setText(tfText);
				}
			} else {
				tf.setText("6");
				op = OP.OP_NULL;
			}
		}
		if (e.getActionCommand().equals("7")) {
			System.out.println("7");

			if (op == OP.OP_NULL) {
				if (tfText.equals("0") && (op == OP.OP_NULL)) {
					tf.setText("7");
				} else {
					tfText += "7";
					tf.setText(tfText);
				}
			} else {
				tf.setText("7");
				op = OP.OP_NULL;
			}
		}
		if (e.getActionCommand().equals("8")) {
			System.out.println("8");

			if (op == OP.OP_NULL) {
				if (tfText.equals("0") && (op == OP.OP_NULL)) {
					tf.setText("8");
				} else {
					tfText += "8";
					tf.setText(tfText);
				}
			} else {
				tf.setText("8");
				op = OP.OP_NULL;
			}
		}
		if (e.getActionCommand().equals("9")) {
			System.out.println("9");

			if (op == OP.OP_NULL) {
				if (tfText.equals("0") && (op == OP.OP_NULL)) {
					tf.setText("9");
				} else {
					tfText += "9";
					tf.setText(tfText);
				}
			} else {
				tf.setText("9");
				op = OP.OP_NULL;
			}
		}

		if (e.getActionCommand().equals("+")) {
			System.out.println("+");

			op = OP.OP_PLUS;
			opOne = OP.OP_PLUS;
			operand = Integer.parseInt(tf.getText());
			System.out.println(operand);
		}
		if (e.getActionCommand().equals("-")) {
			System.out.println("-");
		}
		if (e.getActionCommand().equals("*")) {
			System.out.println("*");
		}
		if (e.getActionCommand().equals("/")) {
			System.out.println("/");
		}
		if (e.getActionCommand().equals("=")) {
			System.out.println("=");
			
			System.out.println(operand);
			System.out.println(opOne);
			System.out.println(tf.getText());
			
			int result = 0;
			if(opOne == op.OP_PLUS) {
				result = operand + Integer.parseInt(tf.getText());
			}
			tf.setText(String.valueOf(result));
		}
	}

	public static void main(String[] args) {
		new AWTCalc();
	}
}
