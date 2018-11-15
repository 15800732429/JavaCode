package com.tarena.demo;

public class Demo6 {
  public static void main(String[] args){
	Taxi taxi = new Taxi();
	System.out.println("name的值："+
			taxi.name);
  }
}
//变量的隐藏（变量的覆盖）：子类的属性会覆盖父类继承
//过来的同名的属性。
class Car1{
  String name="car1";
}
class Taxi extends Car1{
//子类Taxi中的name属性的名字跟父类Car1中
//继承过来的name属性一致，子类name属性会
//覆盖父类中继承过来的属性	
  String name="taxi";
}
