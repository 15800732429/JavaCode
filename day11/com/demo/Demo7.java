package com.tarena.demo;

public class Demo7 {
  public static void main(String[] args) {
	Foo f1 = new Foo();
	System.out.println();
	Foo f2 = new Foo();
	System.out.println();
	Foo f3 = new Foo();
  }
}
//����飺����������{}������һ�δ��룬ÿ�δ���
//����Ķ����ʱ�򣬶���Ĭ��ȥ����
//����飺�����ô������ִ��һЩ��ʼ���Ĳ���������
//���������췽����ȡ����
class Foo{
  {
	System.out.println("NBAû����");
	System.out.println("���籭������");
	System.out.println("���ĵ�ѧϰ�ɣ�����");
  }	
	
}