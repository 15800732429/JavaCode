package com.tarena.demo;
public class Demo2 {
  public static void main(String[] args) {
//ʹ��������������󣬲������ö���
	Teacher t1 = new Teacher();
	t1.name = "����ʦ";
	t1.add(30, 36);//�����м̳й����ķ���
	t1.show();//������д����ķ���
	t1.welcome();//������еķ���
//�������������壩ָ���������
//���� ������ = new ���๹�췽��;
	Person p1 = new Teacher();
	p1.name = "ǫ��";
	p1.add(30, 36);//�����м̳й����ķ���
	p1.show();//������д����ķ���
//	p1.welcome();���ܵ���������еķ���
  }
}
//��������ָ����������˽⣬��ס���ɣ�
//1 ���ø������������Ȼ��������Ĺ��췽��������
//�������
//2 ��ʽ��     ���� ������ = new ����Ĺ��췽��
//     ���ඨ�壨������      ���ഴ������
//3 ���ɣ���������ָ������������д����Ķ��󣬹���
//���Ǹö���ֻ�ܷ��ʴӸ����м̳й����ķ�����������
//��д����ķ����������ܷ���������еķ���
class Person{//����
  String name;	
  void show(){
	System.out.println("�������ϣ�����͢����...������÷��");
  }
  void add(int num1,int num2){
	System.out.println(num1+num2);
  }
}
class Teacher extends Person{//����
  void show(){//������д����ķ���
	System.out.println(name+"���찾ҹ����");
  }
  void welcome(){//������еķ���
	System.out.println("������ӭ��...");
  }
}







