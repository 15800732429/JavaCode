package com.tarena.demo;

public class Demo8 {
  public static void main(String[] args){
	Emp emp1 = 
		new Emp("����",30,100);
	emp1.show();
	Emp emp2 =
	  new Emp("����¡",42,10,true);
	emp2.show();
  }
}
//1 this:���ڵģ���ǰ��
//  super����ȥ�ģ�������
//2 super(�����б�)�����ø����еĴ������Ĺ��췽��
//  this(�����б�)�����õ�ǰ���е��������ص�
//	���췽��
class Emp{
  String name;
  int age;
  double salary;
  boolean marry;
  Emp(String name,int age,double salary){
	this.name = name;
	this.age = age;
	this.salary = salary;
  }
  Emp(String name,int age,double salary,
		  boolean marry){
//this(�����б�)�����ñ������������صĹ��췽��	  
	this(name,age,salary);
	this.marry = marry;
  }
//��������ʾ���е�����
  void show(){
	System.out.println(name+","+age+
	","+salary+","+marry);
  } 
}






