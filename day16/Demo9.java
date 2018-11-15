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
	 button1 = new JButton("东方不败");
	 button2 = new JButton("独孤求败");
	 jtf = new JTextField(20);
	 
	 this.setLayout(new FlowLayout());
	 this.add(button1);
	 this.add(button2);
	 button1.addActionListener(this);
	 button2.addActionListener(this);
	 this.add(jtf);
	 
	 this.pack();//自动设置窗体的大小
	 this.setVisible(true);
	 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   @Override
   public void actionPerformed(ActionEvent e) {
//设计2个按钮和1个文本框，每次点击按钮，会把按钮
//名字，显示到文本框中，第1次点击，只显示当前点击
//按钮的名字，第2次开始点击，则把点击按钮的名字
//往后累加
//	1 两个事件源（button1，button2）
//	2 区分两个事件源（通过按钮的名字）
	String name = e.getActionCommand();
//	3 编写if 
	if("东方不败".equals(name)){
//	4 当前文本框中是否有内容
//	 1）有的话，追加（把刚刚点击按钮的名字追加一下）
//	 2）没有，直接显示文本框中即可	
//jtf.getText():获得当前文本框中的内容
	  String temp= jtf.getText();
	  if(temp!=null){
		jtf.setText(temp+name); 
	  }else{
		jtf.setText(name);
	  }
	}else if("独孤求败".equals(name)){
	  String temp = jtf.getText();
	  if(temp!=null){
		jtf.setText(temp+name);  
	  }else{
		jtf.setText(name);
	  }
		
	}

	   
   }
	
}