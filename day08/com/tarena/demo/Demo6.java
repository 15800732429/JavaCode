package com.tarena.demo;

public class Demo6 {
  public static void main(String[] args){
	Person2 p1 = new Person2();
//new Person2():自动调用Person2中构造方法
	p1.name = "张居正";
	p1.sex = "男";
	p1.age = 60;
	p1.show();
  }
	
}
//构造方法：创建对象的同时，执行一些初始化的操作
//1 构造方法格式：
//类名(参数列表){
//	方法体语句
//}	
//2 构造方法没有任何的返回值，所以方法体语句中不要
//含有return语句
//3 创建对象的标准的格式：
//	类名  对象名 = new 构造方法;
//4 构造方法是在new对象的时候，被调用，仅仅是执行
//	一些初始化的操作
//设计人类：Person
//属性：姓名，年龄，性别
//构造方法：输出一句话，创建该Person类的对象
//方法：显示所有的属性值
//同一个包下，类名一定不能重复
class Person2{
//  属性
	String name;//姓名
	int age;//年龄
	String sex;//性别
//	构造方法
	Person2(){
 System.out.println("创建该Person类的对象");
	}
//	方法
	void show(){
System.out.println(name+","+sex+","+age);
	}
}













