package com.tarena.set;
import java.util.ArrayList;
public class Demo4 {
//���ϣ����Object��3������
//ArrayList��
//toString():
//	�ڲ�����ÿ��Ԫ����toString()����
//	�����Ԫ�ض�����дtoString()�������
//	Ч���Ϻ�
//remove(Object obj):�ڲ�����Ԫ��equals����
//ֻ�е�equalsΪture���Ż�ɾ����Ԫ��	
  public static void main(String[] args){
	ArrayList list=new ArrayList();
	list.add(new User("�ֽ�",32));
	list.add("�ҵĸ�����");
//"�ҵĸ�����"���ַ������ȼ���
//	new String("�ҵĸ�����");	
	System.out.println(list.toString());
	User user = new User("�ֽ�",32);
	list.remove(user);
	System.out.println(list.toString());
  }
}
class User{
  String name;
  int age;
  User(String name,int age){
	this.name = name;
	this.age = age;
  }
  @Override
  public String toString() {
	return "��User����"+name+","+age;
  }
  @Override
  public boolean equals(Object obj) {
	if(obj==null){
	  return false;
	}
	if(this==obj){
	  return true;
	}//ͬһ�����ͣ��Ƚ�����
	if(obj instanceof User){
	  User user = (User)obj;
	  if(this.name.equals(user.name)&&
			  this.age == user.age){
		return true;
	  }
	}
	return super.equals(obj);
  }
@Override
	public int hashCode() {
	
	  return age;
	}
  
  
}