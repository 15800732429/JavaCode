package com.tarena.demo;

public class Demo8 {
  public static void main(String[] args){
	Emp emp1 = 
		new Emp("杨幂",30,100);
	emp1.show();
	Emp emp2 =
	  new Emp("吴奇隆",42,10,true);
	emp2.show();
  }
}
//1 this:现在的，当前的
//  super：过去的，曾经的
//2 super(参数列表)：调用父类中的带参数的构造方法
//  this(参数列表)：调用当前类中的其他重载的
//	构造方法
class Emp{
  String name;
  int age;
  double salary;
  boolean marry;
  Emp(String name,int age,double salary){
	this.name = name;
	this.age = age;
	this.salary = salary;
  }
  Emp(String name,int age,double salary,
		  boolean marry){
//this(参数列表)：调用本类中其他重载的构造方法	  
	this(name,age,salary);
	this.marry = marry;
  }
//方法：显示所有的属性
  void show(){
	System.out.println(name+","+age+
	","+salary+","+marry);
  } 
}






