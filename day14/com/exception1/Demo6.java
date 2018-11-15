package com.tarena.exception1;

import java.util.Scanner;

public class Demo6 {
//使用try...catch方式来处理异常
//格式：
//try{
//	可能出现异常的代码
//}catch(参数){
//	语句（建议或是解释）
//}
//参数的类型：异常的数据类型
//规律：如果try当中出现了异常对象，如果异常对象
//类型跟catch参数异常类型一致，执行catch中语句。
//如果有没有异常出现，则执行try...catch后续程序
  public static void main(String[] args){
	Scanner scanner=new Scanner(System.in);
	System.out.println("请输入除数");
	int num = scanner.nextInt();
	try{
//一旦num的值为0，抛出异常
//		ArithmeticException对象		
	  int result = 10/num;	
//10/num抛出异常对象，则不执行try中之后的代码	  
	  System.out.println("result="+result);
	}catch(ArithmeticException e){
//参数的名字：默认情况都是e		
	  System.out.println("除数不能为0");
	}
	System.out.println("继续执行后续代码");
  }
	
	
}
