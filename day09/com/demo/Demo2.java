package com.tarena.demo;

public class Demo2 {
  public static void main(String[] args){
//����   ������ = new ���췽��;
//	Emp emp = new Emp();
//Emp�б�д�������Ĺ��췽�����Ḳ��ϵͳ�Ŀղ�
//���췽����new��ʱ��ϵͳ�Ҳ����ղεĹ��췽��
//�ű���
//	���ô������Ĺ��췽����������������Emp�Ķ���  
	Emp emp = new Emp("����",33);
	System.out.println(emp.name);
  }
}
//ϵͳĬ���ṩһ���ղεĹ��췽������������Լ�д��
//���췽���Ḳ��ϵͳ�ṩ�ĿղεĹ��췽��
//�൱�п���ֻ�з�����Ҳ����ֻ������
class Emp{
  String name;
  int age;
//Ĭ���ṩһ���ղεĹ��췽��
//Emp(){}  
  Emp(String name,int age){
	this.name = name;
	this.age = age;
  }
//����ϵͳĬ�ϵĹ��췽��  
  
  
  
  
  
  
}