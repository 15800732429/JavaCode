package com.tarena.demo;

public class Demo7 {
//���췽������new��ʱ�򣬲Żᱻ���ã��������ù���
//����������������Ը�ֵ�������ǵĿ���	
  public static void main(String[] args){
	Teacher t1 =
	new Teacher("��Ӣǫ",18,
			  "��",9999999999999.9);
	t1.show();
  }
}
//���Teacher��
//���ԣ����������䣬�Ա𣬹���
//���췽�������ĸ����Ը�ֵ
//��������ʾ��������
class Teacher{
//���ԣ�
  String name;//����
  int age;//����
  String sex;//�Ա�
  double salary;//����
//���췽���������б����������ĸ����Ե�ֵ��Ȼ��
//�ڷ������У�����4��ֵ���ֱ�ֵ�����ĸ�����
  Teacher(String name1,int age1,
		  String sex1,double salary1){
	name = name1;
	age = age1;
	sex = sex1;
	salary = salary1;
  }
//��������ʾ���е�����
  void show(){
	System.out.println(name+","+age+
	  ","+sex+","+salary);
  }
}








