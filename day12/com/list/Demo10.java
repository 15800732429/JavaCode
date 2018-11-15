package com.tarena.list;

import java.util.ArrayList;
public class Demo10 {
//ArrayList：结构线性表，跟数组很像，保存元素是
//有序的
//1) 导入ArrayList这个集合类	
  public static void main(String[] args){
	ArrayList list = new ArrayList();
//2) add(数据):往ArrayList中添加数据
	list.add("张辽");//下标0
	list.add("典韦");//下标1
	list.add("马超");//下标2
//3) get（index）:根据元素所在ArrayList集合中
//	下标，取出对应的元素
//	使用get从集合中取出对应的元素，必须要进行类型
//	转化
	String name1 =(String)list.get(0);
System.out.println("list中第1个元素："+name1);
	String name2 =(String)list.get(1);
	System.out.println(name2);
	String name3 =(String)list.get(2);
	System.out.println(name3);
	
  }	
}
