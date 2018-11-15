package com.tarena.demo;

public class Demo7 {
//构造方法是在new的时候，才会被调用，可以利用构造
//方法来给对象的属性赋值，简化我们的开发	
  public static void main(String[] args){
	Teacher t1 =
	new Teacher("刘英谦",18,
			  "男",9999999999999.9);
	t1.show();
  }
}
//设计Teacher类
//属性：姓名，年龄，性别，工资
//构造方法：给四个属性赋值
//方法：显示所有属性
class Teacher{
//属性：
  String name;//姓名
  int age;//年龄
  String sex;//性别
  double salary;//工资
//构造方法：参数列表，从外界输出四个属性的值，然后
//在方法体中，把这4个值，分别赋值给这四个属性
  Teacher(String name1,int age1,
		  String sex1,double salary1){
	name = name1;
	age = age1;
	sex = sex1;
	salary = salary1;
  }
//方法：显示所有的属性
  void show(){
	System.out.println(name+","+age+
	  ","+sex+","+salary);
  }
}








