package com.tarena.demo;
//�������
//1 ��Ͷ���
//	�����һ��ģ�壬����һ��������磺���࣬����
//	������Ǹ���������������һ�������ʵ�֣�������
//	һ�����壬ʵ�ʴ���������磺����ʦ���ſڱ���
//2 �����ɣ����Ժͷ�������Ϊ��
//	class ����{
//	  ���ԣ���������
//	  �������� ������1;
//	  �������� ������2;
//	 ... ...
//	  ������ȥ��static
//	  ����ֵ����  ������(�����б�){
//	    ������
// }
//}
//3 ����������ĸ��д����Ҫʹ������
//4  �� ������ŵ����ͬһ���й���		
//����
//1 ��������ĸ�ʽ(Ŀǰ)������ ������ = new ����();
//2 ���ʶ����е����Ժͷ���
//	������.������
//	������.������(����ֵ�б�)
//3 ��ʱ�������󼰵��ö�������Ժͷ���������main��
//	ִ��
public class Demo1 {
  public static void main(String[] args){
	Person person1=new Person();
//��person1�е�name���Ը�ֵ	
	person1.name = "����";
//	System.out.println("person1�е�name"
//		+"����ֵ��"+person1.name);
	person1.age = 26;
	person1.money = 100;
	person1.sex ="��";
//	˵���ķ���
	person1.speak();
//	�ӷ�
	person1.add(25, 69);
	
	Person person2=new Person();
	person2.name="����";
	person2.money=95;
	person2.age=55;
	person2.sex="��";
	
	person2.speak();
	person2.add(100, 100);
  }
}
//���������һ���ࣺ����
//���ԣ� ���������䣬�Ա𣬹���
//������ ˵���ͼӷ�
class Person{
//���ԣ��������� ������;
  String name; //����
  int age;//����
  String sex;//�Ա�
  double money;//����
//������ ����ֵ����  ������(�����б�){
//        ������
//     }  
  void speak(){
	System.out.println("����"+name);
  }
  void add(int num1,int num2){
	int sum = num1 + num2;
	System.out.println(num1+"+"+num2+
			"��ֵ��"+sum);
  }
}













