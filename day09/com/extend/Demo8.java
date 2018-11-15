package com.tarena.extend;

public class Demo8 {
  public static void main(String[] args){
	Manager manager = new Manager();
	manager.name = "刘";
	manager.address="北京";
	manager.age = 22;
	manager.job = "产品经理";
	manager.phone="13552329647";
	manager.salary = 999999999;
	manager.show();
  }
}
//继承：子类继承父类的属性和方法
//格式:
//class 子类名 extends 父类名
//案例：
//设计一个父类Worker
//属性：姓名，年龄，工资，地址
//方法：显示所有的属性：姓名，年龄，工资，地址
class Worker {
  String name;
  int age;
  double salary;
  String address;
  void show(){
	System.out.println(name+","+age+","
	+salary+","+address);  
  }
}
class Manager extends Worker{
  String phone;
  String job;
}
//设计一个子类Manager
//属性：姓名，年龄，工资，地址，电话，职位
//方法：显示的属性：姓名，年龄，工资，地址








