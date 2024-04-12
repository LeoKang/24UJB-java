package d0411.p40;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldTest {
	private Frame f;
//	private TextField tfMsg;
	private Button b;
	private String LOGIN_ID = "green";
	private String LOGIN_PWD = "ujb1234";

	public TextFieldTest() {
		f = new Frame("Login");
		f.setSize(400, 110);
		f.setLayout(new FlowLayout());

		Label lid = new Label("ID : ", Label.RIGHT);
		Label lpwd = new Label("PW : ", Label.RIGHT);

		TextField id = new TextField(10);
		TextField pwd = new TextField(10);
		pwd.setEchoChar('*');
	
		TextField tfMsg = new TextField(50);
		
		b = new Button("Login");
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String inpId = id.getText();
				String inpPwd = pwd.getText();
				System.out.println(inpId + " / " + inpPwd);
				
				if(inpId.equals(LOGIN_ID) && inpPwd.equals(LOGIN_PWD)) {
					tfMsg.setText("로그인이 성공 했습니다. 추카추카");
				}else {
					tfMsg.setText("로그인이 실패 했습니다.");
				}
			}
		});

		f.add(lid);
		f.add(id);
		f.add(lpwd);
		f.add(pwd);
		f.add(b);
		f.add(tfMsg);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new TextFieldTest();
	}
}
