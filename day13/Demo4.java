package com.tarena.set;
import java.util.ArrayList;
public class Demo4 {
//集合：结合Object中3个方法
//ArrayList：
//toString():
//	内部调用每个元素中toString()方法
//	如果该元素对象重写toString()，则输出
//	效果较好
//remove(Object obj):内部调用元素equals方法
//只有当equals为ture，才会删除该元素	
  public static void main(String[] args){
	ArrayList list=new ArrayList();
	list.add(new User("乐进",32));
	list.add("我的歌声里");
//"我的歌声里"：字符串，等价于
//	new String("我的歌声里");	
	System.out.println(list.toString());
	User user = new User("乐进",32);
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
	return "该User对象"+name+","+age;
  }
  @Override
  public boolean equals(Object obj) {
	if(obj==null){
	  return false;
	}
	if(this==obj){
	  return true;
	}//同一个类型，比较属性
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