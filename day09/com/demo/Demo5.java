package com.tarena.demo;

public class Demo5 {
  public static void main(String[] args){
    Customer c1 = new Customer("��Τ",33);
    c1.show();
    Customer c2 = 
new Customer("����",35,"�ɶ�",10,"�������ɵ���");
    c2.show();
    Customer c3 = 
    new Customer("����",65,"����");
    c3.show();
  }
}
//���췽�����أ����췽��Ҳ���Է�������
//�����������ʱ��new�������Ը��ݹ��췽������
//��ͬ����������Ӧ�Ķ���
//������
//���һ��Customer
//���ԣ����������䣬��ַ����ְҵ
//���췽����
//1�� ���������������Ը�ֵ
//2�� �����е����Ը�ֵ
//3�� �����������䣬��ַ���Ը�ֵ
//������
//show����ʾ���е�����
class Customer{
  String name;//����
  int age;//����
  String address;//��ַ
  double money;//���
  String job;//ְҵ
  Customer(String name,int age){
	this.name = name;
	this.age = age;
  }
  Customer(String name,int age,
String address,double money,String job){
	this.name = name;
	this.age = age;
	this.address = address;
	this.money = money;
	this.job = job;
  }
  Customer(String name,int age,
		  String address){
	this.name = name;
	this.age = age;
	this.address = address;
  }
//��ʾ���е�����
  void show(){
	System.out.println("������"+name);
	System.out.println("���䣺"+age);
	System.out.println("��ַ��"+address);
	System.out.println("��"+money);
	System.out.println("ְҵ��"+job);
  }
}





