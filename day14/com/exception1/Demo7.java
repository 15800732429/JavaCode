package com.tarena.exception1;

import java.util.Scanner;

public class Demo7 {
  public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("������һ��������");
	try{
	  int num = scanner.nextInt();
	  double result = 10/num;
	  
	  String str = null;
	  str.substring(6);
	}catch(NullPointerException e){
//e��ָ���׳��쳣����
	  e.printStackTrace();
//��ӡ�쳣��ջ��Ϣ�����Ҹ�������ҳ��쳣���ֵ�λ��	
	}catch(ArithmeticException e){
	  e.printStackTrace();
	}
  }
}
//NullPointerException:��ָ���쳣������
//Ҫ���ö��󲻴��ڣ�null���󲻴��ڣ�
//try�ĺ�����ԽӶ��catch��䣬һ��try�����׳�
//�����쳣����ֻҪ��һ���쳣�����ܱ�catch�ػ�
//���쳣��������͸�catch�в������쳣����һ�£���
//�ͻ�ִ�ж�Ӧcatch���







