package com.tarena.list;
import java.util.ArrayList;
import java.util.List;
public class Demo11 {
  public static void main(String[] args){
	ArrayList list = new ArrayList();	
	list.add("昨天天气不错，才36度");
	list.add(new Person("杨广"));
	list.add(new User("李靖",35));
	list.add(new User("李文静",32));
	list.add("今天好累。。。终于可以不用写类了");
//size():当前集合中元素的个数
	System.out.println("list中元素个数:"
			+list.size());
//取出第4个元素，并且显示User名字和年龄
	User user = (User)list.get(3);
	System.out.println(user.name);
	System.out.println(user.age);
//isEmpty()：判断该集合中元素是为空,如果集合中
//没有任何元素，则返回值为true,反之集合中有元素
//返回值是false	
	System.out.println(list.isEmpty());//false
//删除元素（1）clear()：删除集合中所有的元素
//	list.clear();
//	System.out.println(list.isEmpty());//true
//	（2）根据下标删除对应的元素:remove(index)
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