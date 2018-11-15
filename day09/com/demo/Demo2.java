package com.tarena.demo;

public class Demo2 {
  public static void main(String[] args){
//类名   对象名 = new 构造方法;
//	Emp emp = new Emp();
//Emp中编写带参数的构造方法，会覆盖系统的空参
//构造方法，new的时候，系统找不到空参的构造方法
//才报错。
//	调用带参数的构造方法，才能正常常见Emp的对象  
	Emp emp = new Emp("吕布",33);
	System.out.println(emp.name);
  }
}
//系统默认提供一个空参的构造方法，如果我们自己写了
//构造方法会覆盖系统提供的空参的构造方法
//类当中可以只有方法，也可以只有属性
class Emp{
  String name;
  int age;
//默认提供一个空参的构造方法
//Emp(){}  
  Emp(String name,int age){
	this.name = name;
	this.age = age;
  }
//覆盖系统默认的构造方法  
  
  
  
  
  
  
}