package com.tarena.demo;

public class Demo6 {
  public static void main(String[] args) {
	Worker w1 = new Worker("卫青",32);
	Worker w2 = new Worker("项羽",34);
	Worker w3 = new Worker("蓝玉",36);
	Worker w4 = new Worker("黄汉升",33);
	Worker w5 = new Worker("甘兴霸",32);
	Worker w6 = new Worker("秦琼",36);
//	调用Worker类中getMoney这个静态方法
	Worker.getMoney();
  }
}
//静态方法：用static修饰的方法，称为静态方法
//访问方式：类名.静态方法名访问（或对象名.
//静态方法名）
//案例：设计一个Worker(类)
//属性：名字，年龄，
//     人数（静态属性）
//构造方法：给名字，年龄赋值，统计中的人数
//方法:静态方法，统计工资的总数，人数*月薪（10000）
class Worker{
  String name;
  int age;
  static int num=0;
  Worker(String name,int age){
	this.name = name;
	this.age = age;
	num++;
//每次创建新的Worker对象的时候，num加1
  }
//静态方法定义的格式：
//static 返回值类型 方法名(参数列表){
//    方法体
//}
  static void getMoney(){
	double result = num*10000;
	System.out.println("总的工资支出："+result);
  }
  
  
  
}





