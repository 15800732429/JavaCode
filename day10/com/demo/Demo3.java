package com.tarena.demo;

public class Demo3 {
  public static void main(String[] args){
	User1 user = 
		new User1("¬����",30,"��");
	user.show();
  }
}
//���������޲εĹ��췽���������������ı�д�Լ���
//���췽��
class Person1{
  String name;
  int age;
//ϵͳ��Ĭ���ṩһ��"�ղ�"�Ĺ��췽��  
  Person1(){}//����ϵͳ�ṩ�Ŀղι��췽��
}
class User1 extends Person1{
  String sex;
  User1(String name,int age,String sex){
	this.name = name;
	this.age = age;
	this.sex = sex;
  } 
  void show(){
	System.out.println(name+","+age+","
			+sex);
  }
}

