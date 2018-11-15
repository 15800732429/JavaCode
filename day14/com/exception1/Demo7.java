package com.tarena.exception1;

import java.util.Scanner;

public class Demo7 {
  public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("请输入一个参数：");
	try{
	  int num = scanner.nextInt();
	  double result = 10/num;
	  
	  String str = null;
	  str.substring(6);
	}catch(NullPointerException e){
//e：指代抛出异常对象
	  e.printStackTrace();
//打印异常堆栈信息，而且更方便的找出异常出现的位置	
	}catch(ArithmeticException e){
	  e.printStackTrace();
	}
  }
}
//NullPointerException:空指针异常，这种
//要调用对象不存在（null对象不存在）
//try的后面可以接多个catch语句，一个try可以抛出
//多种异常对象，只要有一个异常对象能被catch截获
//（异常对象的类型跟catch中参数的异常类型一致），
//就会执行对应catch语句







