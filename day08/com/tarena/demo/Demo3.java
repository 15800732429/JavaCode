package com.tarena.demo;

public class Demo3 {
  public static void main(String[] args){
	Box box1 = new Box();
	box1.length=10;
	box1.width=8;
	box1.high = 9;
	box1.getTiji();
  }
}
//���һ�������壨Box��
//���ԣ�����length������width�����ߣ�high��
//�����������������Ҫ����ֵ��ֱ�������
class Box{
	int length;
	int width;
	int high;
//���������*��*��
	void getTiji(){
	  int result = length*width*high;
	  System.out.println("�ó�����������"
			  +result);
	}
}