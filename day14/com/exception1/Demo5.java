package com.tarena.exception1;

public class Demo5 {
//java�����е��쳣�����Ϊ2��
//1������Error,һ�������޷������ǳ����أ�java
//	�ǽ�׳���ԣ�Error���ֵĸ��ʼ���
//2���쳣��Exception,������֡����⡱�����������
//	�ҳ��쳣�����Ҹ����쳣��ʾ��Ϣ�������޸Ĵ��룬
//	�����쳣���ٴγ���
  public static void main(String[] args) {
	int num1 = 10;
	double result = num1/0;//�׳��쳣������
//������Ϊ0��ʱ���׳��쳣������ֹ����
//�������쳣��Ϣ�У����쳣����ԭ�����ʾ/ by zero	
	System.out.println("result="+result);
  }
}
