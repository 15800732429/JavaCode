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
	button1 = new JButton("刘备");
	button2 = new JButton("孔明");
	button3 = new JButton("关羽");
	this.setLayout(new FlowLayout());
	this.add(button1);
	this.add(button2);
	this.add(button3);
//在button1,button2,button3上添加监听器
//this:当前类的对象（SanGuo3实现了
//ActionListener接口）	
	button1.addActionListener(this);
	button2.addActionListener(this);
	button3.addActionListener(this);
//展现窗体
	this.setVisible(true);
	this.setDefaultCloseOperation(
	  JFrame.EXIT_ON_CLOSE);
	this.setSize(300,100);	
  }
  @Override
  public void actionPerformed(ActionEvent e) {
//点击”刘备“	，主公，我来了
//点击”孔明“	， 军师，我来了
//点击”关羽“  ， 关二哥，我来了	
//	1）确定点击按钮的名字
	String name = e.getActionCommand();
//	2） if语句
	if("刘备".equals(name)){
	  System.out.println("主公，我来了");
	}else if("孔明".equals(name)){
	  System.out.println("军师，我来了");
	}else if("关羽".equals(name)){
	  System.out.println("关二哥，我来了");
	}
  }
	
}