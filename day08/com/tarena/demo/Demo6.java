package com.tarena.demo;

public class Demo6 {
  public static void main(String[] args){
	Person2 p1 = new Person2();
//new Person2():�Զ�����Person2�й��췽��
	p1.name = "�ž���";
	p1.sex = "��";
	p1.age = 60;
	p1.show();
  }
	
}
//���췽�������������ͬʱ��ִ��һЩ��ʼ���Ĳ���
//1 ���췽����ʽ��
//����(�����б�){
//	���������
//}	
//2 ���췽��û���κεķ���ֵ�����Է���������в�Ҫ
//����return���
//3 ��������ı�׼�ĸ�ʽ��
//	����  ������ = new ���췽��;
//4 ���췽������new�����ʱ�򣬱����ã�������ִ��
//	һЩ��ʼ���Ĳ���
//������ࣺPerson
//���ԣ����������䣬�Ա�
//���췽�������һ�仰��������Person��Ķ���
//��������ʾ���е�����ֵ
//ͬһ�����£�����һ�������ظ�
class Person2{
//  ����
	String name;//����
	int age;//����
	String sex;//�Ա�
//	���췽��
	Person2(){
 System.out.println("������Person��Ķ���");
	}
//	����
	void show(){
System.out.println(name+","+sex+","+age);
	}
}













