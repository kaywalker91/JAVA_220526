package study0526;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test2_ActionListener extends JFrame 
{
	
	JPanel main_panel; // ��ư�� �ٿ��� ���� �г� ����

	JButton bt_test;
	
	public Test2_ActionListener() 
	{
		setTitle("JButton �̺�Ʈó��"); // ������ Ÿ��Ʋ�� �ؽ�Ʈ ����
		setSize(400,200); // ������ ũ�� ����(�ȼ�)
		// �����ӹ� ������ܿ� X��ư�� ���� �������� ��� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		main_panel = new JPanel(); // �г� ��üȭ / �⺻��ġ������ FlowLayout
		
		bt_test = new JButton("�����ÿ�");
		bt_test.setPreferredSize(new Dimension(100,50));
		
		// �͸�(=����)Ŭ������ ��ư �̺�Ʈ�� �߰����ش�
		bt_test.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				System.out.println("���ȴ�");
			}
		});
		
		main_panel.add(bt_test); // �гο� ��ư�� �ٿ��ش�
		
		add(main_panel); // ���� �����ӿ� �����г��� �ٿ��ִ� �۾�
		
		setVisible(true); // ������ ���̰� �ϱ�
	}
	
	public static void main(String[] args) 
	{
		new Test2_ActionListener();
	}
}
