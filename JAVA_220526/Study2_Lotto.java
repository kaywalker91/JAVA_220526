package study0526;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Study2_Lotto {

	public static void main(String[] args) {
		Lotto2 g = new Lotto2();
	}
}

class Lotto2 extends Frame implements ActionListener{
	//ȭ���߾ӹ�ġ�� ���� 
	Dimension dimen, dimen1;  int xpos, ypos;
	
	//init�� ȭ�� ���� ���̾ƿ� ������...
	Label lbTitle = new Label("�ζǸ��߱�");	
	Label lbTitle2 = new Label("��ȣ�Է�");
	Label lbNum1 = new Label("���");
	Label lbNum2 = new Label("���");
	Label lbNum3 = new Label("���");
	Label lbNum4 = new Label("���");
	Label lbNum5 = new Label("���");
	Label lbNum6 = new Label("���");
	Label lb1Ment = new Label("6�� ���߸� 1�� : 10��");
	Label lb2Ment = new Label("5�� ���߸� 2�� : 1��");
	Label lb3Ment = new Label("4�� ���߸� 3�� : 1õ����");
	Label lb4Ment = new Label("3�� ���߸� 4�� : 10����");
	Label lb5Ment = new Label("2�� ���߸� 5�� : 5õ��");
	
	TextField tfNum1 = new TextField(2);
	TextField tfNum2 = new TextField(2);
	TextField tfNum3 = new TextField(2);
	TextField tfNum4 = new TextField(2);
	TextField tfNum5 = new TextField(2);
	TextField tfNum6 = new TextField(2);
	
	Button btnStart = new Button("��÷����!");
	
	//�ζ�ó���뺯��
	int myNumber[] = new int[6];  //���� �Է��� ���ڰ� ���.
	int comNumber[] = new int[6];  //�ζǴ�÷��ȣ
	
