package com.tarena.demo;

public class Demo3 {
  public static void main(String[] args){
	
	AddCount count = new AddCount();
//	count.add4(16, 18);
//	count.add1(16.1, 18.6);
//	count.add2(12.1, 10);
//	count.add3(10, 11.1);
//��Ϊ�û�����Ҫ��ס4���������֣���Ҫ��ס����������
//���Ⱥ�˳�򣬺��鷳
//���÷������أ�ͬһ������ڲ�����������ͬ��������ͬ
//�Ϳ��Լ����û��ļ�����������4�����������֣�ȫ��
//��Ϊadd
	count.add(12.1, 10);
	count.add(12,10);
	count.add(200.1,111.1);
	
//�����޸�AddCount���Ժ��û�ֻ��Ҫ��סadd����
//��һ�����֣����Ҳ���Ҫ��ס�κε���������������
//ֱ������2��������ֵ���Ϳ���ִ�мӷ�������	
  }
}
//��Ƽӷ�������(AddCount)
//ִ��2�����ļӷ�����
//add1,add2,add3,add4���ĸ�����ȫ�Ǽӷ�����
//���ܺ����ƣ�������ͬ
class AddCount{
// 1 ��������
  void add(int num1,int num2){
	int sum = num1 + num2;
	System.out.println(sum);
  }
// 2 ��1����double����2����int
  void add(double num1,int num2){
	double sum = num1 + num2;
	System.out.println(sum);
  }
// 3 ��1����int����2����double
  void add(int num1,double num2){
	double sum = num1 + num2;
	System.out.println(sum);
  }
// 4 ������ȫ��double
  void add(double num1,double num2){
	double sum = num1 + num2;
	System.out.println(sum);
  }

  
  
  
	
}