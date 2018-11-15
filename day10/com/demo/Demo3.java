package com.tarena.demo;

public class Demo3 {
  public static void main(String[] args){
	User1 user = 
		new User1("卢象升",30,"男");
	user.show();
  }
}
//父类中有无参的构造方法，子类可以任意的编写自己的
//构造方法
class Person1{
  String name;
  int age;
//系统会默认提供一个"空参"的构造方法  
  Person1(){}//覆盖系统提供的空参构造方法
}
class User1 extends Person1{
  String sex;
  User1(String name,int age,String sex){
	this.name = name;
	this.age = age;
	this.sex = sex;
  } 
  void show(){
	System.out.println(name+","+age+","
			+sex);
  }
}

