package com.tarena.abstract1;

public class Demo10 {
  public static void main(String[] args){
//	Person p1 = new Person("����",35);
//�������к���δʵ�ֵķ��������󷽷� ��������ֱ��
//���ݳ���������������
	Teacher t1 = 
		new Teacher("��ȥ��",23);
	t1.show();
	int sum = t1.add(12, 11);
	System.out.println("sum="+sum);
  }
}
//1 �����ࣺ���г��󷽷����࣬���ǳ�����
//2 ���󷽷���ֻ�з����Ķ��壬û�з�����ʵ��
//3 ���󷽷��ĸ�ʽ��
//  abstract ����ֵ����  ������(�����б�);
//4 classǰ�����abstract����ʾ�����ǳ�����
//5 �����಻��ֱ�Ӵ������󣨺���δʵ�ֵķ�����
//6 ���������ͨ��������ʵ������󷽷�

//������
//���һ��Person�������ࣩ
//���ԣ����֣�����
//���췽�����ղι��췽��
//        �������Ĺ��췽��
//������1�� ��ʾ��������
//     2�� �ӷ����㣨���󷽷���

abstract class Person{
  String name;
  int age;
  Person(){}
  Person(String name,int age){
	this.name = name;
	this.age = age;
  }
  void show(){
	System.out.println(name+","+age);
  }
//���󷽷��ĸ�ʽ��
//abstract ����ֵ���� ������(�����б�);
  abstract int add(int num1,int num2);
//���󷽷�û�з����壬ֻ�з����Ķ���  
} 
//���һ��Teacher�������࣬�̳�Person�����ࣩ
//����ʵ��(������д)Person���󷽷�add����
class Teacher extends Person{
	Teacher(String name,int age){
	  super(name,age);//���ø���Ĺ��췽��
	}
	@Override
	int add(int num1, int num2) {
	  int result = num1 + num2;
	  return result;
	}
}












