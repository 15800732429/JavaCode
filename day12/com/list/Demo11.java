package com.tarena.list;
import java.util.ArrayList;
import java.util.List;
public class Demo11 {
  public static void main(String[] args){
	ArrayList list = new ArrayList();	
	list.add("��������������36��");
	list.add(new Person("���"));
	list.add(new User("�",35));
	list.add(new User("���ľ�",32));
	list.add("������ۡ��������ڿ��Բ���д����");
//size():��ǰ������Ԫ�صĸ���
	System.out.println("list��Ԫ�ظ���:"
			+list.size());
//ȡ����4��Ԫ�أ�������ʾUser���ֺ�����
	User user = (User)list.get(3);
	System.out.println(user.name);
	System.out.println(user.age);
//isEmpty()���жϸü�����Ԫ����Ϊ��,���������
//û���κ�Ԫ�أ��򷵻�ֵΪtrue,��֮��������Ԫ��
//����ֵ��false	
	System.out.println(list.isEmpty());//false
//ɾ��Ԫ�أ�1��clear()��ɾ�����������е�Ԫ��
//	list.clear();
//	System.out.println(list.isEmpty());//true
//	��2�������±�ɾ����Ӧ��Ԫ��:remove(index)
	list.remove(0);
	Person p1 = (Person)list.get(0);
	System.out.println(p1.name);
  }
}
class Person{
  String name;
  Person(String name){
	this.name = name;
  }
}
class User{
  String name;
  int age;
  User(String name,int age){
	this.name = name;
	this.age = age;
  }	
}