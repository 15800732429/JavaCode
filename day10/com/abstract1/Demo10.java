package com.tarena.abstract1;

public class Demo10 {
  public static void main(String[] args){
//	Person p1 = new Person("霍光",35);
//抽象类中含有未实现的方法（抽象方法 ），不能直接
//根据抽象类来创建对象
	Teacher t1 = 
		new Teacher("霍去病",23);
	t1.show();
	int sum = t1.add(12, 11);
	System.out.println("sum="+sum);
  }
}
//1 抽象类：含有抽象方法的类，就是抽象类
//2 抽象方法：只有方法的定义，没有方法的实现
//3 抽象方法的格式：
//  abstract 返回值类型  方法名(参数列表);
//4 class前面加上abstract，表示该类是抽象类
//5 抽象类不能直接创建对象（含有未实现的方法）
//6 抽象类可以通过子类来实现其抽象方法

//案例：
//设计一个Person（抽象类）
//属性：名字，年龄
//构造方法：空参构造方法
//        带参数的构造方法
//方法：1） 显示所有属性
//     2） 加法运算（抽象方法）

abstract class Person{
  String name;
  int age;
  Person(){}
  Person(String name,int age){
	this.name = name;
	this.age = age;
  }
  void show(){
	System.out.println(name+","+age);
  }
//抽象方法的格式：
//abstract 返回值类型 方法名(参数列表);
  abstract int add(int num1,int num2);
//抽象方法没有方法体，只有方法的定义  
} 
//设计一个Teacher（是子类，继承Person抽象类）
//必须实现(方法重写)Person抽象方法add方法
class Teacher extends Person{
	Teacher(String name,int age){
	  super(name,age);//调用父类的构造方法
	}
	@Override
	int add(int num1, int num2) {
	  int result = num1 + num2;
	  return result;
	}
}












