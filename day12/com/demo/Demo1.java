package com.tarena.demo;

public class Demo1 {
  public static void main(String[] args) {
	Foo f1 = new Foo();
	Foo f2 = new Foo();
	Foo f3 = new Foo();
  }
}
//静态代码块：使用static修饰的代码块就是静态代码块
//不管创建该类多少个对象，只执行一次
class Foo{
  static {
	System.out.println("夜空中最亮的星星");
	System.out.println("假如");
  }
}