package com.tarena.interface1;

public class Demo7 {
  public static void main(String[] args) {
//可以通过接口的实现类，来创建对象，并执行其方法	
	Bmw bmw = new Bmw();
	bmw.start();
	bmw.run();
	bmw.stop();
//父类声明指向子类对象
//接口定义对象，实现类创建该对象
//格式：接口 对象名 = new 实现类的构造方法
//对象只能调用实现类中实现（重写）接口的方法，不能调用
//实现类中独有的方法
//接口很像抽象类，但不是
	Car car1 = new Bmw();
	car1.start();
	car1.run();
	car1.stop();
//	car1.show();//不能调用实现类独有的方法
	
  }
}
//接口：特殊的数据类型，跟类对应的
//1 内部结构：常量和抽象方法
//2 接口的格式：
//interface 接口名{
//  常量（可以简写）
//  抽象方法（可以简写）
//}
  interface Car{
//	常量
	public static final 
					String COLOR="蓝色";
	int PRICE = 500;
//	抽象方法
	public abstract void start();
	void run();
	void stop();
  }
  class Bmw implements Car{
	@Override
	public void run() {
	  System.out.println("行驶");
	}
	@Override
	public void start() {
	  System.out.println("启动");	
	}
	@Override
	public void stop() {
	  System.out.println("刹车");	
	}
	void show(){
	  System.out.println(Car.COLOR);
	  System.out.println(Car.PRICE);
	}
  }





