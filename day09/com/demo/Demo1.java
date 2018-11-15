package com.tarena.demo;

public class Demo1 {
  public static void main(String[] args){
	Person p1=new Person("刘邦",23,"长安");
	p1.show();
  }
}
//1 this：当前的
//this.属性名 ：当前对象的属性
//2 企业开发中利用构造方法给属性赋值的标准格式：
//构造方法中形参的名字必须跟类中属性名一致

//案例：设计一个Person类
//属性：姓名，年龄，地址
//构造方法：创建对象的时候，给姓名，年龄，地址三个
//属性赋值
//方法：显示当前Person类中所有的属性
class Person{
  String name;
  int age;
  String address;
//	构造方法
Person(String name,int age,String address){
	this.name = name;
	this.age = age;
	this.address = address;
//	  属性                           形参
  }//	方法
  void show(){
	System.out.println(name+","+age+","+address);
  }
}




