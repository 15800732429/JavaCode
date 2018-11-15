package com.tarena.demo;

public class Demo3 {
  public static void main(String[] args){
	
	AddCount count = new AddCount();
//	count.add4(16, 18);
//	count.add1(16.1, 18.6);
//	count.add2(12.1, 10);
//	count.add3(10, 11.1);
//作为用户，需要记住4个方法名字，还要记住参数的类型
//及先后顺序，很麻烦
//利用方法重载：同一个类的内部，方法名相同，参数不同
//就可以减少用户的记忆量，把这4个方法的名字，全部
//改为add
	count.add(12.1, 10);
	count.add(12,10);
	count.add(200.1,111.1);
	
//现在修改AddCount类以后，用户只需要记住add方法
//这一个名字，而且不需要记住任何的两个参数的类型
//直接输入2个参数的值，就可以执行加法运算了	
  }
}
//设计加法运算器(AddCount)
//执行2个数的加法运算
//add1,add2,add3,add4这四个方法全是加法运算
//功能很相似，参数不同
class AddCount{
// 1 两个整数
  void add(int num1,int num2){
	int sum = num1 + num2;
	System.out.println(sum);
  }
// 2 第1个数double，第2个数int
  void add(double num1,int num2){
	double sum = num1 + num2;
	System.out.println(sum);
  }
// 3 第1个数int，第2个数double
  void add(int num1,double num2){
	double sum = num1 + num2;
	System.out.println(sum);
  }
// 4 两个数全是double
  void add(double num1,double num2){
	double sum = num1 + num2;
	System.out.println(sum);
  }

  
  
  
	
}