package com.tarena.demo;

public class Demo6 {
  public static void main(String[] args){
	Taxi taxi = new Taxi();
	System.out.println("name��ֵ��"+
			taxi.name);
  }
}
//���������أ������ĸ��ǣ�����������ԻḲ�Ǹ���̳�
//������ͬ�������ԡ�
class Car1{
  String name="car1";
}
class Taxi extends Car1{
//����Taxi�е�name���Ե����ָ�����Car1��
//�̳й�����name����һ�£�����name���Ի�
//���Ǹ����м̳й���������	
  String name="taxi";
}
