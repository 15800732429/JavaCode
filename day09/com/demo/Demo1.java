package com.tarena.demo;

public class Demo1 {
  public static void main(String[] args){
	Person p1=new Person("����",23,"����");
	p1.show();
  }
}
//1 this����ǰ��
//this.������ ����ǰ���������
//2 ��ҵ���������ù��췽�������Ը�ֵ�ı�׼��ʽ��
//���췽�����βε����ֱ��������������һ��

//���������һ��Person��
//���ԣ����������䣬��ַ
//���췽�������������ʱ�򣬸����������䣬��ַ����
//���Ը�ֵ
//��������ʾ��ǰPerson�������е�����
class Person{
  String name;
  int age;
  String address;
//	���췽��
Person(String name,int age,String address){
	this.name = name;
	this.age = age;
	this.address = address;
//	  ����                           �β�
  }//	����
  void show(){
	System.out.println(name+","+age+","+address);
  }
}




