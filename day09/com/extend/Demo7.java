package com.tarena.extend;

public class Demo7 {
  public static void main(String[] args){
	Teacher t1 = new Teacher();
//t1��name��sex,age���������ڸ����м̳й���
//������	
	t1.name = "��";
	t1.sex = "��";
	t1.age = 35;
//salary,address��������Teacher���е�	
	t1.salary = 10000000;
	t1.address = "�Ϻ�";
	t1.show();//����̳й���
	t1.getYearSalary();//�������
  }
}
//���һ���ࣺPerson
//���ԣ����������䣬�Ա�
//��������ʾ���������䣬�Ա�
class Person{
  String name;
  int age;
  String sex;
  void show(){
System.out.println(name+","+age+","+sex);
  } 
}
//���һ���ࣺTeacher
//���ԣ����������䣬�Ա𣬹��ʣ���ַ
//��������ʾ���������䣬�Ա�
//     �����н������*12��
//Teacher��Ϊ���࣬�̳�Person�����ࣩ������
//�ͷ���
//�̳е��﷨��ʽ��
//class ������  extends ������{
//  ������е����Ժͷ���
//}
class Teacher extends Person{
//Teacher��̳�Person�����Ժͷ���	
  double salary;
  String address;
  void getYearSalary(){
	double result = salary*12;
	System.out.println(name+"����н��"
			+result);
  }
}








