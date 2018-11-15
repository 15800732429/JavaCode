package com.tarena.demo;

public class Demo2 {
  public static void main(String[] args) {
	Person p1 = new Person();
	p1.name ="霍去病";
	System.out.println(p1.name);
	p1.name = "张永";
	System.out.println(p1.name);
//	p1.age = 33;
//	final修饰的属性，初始化以后不能再被修改
	System.out.println(p1.age);
  }
}
//final：最终的，最后的
//1 final修饰类，属性，方法，而且可以用final来创建
//java中的常量
//2 final修饰的属性，其值初始化，不可以再改变
class Person{
  String name;
  final int age = 18;//第1次赋值，初始化
}