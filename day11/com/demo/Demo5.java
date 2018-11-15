package com.tarena.demo;

public class Demo5 {
  public static void main(String[] args) {
	Student s1=new Student("刘",45);
System.out.println("人数："+Student.num);
	System.out.println("人数："+s1.num);
	Student s2=new Student("白起",35);
	Student s3=new Student("廉颇",45);
	Student s4=new Student("赵广义",35);
	Student s5=new Student("岳飞",30);
	System.out.println("总的人数："+
			Student.num);
  } 
}
//static : 静态的，主要用来修饰属性和方法
//1 静态变量（静态属性）:用static修饰变量（属性），
//就是静态变量，该变量跟类有关，可以使用
//类名.静态变量名来直接访问
//2 静态变量的格式：static 数据类型 变量名；
//3 访问静态变量：类名.静态变量名(或直接使用
//对象.静态变量名)
//案例：设计一个Student
//属性：名字，年龄
//    人数（静态变量）
//构造方法：给名字和年龄赋值
//希望能统计出来学生的数量：
//分析：每次创建一个新的对象，就会调用构造方法，
//在构造方法,每次都对象人数执行加1的操作，给
//人数（静态变量）加1
class Student{
  String name;
  int age;
//人数：静态变量，static 数据类型 变量名
  static int num = 0;//num的初值设置为0
  Student(String name,int age){
	this.name = name;
	this.age = age;
//利用构造方法和静态变量，统计总人数
	num++;
  }
}






