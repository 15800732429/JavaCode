package com.tarena.demo;

public class Demo4 {
  public static void main(String[] args)
  {
	Emp2 emp1 = 
		new Emp2("����","��",55);
	emp1.show();
	System.out.println("---------------");
	emp1.show("����", "123456789987");
	
  }
}
//�������أ�ͬһ������ڲ�����������ͬ��������ͬ
//������ͬ�������ĸ��������ͣ�˳����һ����ͬ������
//������ͬ
//�������صĺô����������ƹ��ܵķ�����ʱ�򣬵���
//��ü򵥣�ֻҪ��סһ�����֣��Ϳ��Ե��ö��ͬ��
//���Ƶķ���
//�������ص�ԭ�������������������ͬ�Ժ�ϵͳ
//���Զ����ݲ����Ĳ�ͬ�������ö�Ӧ�ķ���
//��̬�������ڲ�ͬ��������в�ͬ�ı���
//�����������ڶ�̬��һ��	

//��������ƹ�Ա��(Emp)
//���ԣ����֣��Ա����䣬סַ���绰
//���췽���������֣��Ա����丳ֵ
//������ʹ�÷�������
//1�� show:ֻ��ʾ���֣��Ա����䣨�����κβ�����
//2�� show��a�� ����ַ���绰���Ը�ֵ����������
//         b�� ��ʾ��ǰ��Ա���е���Ϣ
class Emp2{
//����
  String name;//����
  String sex;//�Ա�
  int age;//����
  String address;//��ַ
  String phone;//�绰
//���췽��
  Emp2(String name,String sex,int age){
	this.name = name;
	this.sex = sex;
	this.age = age;
  }//����:��������
  void show(){
System.out.println(name+","+sex+","+age);
  }
  
  void show(String address,String phone){
	this.address = address;
	this.phone = phone;
System.out.println(name+","+sex+","+age
		+","+address+","+phone);
  }
  
}










