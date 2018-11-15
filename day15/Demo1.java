package com.tarena.factory;

import java.util.Scanner;

public class Demo1 {
//工厂模式：创建一个类，专门给别人提供对象
  public static void main(String[] args) {
//利用工厂模式来创建对象，不再需要自己去new对象	
//	Car bmw = CarFactory.getInstance();
//	bmw.start();
//	bmw.run();
//	bmw.stop();
	  
//根据用户从控制台输入不同的参数，来提供不同Car对象
  	 Scanner sc = new Scanner(System.in);
  	 System.out.println("请输入您要用的车：");
  	 int num = sc.nextInt();
  	 Car car = CarFactory.getInstance(num);
  	 car.start();
  	 car.run();
  	 car.stop();
  }
}
class CarFactory{
//静态方法，方便调用
//分析：通过参数，来确定到底创建哪种Car接口
//的实现类对象	
public static Car getInstance(int type){
	Car car = null;
	if(type==1){
	  car = new Bmw();
	}else if(type==2){
	  car = new Taxi();
	}else if(type==3){
	  car = new QQ();	
	}
	return car;
  }
}

interface Car{
  void start();
  void run();
  void stop();
}
class QQ implements Car{
	@Override
	public void run() {
	  System.out.println("QQ行驶");
	}
	@Override
	public void start() {
	  System.out.println("QQ启动");
	}
	@Override
	public void stop() {
	  System.out.println("QQ刹车");
	}
}
class Taxi implements Car{
	@Override
	public void run() {
	  System.out.println("出租车在行驶");
	}
	@Override
	public void start() {
	  System.out.println("出租车启动");
	}
	@Override
	public void stop() {
	  System.out.println("出租车刹车");
	}
	
}
class Bmw implements Car{
	@Override
	public void run() {
	  System.out.println("Bmw车在行驶");	
	}
	@Override
	public void start() {
	  System.out.println("Bmw车启动");
	}
	@Override
	public void stop() {
	  System.out.println("Bmw车刹车");	
	}
	
}