package com.tarena.gui2;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class Demo10 {
  public static void main(String[] args) {
	new  Computer();
  }
}
class Computer extends JFrame 
     implements ActionListener{
//  20��ť��1���ı����в����������񲼾֣�5,4��
//	1��JPanel
  JTextField jtf ;
  JButton[] buttons = new JButton[20];
  JPanel jp1;
  
  Computer(){
	jp1 = new JPanel();
//����в�����jp1���֣����񲼾֣�5,4��
	jp1.setLayout(new GridLayout(5,4));
//����String[],��������20����ť������
//	��̬���飬ֱ�ӳ�ʼ������
	String[] strs ={
	"Back","CE","C","+",
	"7","8","9","-",
	"4","5","6","*",
	"1","2","3","/",
	"0","+/-",".","="};
//����JButton��ť���󣬲��Ѱ�ť�������ã���ӣ���
//jp1��	
	for(int i=0;i<buttons.length;i++){
	  buttons[i]=new JButton(strs[i]);
	  jp1.add(buttons[i]);
//Ϊ20����ť��Ӽ�����
	  buttons[i].addActionListener(this);
	}
//����JFrame�Ĳ��֣����ñ߽粼�֣������ŵ�
//jtf���в�����jp1
	this.setLayout(new BorderLayout());
	jtf = new JTextField(20);
	this.add(jtf, BorderLayout.NORTH);
	this.add(jp1,BorderLayout.CENTER);
//չ�ִ���
	this.setSize(300, 200);
	this.setDefaultCloseOperation(
			JFrame.EXIT_ON_CLOSE);
	this.setVisible(true);	
  }
  @Override
  public void actionPerformed(ActionEvent e) {
//  ��ð�ť������
	String name = e.getActionCommand();   
//1 �����ť0~9�����԰�����׼ȷ��ʾ����ǰ
//	  jtf���ı�����
//	1)��1�ε�����֣�ֱ����ʾ��jtf�ϣ��Ժ���
//	���֣�����׷��
//	2)����жϣ�name������������
//	"0123456789".indexof(name) == -1
//	����İ�ťname���ݲ�������
	if("0123456789".indexOf(name)!=-1){
//  ������
//	 ���jtf��ԭ�е�����
	  String temp = jtf.getText();
//	 ���tempΪnull����ֱ������nameֵ
	  if(temp==null){
		jtf.setText(name);  
	  }
//	 ��֮��׷�ӣ�temp+name��  
	  else{
		jtf.setText(temp+name);
	  }
	}
//2 �����.����С��
	else if(".".equals(name)){
	  String temp = jtf.getText();
	  jtf.setText(temp+".");
	}
	
	  
	  
  }
	
}