package com.tarena.demo;
public class Demo1 {
  public static void main(String[] args){
	Foo4 foo4 = new Foo4();
	System.out.println(foo4.f1);
	System.out.println(foo4.f2);
	System.out.println(foo4.f3);
	System.out.println(foo4.f4);
  }
}
//java中单继承：一个子类只能有一个直接的父类，但可以
//层层继承。
//Foo泛指一个类
class Foo1{
   int f1 = 11;
}
class Foo2 extends Foo1{
// int f1 = 11;	
   int f2 = 12;
}
class Foo3 extends Foo2{
   int f3 = 13;	
}
class Foo4 extends Foo3{
//Foo4会继承之前所有的属性和方法
   int f4 = 16;
}



