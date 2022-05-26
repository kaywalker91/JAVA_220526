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
	
	JPanel main_panel; // ��ư�� �ٿ��� ���� �г� ����
	JButton bt_test;
	
	public Test_ActionListener() 
	{
		setTitle("JButton �̺�Ʈó��"); // ������ Ÿ��Ʋ�� �ؽ�Ʈ ����
		setSize(400,200); // ������ ũ�� ����(�ȼ�)
		// �����ӹ� ������ܿ� X��ư�� ���� �������� ��� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(null);
		
		main_panel = new JPanel();
		
		bt_test = new JButton("�����ÿ�");
		bt_test.setPreferredSize(new Dimension(100,30));
		
		// �͸�(=����)Ŭ������ ��ư �̺�Ʈ�� �߰����ش�
		bt_test.addActionListener(new ButtonListener());
		
		main_panel.add(bt_test); // �гο� ��ư�� �ٿ��ش�
		
		add(main_panel); // ���� �����ӿ� �����г��� �ٿ��ִ� �۾�
		main_panel.setBounds(80, 50, 150, 50);	
		
		setVisible(true); // ������ ���̰� �ϱ�
	}
	
	class ButtonListener implements ActionListener 
	{
		@Override // �͸�(=����) Ŭ���� �κ�
		public void actionPerformed(ActionEvent e) 
		{
			System.out.println("���ȴ�");
			
			Frame f = new Frame("���ȴ�");
			
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