	Lotto2()
	{
		init();//ȭ�鱸��		
		center();//�߾ӹ�ġ
		start();//�̺�Ʈ
	}
	void center()
	{
		dimen = Toolkit.getDefaultToolkit().getScreenSize();
		dimen1 = this.getSize();
		xpos = (int) (dimen.getWidth() / 2 - dimen1.getWidth() / 2);
		ypos = (int) (dimen.getHeight() / 2 - dimen1.getHeight() / 2);
		this.setLocation(xpos, ypos);
	}
	void init()
	{
		this.setSize(550, 650);	
		this.setVisible(true);
		
		
		this.setLayout(null);

		
		Font font20 = new Font("SansSerif", Font.BOLD, 20);
		Font font15 = new Font("SansSerif", Font.BOLD, 15);
		Font font10 = new Font("SansSerif", Font.BOLD, 10);
		
		//Ÿ��Ʋ
		this.add(lbTitle);
		lbTitle.setBounds(210, 50, 300, 30);		
		lbTitle.setFont(font20);
		
		this.add(lbTitle2);
		lbTitle2.setBounds(50, 100, 300, 30);		
		lbTitle2.setFont(font15);
		
		this.add(tfNum1);
		tfNum1.setBounds(50, 150, 50, 30);		
		tfNum1.setFont(font15);
		
		this.add(tfNum2);
		tfNum2.setBounds(130, 150, 50, 30);		
		tfNum2.setFont(font15);
		
		this.add(tfNum3);
		tfNum3.setBounds(210, 150, 50, 30);		
		tfNum3.setFont(font15);
		
		this.add(tfNum4);
		tfNum4.setBounds(290, 150, 50, 30);		
		tfNum4.setFont(font15);
		
		this.add(tfNum5);
		tfNum5.setBounds(370, 150, 50, 30);		
		tfNum5.setFont(font15);
		
		this.add(tfNum6);
		tfNum6.setBounds(450, 150, 50, 30);		
		tfNum6.setFont(font15);
		
		this.add(lbNum1);
		lbNum1.setBounds(50, 200, 50, 30);		
		lbNum1.setFont(font15);
		
		this.add(lbNum2);
		lbNum2.setBounds(130, 200, 50, 30);		
		lbNum2.setFont(font15);
		
		this.add(lbNum3);
		lbNum3.setBounds(210, 200, 50, 30);		
		lbNum3.setFont(font15);
		
		this.add(lbNum4);
		lbNum4.setBounds(290, 200, 50, 30);		
		lbNum4.setFont(font15);
		
		this.add(lbNum5);
		lbNum5.setBounds(370, 200, 50, 30);		
		lbNum5.setFont(font15);
		
		this.add(lbNum6);
		lbNum6.setBounds(450, 200, 50, 30);		
		lbNum6.setFont(font15);
		
		
		this.add(btnStart);
		btnStart.setBounds(180, 250, 150, 50);		
		btnStart.setFont(font15);
		
		this.add(lb1Ment);
		lb1Ment.setBounds(50, 350,400, 30);		
		lb1Ment.setFont(font20);
		
		this.add(lb2Ment);
		lb2Ment.setBounds(50, 400,400, 30);		
		lb2Ment.setFont(font20);
		
		this.add(lb3Ment);
		lb3Ment.setBounds(50, 450,400, 30);		
		lb3Ment.setFont(font20);
		
		this.add(lb4Ment);
		lb4Ment.setBounds(50, 500,400, 30);		
		lb4Ment.setFont(font20);
		
		this.add(lb5Ment);
		lb5Ment.setBounds(50, 550,400, 30);		
		lb5Ment.setFont(font20);
		
	}
	void start()
	{
		btnStart.addActionListener(this);
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}	
	void dlgMent(String ment)
	{

		final Dialog dlg = new Dialog(this, "�˸���Ʈ", true);
		dlg.setLayout(null);	
		
		Font font15 = new Font("SansSerif", Font.BOLD, 15);
		Font font10 = new Font("SansSerif", Font.BOLD, 10);
		
		Label lbTitle = new Label(ment);
		
		Button bt = new Button("Ȯ��");
		Panel pp = new Panel(new FlowLayout());
		pp.add(bt);
		bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dlg.setVisible(false);
			}
		});
		
		dlg.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dlg.setVisible(false);
			}
		});
		
		dlg.add(lbTitle);
		lbTitle.setBounds(150, 50, 300, 30);		
		lbTitle.setFont(font15);	
		
		dlg.add(bt);
		bt.setBounds(150, 100, 100, 30);		
		bt.setFont(font15);
		
		
		dlg.setLocation(xpos+60, 550);
		dlg.add("South", pp);
		dlg.setSize(400, 200);
		dlg.setVisible(true);
	}
	
	void autoCom()
	{
		ing(lbNum1);
		comNumber[0]= (int)(Math.random()*45)+1;
		lbNum1.setText(comNumber[0]+"");
		
		
		ing(lbNum2);
		comNumber[1]= (int)(Math.random()*45)+1;
		lbNum2.setText(comNumber[1]+"");
		
		ing(lbNum3);
		comNumber[2]= (int)(Math.random()*45)+1;
		lbNum3.setText(comNumber[2]+"");
		
		ing(lbNum4);
		comNumber[3]= (int)(Math.random()*45)+1;
		lbNum4.setText(comNumber[3]+"");
		
		ing(lbNum5);
		comNumber[4]= (int)(Math.random()*45)+1;
		lbNum5.setText(comNumber[4]+"");
		
		ing(lbNum6);
		comNumber[5]= (int)(Math.random()*45)+1;
		lbNum6.setText(comNumber[5]+"");
	}
	void ing(Label name)
	{
		try {
			Thread.sleep(100);
		} catch (InterruptedException e1) {			
		}
		
		name.setText("...");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e1) {			
		}
		
		name.setText("..");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e1) {			
		}
		
		name.setText(".");
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e1) {			
		}
	}
	
	void spaceCheck()
	{
		if(tfNum1.getText().equals("")) {
			dlgMent("1��°���� �Է��Ͻÿ�!!!!");
			return;
		}
		else if(tfNum2.getText().equals("")) {
			dlgMent("2��°���� �Է��Ͻÿ�!!!!");
			return;
		}
		else if(tfNum3.getText().equals("")) {
			dlgMent("3��°���� �Է��Ͻÿ�!!!!");
			return;
		}
		else if(tfNum4.getText().equals("")) {
			dlgMent("4��°���� �Է��Ͻÿ�!!!!");
			return;
		}
		else if(tfNum5.getText().equals("")) {
			dlgMent("5��°���� �Է��Ͻÿ�!!!!");
			return;
		}
		else if(tfNum6.getText().equals("")) {
			dlgMent("6��°���� �Է��Ͻÿ�!!!!");
			return;
		}
	}
	public void actionPerformed(ActionEvent e) {
		
		spaceCheck(); //���� �Է��� ���� ����üũ.
			
		//�Է¼��� ����������.
		myNumber[0] = Integer.parseInt(tfNum1.getText());
		myNumber[1] = Integer.parseInt(tfNum2.getText());
		myNumber[2] = Integer.parseInt(tfNum3.getText());
		myNumber[3] = Integer.parseInt(tfNum4.getText());
		myNumber[4] = Integer.parseInt(tfNum5.getText());
		myNumber[5] = Integer.parseInt(tfNum6.getText());
	
		//��ǻ�� ���� �ߺ�üũ		
//		int idx=0;
//		while(idx<6)
//		{
//			while(true)
//			{
//							
//					int randNum = (int)(Math.random()*45)+1;
//					
//					System.out.println("idx : " + idx);
//					System.out.println("randNum : " + randNum);
//					System.out.println("comNumber["+idx+"]:"+comNumber[idx]);
//										
//					if(comNumber[idx] != randNum) 
//					{
//						comNumber[idx] = randNum;
//						System.out.println("comNumber["+idx+"]:"+comNumber[idx]);	
//					
//											
//						break;
//					}				
//				
//				
//			}
//			idx++;
//		}
//		for(int i=0; i< 6; i++)
//		{
//			System.out.println(comNumber[i]);
//		}
		
		
		
		autoCom();//��ȣ ����
		

		
		
		
		
		
	}
	
}

