package com.tarena.exception1;

import java.util.Scanner;

public class Demo9 {
  public static void main(String[] args) throws NameOrPwdException {
//	�����û���name��liu ��������123456
//	������ȷ����ʾ�û���¼��
//	��������׳��Զ����쳣 NameOrPwdException 
//  �û������������
	Scanner sc= new Scanner(System.in);
	System.out.println("�������û�����");
	String name = sc.nextLine();
	System.out.println("���������룺");
	String pwd = sc.nextLine();
if(name.equals("liu")&&pwd.equals("123456")){
	  System.out.println("�û���¼�ɹ�");	
	}else{
//��¼ʧ�ܣ��׳��쳣����NameOrPwdException��
	  throw new 
	  		NameOrPwdException("�û������������");
	}
	
  }
}
//�Զ����쳣���Լ������Լ����쳣��
//1���̳��쳣���ࣨException��
//2����дException�е�4�����췽��
//���������һ���쳣�࣬��ʾ�û���name��������pwd
//���󣬲��׳����쳣
//Scanner��һ������nextLine():����һ���ַ���������
class NameOrPwdException extends Exception{
	
	public NameOrPwdException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NameOrPwdException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public NameOrPwdException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public NameOrPwdException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
  	
}







