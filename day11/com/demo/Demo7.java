package com.tarena.demo;

public class Demo7 {
  public static void main(String[] args) {
	Foo f1 = new Foo();
	System.out.println();
	Foo f2 = new Foo();
	System.out.println();
	Foo f3 = new Foo();
  }
}
//代码块：就是类中用{}括起来一段代码，每次创建
//该类的对象的时候，都会默认去调用
//代码块：早期用代码块来执行一些初始化的操作，现在
//基本都构造方法给取代了
class Foo{
  {
	System.out.println("NBA没有了");
	System.out.println("世界杯踢完了");
	System.out.println("安心的学习吧！！！");
  }	
	
}