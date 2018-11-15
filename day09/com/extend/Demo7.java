package com.tarena.extend;

public class Demo7 {
  public static void main(String[] args){
	Teacher t1 = new Teacher();
//t1中name，sex,age都是来自于父类中继承过来
//的属性	
	t1.name = "刘";
	t1.sex = "男";
	t1.age = 35;
//salary,address都是子类Teacher独有的	
	t1.salary = 10000000;
	t1.address = "上海";
	t1.show();//父类继承过来
	t1.getYearSalary();//子类独有
  }
}
//设计一个类：Person
//属性：姓名，年龄，性别
//方法：显示姓名，年龄，性别
class Person{
  String name;
  int age;
  String sex;
  void show(){
System.out.println(name+","+age+","+sex);
  } 
}
//设计一个类：Teacher
//属性：姓名，年龄，性别，工资，地址
//方法：显示姓名，年龄，性别
//     求出年薪（工资*12）
//Teacher作为子类，继承Person（父类）的属性
//和方法
//继承的语法格式：
//class 子类名  extends 父类名{
//  子类独有的属性和方法
//}
class Teacher extends Person{
//Teacher类继承Person中属性和方法	
  double salary;
  String address;
  void getYearSalary(){
	double result = salary*12;
	System.out.println(name+"的年薪是"
			+result);
  }
}








