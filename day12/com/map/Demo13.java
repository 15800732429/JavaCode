package com.tarena.map;
import java.util.HashMap;
//HashMap:key和value一一对象，根据key可以找到
//对应value的值
//put（key,value）:把key和value成对放到
//HashMap集合中
//toString():显示集合中所有元素，目前只能显示String
//get(key):根据key找到对应value,取出value值
//必须进行类型转化
//isEmpty()：判断该集合中是否含有元素，有，返回值
//false，反之没有元素，返回值是true
public class Demo13 {
  public static void main(String[] args) {
	HashMap map = new HashMap();
	map.put("k1", "v1");
	map.put("貂蝉", "吕布");
	System.out.println(map.toString());
//{貂蝉=吕布, k1=v1}	
	map.put("k3", new Customer(1,"谢安"));
	map.put("k4",
	new Emp("房玄龄",23,"fang@163.com"));
	
	String name =(String)map.get("貂蝉");
	System.out.println(name);
	
	Emp emp = (Emp)map.get("k4");
	System.out.println(emp.name);
	System.out.println(emp.age);
	System.out.println(emp.email);
	map.put("貂蝉", "哥的");
	String name2 =(String)map.get("貂蝉");
	System.out.println("美女是："+name2);
//如果在一个HashMap中key值一致的话，后面的key和
//value，会覆盖前面的key和value	
	System.out.println(map.isEmpty());
  }
}

class Customer{
  int id;//顾客的编号
  String name ;//姓名
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









