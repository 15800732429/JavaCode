package com.tarena.set;
import java.util.HashSet;
public class Demo5 {
//HashSet:跟ArrayList相似，区别：元素不能重复
//元素无序（没有下标）
  public static void main(String[] args){
	HashSet set = new HashSet();
	set.add("你好");
	set.add(new User("甘宁",23));
	set.add(new User("刘琦",24));
//HashSet无序	
	System.out.println(set.toString());
    User user = new User("刘琦",24);
//HashSet中没有下标，元素是无序
//要删除HashSet中的元素，只能使用remove（对象）
//HashSet中的元素，必须重写equals方法，不然
//无法删除    
	set.remove(user);
    System.out.println(set.toString());
    System.out.println(set.isEmpty());
    System.out.println(set.size());
  }
}
