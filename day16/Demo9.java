package com.tarena.gui2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Demo9 {
  public static void main(String[] args) {
    new MyText();
  }
}

class MyText extends JFrame 
   		implements ActionListener{
   JButton button1;
   JButton button2;
   JTextField jtf;
   MyText(){
	 button1 = new JButton("��������");
	 button2 = new JButton("�������");
	 jtf = new JTextField(20);
	 
	 this.setLayout(new FlowLayout());
	 this.add(button1);
	 this.add(button2);
	 button1.addActionListener(this);
	 button2.addActionListener(this);
	 this.add(jtf);
	 
	 this.pack();//�Զ����ô���Ĵ�С
	 this.setVisible(true);
	 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   @Override
   public void actionPerformed(ActionEvent e) {
//���2����ť��1���ı���ÿ�ε����ť����Ѱ�ť
//���֣���ʾ���ı����У���1�ε����ֻ��ʾ��ǰ���
//��ť�����֣���2�ο�ʼ�������ѵ����ť������
//�����ۼ�
//	1 �����¼�Դ��button1��button2��
//	2 ���������¼�Դ��ͨ����ť�����֣�
	String name = e.getActionCommand();
//	3 ��дif 
	if("��������".equals(name)){
//	4 ��ǰ�ı������Ƿ�������
//	 1���еĻ���׷�ӣ��Ѹոյ����ť������׷��һ�£�
//	 2��û�У�ֱ����ʾ�ı����м���	
//jtf.getText():��õ�ǰ�ı����е�����
	  String temp= jtf.getText();
	  if(temp!=null){
		jtf.setText(temp+name); 
	  }else{
		jtf.setText(name);
	  }
	}else if("�������".equals(name)){
	  String temp = jtf.getText();
	  if(temp!=null){
		jtf.setText(temp+name);  
	  }else{
		jtf.setText(name);
	  }
		
	}

	   
   }
	
}