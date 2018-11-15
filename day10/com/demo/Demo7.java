package com.tarena.demo;

public class Demo7 {
  public static void main(String[] args){
	Bmw5 bmw = 
new Bmw5("宝马","蓝色",100,"001",0,"老师专用版");
	bmw.show();
  }
}
//1 方法重写（方法覆盖）：子类的方法覆盖父类中继承
//过来的同名的方法
//2 方法重写侧重点：
//1）子类的方法和父类的方法的名字和参数列表必须一致
//2）方法重写发生在子类和父类之间

//案例：
//设计父类Car2
//属性：名字，颜色，价格，车牌
//构造方法： 无参构造方法
//        带所有参数的构造方法
//方法：显示Car中的所有的属性
class Car2{
  String name;
  String color;
  double price;
  String no;
  Car2(){}
  Car2(String name,String color,
		      double price,String no){
	this.name = name;
	this.color = color;
	this.price = price;
	this.no = no;
  }
  void show(){
	System.out.println("父类Car2的show："
			+name+","+color
	      +","+price+","+no);
  }
}
//设计子类Bmw5（Car2的子类）
//属性：名字，颜色，价格，车牌，速度，类型
//构造方法：带所有参数的构造方法
//方法：显示Bmw5所有的属性(方法的重写)
class Bmw5 extends Car2{
  int speed;
  String type;
  Bmw5(String name,String color,
   double price,String no,int speed,
   String type){
//	调用父类Car2中带参数的构造方法（简便）  
	super(name,color,price,no);
	this.speed = speed;
	this.type = type;
  }
//重写show方法
//子类中的show方法，覆盖了父类Car2继承过来show
  void show(){
	System.out.println("子类重写父类show："
	  +name+","+color+","+price+","
	  +no+","+speed+","+type);
  }
}









