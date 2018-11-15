package com.tarena.exception1;

public class Demo5 {
//java中所有的异常情况分为2类
//1）错误：Error,一旦出现无法处理，非常严重，java
//	是健壮语言，Error出现的概率极少
//2）异常：Exception,程序出现“意外”的情况，可以
//	找出异常，而且根据异常提示信息，进而修改代码，
//	避免异常的再次出现
  public static void main(String[] args) {
	int num1 = 10;
	double result = num1/0;//抛出异常（对象）
//当除数为0的时候，抛出异常对象，终止程序
//而且在异常信息中，有异常产生原因的提示/ by zero	
	System.out.println("result="+result);
  }
}
