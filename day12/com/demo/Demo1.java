package com.tarena.demo;

public class Demo1 {
  public static void main(String[] args) {
	Foo f1 = new Foo();
	Foo f2 = new Foo();
	Foo f3 = new Foo();
  }
}
//��̬����飺ʹ��static���εĴ������Ǿ�̬�����
//���ܴ���������ٸ�����ִֻ��һ��
class Foo{
  static {
	System.out.println("ҹ��������������");
	System.out.println("����");
  }
}