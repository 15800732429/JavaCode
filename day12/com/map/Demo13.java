package com.tarena.map;
import java.util.HashMap;
//HashMap:key��valueһһ���󣬸���key�����ҵ�
//��Ӧvalue��ֵ
//put��key,value��:��key��value�ɶԷŵ�
//HashMap������
//toString():��ʾ����������Ԫ�أ�Ŀǰֻ����ʾString
//get(key):����key�ҵ���Ӧvalue,ȡ��valueֵ
//�����������ת��
//isEmpty()���жϸü������Ƿ���Ԫ�أ��У�����ֵ
//false����֮û��Ԫ�أ�����ֵ��true
public class Demo13 {
  public static void main(String[] args) {
	HashMap map = new HashMap();
	map.put("k1", "v1");
	map.put("����", "����");
	System.out.println(map.toString());
//{����=����, k1=v1}	
	map.put("k3", new Customer(1,"л��"));
	map.put("k4",
	new Emp("������",23,"fang@163.com"));
	
	String name =(String)map.get("����");
	System.out.println(name);
	
	Emp emp = (Emp)map.get("k4");
	System.out.println(emp.name);
	System.out.println(emp.age);
	System.out.println(emp.email);
	map.put("����", "���");
	String name2 =(String)map.get("����");
	System.out.println("��Ů�ǣ�"+name2);
//�����һ��HashMap��keyֵһ�µĻ��������key��
//value���Ḳ��ǰ���key��value	
	System.out.println(map.isEmpty());
  }
}

class Customer{
  int id;//�˿͵ı��
  String name ;//����
  Customer(int id,String name){
	this.id = id;
	this.name = name;
  }
}
class Emp{
  String name;
  int age;
  String email;
  Emp(String name,int age,String email){
	this.name = name;
	this.age = age;
	this.email = email;
  } 
}









