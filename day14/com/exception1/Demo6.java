package com.tarena.exception1;

import java.util.Scanner;

public class Demo6 {
//ʹ��try...catch��ʽ�������쳣
//��ʽ��
//try{
//	���ܳ����쳣�Ĵ���
//}catch(����){
//	��䣨������ǽ��ͣ�
//}
//���������ͣ��쳣����������
//���ɣ����try���г������쳣��������쳣����
//���͸�catch�����쳣����һ�£�ִ��catch����䡣
//�����û���쳣���֣���ִ��try...catch��������
  public static void main(String[] args){
	Scanner scanner=new Scanner(System.in);
	System.out.println("���������");
	int num = scanner.nextInt();
	try{
//һ��num��ֵΪ0���׳��쳣
//		ArithmeticException����		
	  int result = 10/num;	
//10/num�׳��쳣������ִ��try��֮��Ĵ���	  
	  System.out.println("result="+result);
	}catch(ArithmeticException e){
//���������֣�Ĭ���������e		
	  System.out.println("��������Ϊ0");
	}
	System.out.println("����ִ�к�������");
  }
	
	
}
