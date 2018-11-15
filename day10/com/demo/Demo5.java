package com.tarena.demo;

public class Demo5 {

}
//父类如果含有空参（无参）的构造方法，则子类的构造方法
//任意编写
class Person3{
  String name;
  int age;
  Person3(){ 
  }
  Person3(String name,int age){
	this.name = name;
	this.age = age;
  }
}
class User3 extends Person3{
  String job;	
  User3(String name,int age,String job){
	this.name = name;
	this.age = age;
	this.job = job;
  }
}







