package com.tarena.list;
import java.util.List;
import java.util.ArrayList;
public class Demo12 {
//List：接口，规定很多针对集合操作的方法
//ArrayList：List接口一个实现类
//使用父类声明指向子类对象
//1) 针对集合的使用，必须要导入集合类
//2) add(对象)：往集合中添加元素
//3) isEmpty():判断集合是否含有元素，有，false
//	 没有，true
//4) get(index):跟index下标，取出集合对应的元素
//	 切记取出元素以后,必须进行类型转化
//5) toString():在ArrayList中，该方法能
//	 显示出该集合中所有的元素（建议明天再用）
//6) clear():清空该集合中所有的元素	
//7) remove(index):根据index下标删除对应位置的
//	元素
//8） size（）:显示当前集合中元素的个数	
  public static void main(String[] args){
	List list =new ArrayList();
	list.add(new Person("李建成"));
	list.add(new User("宇文成都",32));
	list.add(new User("李密",43));
	System.out.println("list中是否含有元素："
			+list.isEmpty());
	User user = (User)list.get(1);
	System.out.println(user.name);
//	list.clear();清空集合中所有的元素
//	System.out.println(list.isEmpty());
	list.remove(1);
//删除第2个元素，同时第3个元素会向前，占据第2个元素
//的位置	
	User user2 = (User)list.get(1);
	System.out.println(user2.name);
	System.out.println(list.size());
  }
}
