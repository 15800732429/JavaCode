package com.tarena.list;

import java.util.ArrayList;
public class Demo10 {
//ArrayList���ṹ���Ա���������񣬱���Ԫ����
//�����
//1) ����ArrayList���������	
  public static void main(String[] args){
	ArrayList list = new ArrayList();
//2) add(����):��ArrayList���������
	list.add("����");//�±�0
	list.add("��Τ");//�±�1
	list.add("��");//�±�2
//3) get��index��:����Ԫ������ArrayList������
//	�±꣬ȡ����Ӧ��Ԫ��
//	ʹ��get�Ӽ�����ȡ����Ӧ��Ԫ�أ�����Ҫ��������
//	ת��
	String name1 =(String)list.get(0);
System.out.println("list�е�1��Ԫ�أ�"+name1);
	String name2 =(String)list.get(1);
	System.out.println(name2);
	String name3 =(String)list.get(2);
	System.out.println(name3);
	
  }	
}
