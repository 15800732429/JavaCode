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
//  20按钮，1个文本框，中部区域是网格布局（5,4）
//	1个JPanel
  JTextField jtf ;
  JButton[] buttons = new JButton[20];
  JPanel jp1;
  
  Computer(){
	jp1 = new JPanel();
//设计中部区域jp1布局，网格布局（5,4）
	jp1.setLayout(new GridLayout(5,4));
//设置String[],用来保存20个按钮的名字
//	静态数组，直接初始化操作
	String[] strs ={
	"Back","CE","C","+",
	"7","8","9","-",
	"4","5","6","*",
	"1","2","3","/",
	"0","+/-",".","="};
//创建JButton按钮对象，并把按钮对象设置（添加）到
//jp1上	
	for(int i=0;i<buttons.length;i++){
	  buttons[i]=new JButton(strs[i]);
	  jp1.add(buttons[i]);
//为20个按钮添加监听器
	  buttons[i].addActionListener(this);
	}
//设置JFrame的布局，设置边界布局，北部放的
//jtf，中部区域jp1
	this.setLayout(new BorderLayout());
	jtf = new JTextField(20);
	this.add(jtf, BorderLayout.NORTH);
	this.add(jp1,BorderLayout.CENTER);
//展现窗体
	this.setSize(300, 200);
	this.setDefaultCloseOperation(
			JFrame.EXIT_ON_CLOSE);
	this.setVisible(true);	
  }
  @Override
  public void actionPerformed(ActionEvent e) {
//  获得按钮的名字
	String name = e.getActionCommand();   
//1 点击按钮0~9，可以把数字准确显示到当前
//	  jtf（文本框）上
//	1)第1次点击数字，直接显示到jtf上，以后点击
//	数字，往后追加
//	2)如何判断，name的内容是数字
//	"0123456789".indexof(name) == -1
//	点击的按钮name内容不是数字
	if("0123456789".indexOf(name)!=-1){
//  是数字
//	 获得jtf中原有的内容
	  String temp = jtf.getText();
//	 如果temp为null，则直接设置name值
	  if(temp==null){
		jtf.setText(name);  
	  }
//	 反之，追加（temp+name）  
	  else{
		jtf.setText(temp+name);
	  }
	}
//2 点击”.“，小数
	else if(".".equals(name)){
	  String temp = jtf.getText();
	  jtf.setText(temp+".");
	}
	
	  
	  
  }
	
}