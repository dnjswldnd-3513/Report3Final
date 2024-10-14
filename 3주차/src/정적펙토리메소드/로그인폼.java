package 정적펙토리메소드;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class 로그인폼 extends JFrame{//또는 메인폼이 될수도 있음
	
	private static 로그인폼 form;
	
	public 로그인폼() {
		setting();
		des();
		act();
		setVisible(true);
	}
	
	JButton loginButton ;
	JTextField userFiled;
	private void act() {	
		
		loginButton.addActionListener(e -> {
			String username = userFiled.getText();
			JOptionPane.showMessageDialog(null, "환영");
		});
		
		loginButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
	}

	private void setting() {
		setTitle("로그인폼");
		setSize(300,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLayout(new FlowLayout());
	}

	private void des() {
		JLabel userLb = new JLabel("사용자이름");
		userFiled = new JTextField();
		loginButton = new JButton("로그인");
		
		add(userLb);
		add(userFiled);
		add(loginButton);
	}


	
	public static 로그인폼 get로그인() {
		if (form == null) {
			form = new 로그인폼();
		}
		return form;
	}

	public static void main(String[] args) {
		new 로그인폼();
		
	}
}
