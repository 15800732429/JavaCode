package com.tarena.demo;

public class Demo4 {
  public static void main(String[] args){
	Car car1 = new Car();
	car1.name = "哥的宝马";
	car1.no = "123456789";
	car1.price = 100;
	car1.start();
	car1.run();
	car1.stop();
	Car car2 = new Car();
	car2.name = "孔老师的QQ";
	car2.no = "6666666";
	car2.price = 99999;
	car2.start();
	car2.run();
	car2.stop();
	
  }
}
//设计一个车类型（Car）
//属性：名字，车牌，价格，速度
//方法：启动，行驶，刹车
class Car{
//  属性：
  String name;//名字
  String no;//车牌号
  double price;//价格
  double speed = 0;//速度，默认值，所有Car的对象
//刚开始创建的时候，速度都默认是0 
//  方法：启动（speed）
  void start(){
	speed = 100;
	System.out.println(name+"启动了");
  }
  void run(){//行驶
	System.out.println(name+"正在行驶" +
		"当前的速度是"+speed); 
  }
  void stop(){//刹车：speed为0
	speed = 0;
	System.out.println(name+"刹车了，" +
		"当前的速度是"+speed);
  }
  
  
}





