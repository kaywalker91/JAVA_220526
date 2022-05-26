package study0526;

import java.awt.*;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test_ActionListener extends JFrame 
{
	
	JPanel main_panel; // 버튼을 붙여질 메인 패널 선언
	JButton bt_test;
	
	public Test_ActionListener() 
	{
		setTitle("JButton 이벤트처리"); // 프레임 타이틀바 텍스트 지정
		setSize(400,200); // 프레임 크기 조정(픽셀)
		// 프레임바 우측상단에 X버튼에 대한 강제종료 기능 지정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(null);
		
		main_panel = new JPanel();
		
		bt_test = new JButton("누르시오");
		bt_test.setPreferredSize(new Dimension(100,30));
		
		// 익명(=무명)클래스로 버튼 이벤트를 추가해준다
		bt_test.addActionListener(new ButtonListener());
		
		main_panel.add(bt_test); // 패널에 버튼을 붙여준다
		
		add(main_panel); // 메인 프레임에 메인패널을 붙여주는 작업
		main_panel.setBounds(80, 50, 150, 50);	
		
		setVisible(true); // 프레임 보이게 하기
	}
	
	class ButtonListener implements ActionListener 
	{
		@Override // 익명(=무명) 클래스 부분
		public void actionPerformed(ActionEvent e) 
		{
			System.out.println("눌렸다");
			
			Frame f = new Frame("눌렸다");
			
			f.addWindowListener(new WindowAdapter() 
			{
				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
			});
			
			f.setLayout(null);
			f.setSize(300, 150);
			f.setVisible(true);
		}
	}
	
	public static void main(String[] args) 
	{
		new Test_ActionListener();
	}
}
