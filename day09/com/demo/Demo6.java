package com.tarena.demo;

public class Demo6 {
  public static void main(String[] args){
//	���������
	Box box1 = new Box(10,8,10);
	box1.getTiji();
//	���������  
	Box box2 = new Box(10);
	box2.getTiji();
  }
}
//���췽�����أ�
//������
//�������߶�һ�µĳ����壬��Ϊ������
//���һ��������
//���ԣ���������
//���췽����
//   1�� ���������������������߷ֱ�ĸ�ֵ����׼
//      ������
//   2�� ��һ�����������������߸�ͬ����һ��ֵ��
//      ������
//�����������
class Box{
  int c;//��
  int k;//��
  int g;//��
//������  
  Box(int c,int k,int g){
	this.c = c;
	this.k = k;
	this.g = g;
  }
//������
  Box(int length){
	this.c = length;
	this.k = length;
	this.g = length;
  }
//�������
  void getTiji(){
	int result = c*k*g;
	System.out.println(result);
  }
}



