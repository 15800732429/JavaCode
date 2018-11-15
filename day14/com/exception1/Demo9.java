package com.tarena.exception1;

import java.util.Scanner;

public class Demo9 {
  public static void main(String[] args) throws NameOrPwdException {
//	假设用户名name是liu ，密码是123456
//	输入正确，显示用户登录成
//	输入错误，抛出自定义异常 NameOrPwdException 
//  用户名或密码错误
	Scanner sc= new Scanner(System.in);
	System.out.println("请输入用户名：");
	String name = sc.nextLine();
	System.out.println("请输入密码：");
	String pwd = sc.nextLine();
if(name.equals("liu")&&pwd.equals("123456")){
	  System.out.println("用户登录成功");	
	}else{
//登录失败：抛出异常对象（NameOrPwdException）
	  throw new 
	  		NameOrPwdException("用户名或密码错误");
	}
	
  }
}
//自定义异常：自己创建自己的异常类
//1）继承异常根类（Exception）
//2）重写Exception中的4个构造方法
//案例：设计一个异常类，表示用户名name或者密码pwd
//错误，才抛出的异常
//Scanner有一个方法nextLine():输入一个字符串并换行
class NameOrPwdException extends Exception{
	
	public NameOrPwdException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NameOrPwdException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public NameOrPwdException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public NameOrPwdException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
  	
}







