package com.tarena.string2;

public class Demo2 {
//可变长的字符串：StringBuffer和StringBuilder
//特点：这两个类的对象，无论字符串如何修改，内部
//只有一个对象。
//区别：StringBuffer出现较早，速度稍慢，线程安全
//	   StrinBuilder出现较晚，速度较快，
//	   线程不安全
//对字符串如果是频繁的修改操作，就可以考虑使用
//StringBuffer和StringBuilder来替代String
  public static void main(String[] args){
	StringBuffer buf =
		new StringBuffer("今天");
//append(内容):在StringBuffer对象的后面，追加
//内容	
	buf.append("感觉学的东西没有昨天的难,");
	buf.append("下周开始学习数据库内容。");
//toString()：把StringBuffer中所有的内容，
//转化为String显示出来
	System.out.println(buf.toString());
    StringBuilder bud = 
    	new StringBuilder();
    bud.append("天气挺好,雾蒙蒙的。");
//append(内容):可以放任何的类型数据
//    bud.append(true);
//    bud.append(12);
//    bud.append(12.1f);
    System.out.println(bud.toString());
//insert(下标,内容)：在下标的位置插入任意内容
    bud.insert(0, "今天");
    System.out.println(bud.toString());
//今天天气挺好,雾蒙蒙的。  
//      4
//delete(start,end):删除下标从start开始，
//   end-start个字符
    bud.delete(4,6);
    System.out.println(bud.toString());
  }
}
