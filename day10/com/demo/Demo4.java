package com.tarena.demo;

public class Demo4 {
  public static void main(String[] args){
	User2 user2 =
	  new User2("林彪",31,"北京");
	user2.show();
  }
}
//1 父类中只含有带参数的构造方法，则子类的构造方法中
//必须要调用父类中带参数的构造方法，java中的硬性
//语法规则
//2 super：关键字，过去的，曾经的
//  super(参数列表):调用父类的构造方法
class Person2{
  String name;
  int age;
  Person2(String name,int age){
	this.name = name;
	this.age = age;
  }//Person2中，只有带参数的构造方法  
}

class User2 extends Person2{
  String address;
//在子类构造方法中调用父类中的带参数的构造方法
  User2(String name,int age,String address){
	super(name,age);
	this.address = address;
  }
  void show(){
System.out.println(name+","+age+","+address);
  }
}













