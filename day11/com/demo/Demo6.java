package com.tarena.demo;

public class Demo6 {
  public static void main(String[] args) {
	Worker w1 = new Worker("����",32);
	Worker w2 = new Worker("����",34);
	Worker w3 = new Worker("����",36);
	Worker w4 = new Worker("�ƺ���",33);
	Worker w5 = new Worker("���˰�",32);
	Worker w6 = new Worker("����",36);
//	����Worker����getMoney�����̬����
	Worker.getMoney();
  }
}
//��̬��������static���εķ�������Ϊ��̬����
//���ʷ�ʽ������.��̬���������ʣ��������.
//��̬��������
//���������һ��Worker(��)
//���ԣ����֣����䣬
//     ��������̬���ԣ�
//���췽���������֣����丳ֵ��ͳ���е�����
//����:��̬������ͳ�ƹ��ʵ�����������*��н��10000��
class Worker{
  String name;
  int age;
  static int num=0;
  Worker(String name,int age){
	this.name = name;
	this.age = age;
	num++;
//ÿ�δ����µ�Worker�����ʱ��num��1
  }
//��̬��������ĸ�ʽ��
//static ����ֵ���� ������(�����б�){
//    ������
//}
  static void getMoney(){
	double result = num*10000;
	System.out.println("�ܵĹ���֧����"+result);
  }
  
  
  
}





