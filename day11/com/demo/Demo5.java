package com.tarena.demo;

public class Demo5 {
  public static void main(String[] args) {
	Student s1=new Student("��",45);
System.out.println("������"+Student.num);
	System.out.println("������"+s1.num);
	Student s2=new Student("����",35);
	Student s3=new Student("����",45);
	Student s4=new Student("�Թ���",35);
	Student s5=new Student("����",30);
	System.out.println("�ܵ�������"+
			Student.num);
  } 
}
//static : ��̬�ģ���Ҫ�����������Ժͷ���
//1 ��̬��������̬���ԣ�:��static���α��������ԣ���
//���Ǿ�̬�������ñ��������йأ�����ʹ��
//����.��̬��������ֱ�ӷ���
//2 ��̬�����ĸ�ʽ��static �������� ��������
//3 ���ʾ�̬����������.��̬������(��ֱ��ʹ��
//����.��̬������)
//���������һ��Student
//���ԣ����֣�����
//    ��������̬������
//���췽���������ֺ����丳ֵ
//ϣ����ͳ�Ƴ���ѧ����������
//������ÿ�δ���һ���µĶ��󣬾ͻ���ù��췽����
//�ڹ��췽��,ÿ�ζ���������ִ�м�1�Ĳ�������
//��������̬��������1
class Student{
  String name;
  int age;
//��������̬������static �������� ������
  static int num = 0;//num�ĳ�ֵ����Ϊ0
  Student(String name,int age){
	this.name = name;
	this.age = age;
//���ù��췽���;�̬������ͳ��������
	num++;
  }
}






