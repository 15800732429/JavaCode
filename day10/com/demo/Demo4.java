package com.tarena.demo;

public class Demo4 {
  public static void main(String[] args){
	User2 user2 =
	  new User2("�ֱ�",31,"����");
	user2.show();
  }
}
//1 ������ֻ���д������Ĺ��췽����������Ĺ��췽����
//����Ҫ���ø����д������Ĺ��췽����java�е�Ӳ��
//�﷨����
//2 super���ؼ��֣���ȥ�ģ�������
//  super(�����б�):���ø���Ĺ��췽��
class Person2{
  String name;
  int age;
  Person2(String name,int age){
	this.name = name;
	this.age = age;
  }//Person2�У�ֻ�д������Ĺ��췽��  
}

class User2 extends Person2{
  String address;
//�����๹�췽���е��ø����еĴ������Ĺ��췽��
  User2(String name,int age,String address){
	super(name,age);
	this.address = address;
  }
  void show(){
System.out.println(name+","+age+","+address);
  }
}













