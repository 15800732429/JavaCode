package com.tarena.demo;

public class Demo2 {
  public static void main(String[] args) {
	Person p1 = new Person();
	p1.name ="��ȥ��";
	System.out.println(p1.name);
	p1.name = "����";
	System.out.println(p1.name);
//	p1.age = 33;
//	final���ε����ԣ���ʼ���Ժ����ٱ��޸�
	System.out.println(p1.age);
  }
}
//final�����յģ�����
//1 final�����࣬���ԣ����������ҿ�����final������
//java�еĳ���
//2 final���ε����ԣ���ֵ��ʼ�����������ٸı�
class Person{
  String name;
  final int age = 18;//��1�θ�ֵ����ʼ��
}