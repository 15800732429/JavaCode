package com.tarena.demo;

public class Demo7 {
  public static void main(String[] args){
	Bmw5 bmw = 
new Bmw5("����","��ɫ",100,"001",0,"��ʦר�ð�");
	bmw.show();
  }
}
//1 ������д���������ǣ�������ķ������Ǹ����м̳�
//������ͬ���ķ���
//2 ������д���ص㣺
//1������ķ����͸���ķ��������ֺͲ����б����һ��
//2��������д����������͸���֮��

//������
//��Ƹ���Car2
//���ԣ����֣���ɫ���۸񣬳���
//���췽���� �޲ι��췽��
//        �����в����Ĺ��췽��
//��������ʾCar�е����е�����
class Car2{
  String name;
  String color;
  double price;
  String no;
  Car2(){}
  Car2(String name,String color,
		      double price,String no){
	this.name = name;
	this.color = color;
	this.price = price;
	this.no = no;
  }
  void show(){
	System.out.println("����Car2��show��"
			+name+","+color
	      +","+price+","+no);
  }
}
//�������Bmw5��Car2�����ࣩ
//���ԣ����֣���ɫ���۸񣬳��ƣ��ٶȣ�����
//���췽���������в����Ĺ��췽��
//��������ʾBmw5���е�����(��������д)
class Bmw5 extends Car2{
  int speed;
  String type;
  Bmw5(String name,String color,
   double price,String no,int speed,
   String type){
//	���ø���Car2�д������Ĺ��췽������㣩  
	super(name,color,price,no);
	this.speed = speed;
	this.type = type;
  }
//��дshow����
//�����е�show�����������˸���Car2�̳й���show
  void show(){
	System.out.println("������д����show��"
	  +name+","+color+","+price+","
	  +no+","+speed+","+type);
  }
}









