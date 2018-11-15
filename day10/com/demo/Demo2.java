package com.tarena.demo;

public class Demo2 {
  public static void main(String[] args){
	Bmw3 bmw = new Bmw3();
	bmw.name = "我的宝马";
	bmw.no = "66666666";
	bmw.price = 100;	
	bmw.color = "红色";
	bmw.speed = 200;	
	bmw.degree = 26;
	System.out.println(bmw.name+","+bmw.no
		+","+bmw.price+","+bmw.color
		+","+bmw.speed+bmw.degree);
  }
}
//设计Bmw1类
//属性：名字,车牌，价格
//设计Bmw2类
//属性：颜色,速度
//设计Bmw3类
//属性：温度
class Bmw1{
  String name;
  String no;
  double price;
}
class Bmw2 extends Bmw1{
  String color;
  int speed;
}
class Bmw3 extends Bmw2{
  int degree;
}
















