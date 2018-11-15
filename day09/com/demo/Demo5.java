package com.tarena.demo;

public class Demo5 {
  public static void main(String[] args){
    Customer c1 = new Customer("典韦",33);
    c1.show();
    Customer c2 = 
new Customer("张任",35,"成都",10,"跟刘备干到底");
    c2.show();
    Customer c3 = 
    new Customer("荀彧",65,"陈留");
    c3.show();
  }
}
//构造方法重载：构造方法也可以方法重载
//当创建对象的时候（new），可以根据构造方法参数
//不同，来创建对应的对象
//案例：
//设计一个Customer
//属性：姓名，年龄，地址，金额，职业
//构造方法：
//1） 给姓名，年龄属性赋值
//2） 给所有的属性赋值
//3） 给姓名，年龄，地址属性赋值
//方法：
//show：显示所有的属性
class Customer{
  String name;//姓名
  int age;//年龄
  String address;//地址
  double money;//金额
  String job;//职业
  Customer(String name,int age){
	this.name = name;
	this.age = age;
  }
  Customer(String name,int age,
String address,double money,String job){
	this.name = name;
	this.age = age;
	this.address = address;
	this.money = money;
	this.job = job;
  }
  Customer(String name,int age,
		  String address){
	this.name = name;
	this.age = age;
	this.address = address;
  }
//显示所有的属性
  void show(){
	System.out.println("姓名："+name);
	System.out.println("年龄："+age);
	System.out.println("地址："+address);
	System.out.println("金额："+money);
	System.out.println("职业："+job);
  }
}





