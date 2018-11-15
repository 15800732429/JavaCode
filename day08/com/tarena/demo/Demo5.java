package com.tarena.demo;

public class Demo5 {
  public static void main(String[] args){
	Student student1=new Student();
	System.out.println(student1);
	
	
	
	
	
	student1.name = "关羽";//
	student1.age = 43;
	student1.sex = "男";
	student1.score = 99;
	student1.show();
//把student1赋值给student2	
	Student student2 = student1;
	student2.name = "张飞";
	student2.show();
	
	student1.show();
	
  }
}
//设计一个学生类
//属性：姓名，年龄，性别，分数
//方法：显示该学生所有的属性
class Student{
//属性
  String name;
  int age;
  String sex;
  int score;
//方法：显示学生所有的属性
  void show(){
	System.out.println("姓名是："+name);
	System.out.println("性别是："+sex);
	System.out.println("年龄是："+age);
	System.out.println("分数是："+score);
  }
}





