package com.tarena.gui2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Demo8 {
  public static void main(String[] args) {
	new SanGuo3();
  }
}
class SanGuo3 extends JFrame 
			implements ActionListener{
  JButton button1;
  JButton button2;
  JButton button3;
  SanGuo3(){
	button1 = new JButton("����");
	button2 = new JButton("����");
	button3 = new JButton("����");
	this.setLayout(new FlowLayout());
	this.add(button1);
	this.add(button2);
	this.add(button3);
//��button1,button2,button3����Ӽ�����
//this:��ǰ��Ķ���SanGuo3ʵ����
//ActionListener�ӿڣ�	
	button1.addActionListener(this);
	button2.addActionListener(this);
	button3.addActionListener(this);
//չ�ִ���
	this.setVisible(true);
	this.setDefaultCloseOperation(
	  JFrame.EXIT_ON_CLOSE);
	this.setSize(300,100);	
  }
  @Override
  public void actionPerformed(ActionEvent e) {
//�����������	��������������
//�����������	�� ��ʦ��������
//���������  �� �ض��磬������	
//	1��ȷ�������ť������
	String name = e.getActionCommand();
//	2�� if���
	if("����".equals(name)){
	  System.out.println("������������");
	}else if("����".equals(name)){
	  System.out.println("��ʦ��������");
	}else if("����".equals(name)){
	  System.out.println("�ض��磬������");
	}
  }
	
}