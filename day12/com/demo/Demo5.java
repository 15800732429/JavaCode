package com.tarena.demo;
public class Demo5 {
  public static void main(String[] args){
	System.out.println(Person1.AGE);
	System.out.println(Person1.NAME);
  }
}
//��������綼���Է��ʣ���ֵ���䣬�������ڶ���
//public static final �������� ������=��ֵ��
//���������֣�������ϰ�ߣ�ȫ����д
class Person1{
  public static final int AGE = 20;
 public final static String NAME = "������";
}