package com.tarena.demo;

public class Demo1 {
//alt+/:eclipse提示键，会自动给我们创建一些
//固定的代码，比如main方法	
  public static void main(String[] args) {
//1 直接定义抽象类的子类，然后创建抽象类子类的对象
	Benz benz =new Benz("刘老师奔驰",0);
//	  定义                   创建对象
	benz.start();
	benz.run();
	benz.stop();
//2 父类声明指向子类对象:
//	父类定义对象，之后由子类来创建对象（new对象）
	Car benz2 = new Benz("孔老师奔驰",0);
//  父类  对象名 = new 子类的构造方法 
	benz2.start();
	benz2.run();
	benz2.stop();
	
  }
}
//父类声明指向子类对象
abstract class Car{//父类
  String name;
  int speed;
//定义3个抽象方法：启动，行驶，刹车
  abstract void start();
  abstract void run();
  abstract void stop();
}
class Benz extends Car{
//抽象类的子类，实现抽象Car所有的抽象方法	
	Benz(String name,int speed){
	  this.name = name;
	  this.speed = speed;
	}
	@Override
	void run() {
System.out.println(name+"行驶，速度是"+speed);	
	}
	@Override
	void start() {
	  speed = 100;
	  System.out.println(name+"启动了");
	}
	@Override
	void stop() {
	  speed = 0;
System.out.println(name+"刹车,速度是"+speed);
	}
	
}







