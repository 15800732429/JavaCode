package com.tarena.date1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo3 {
//Date:java针对时间的操作都是通过Date类来实现的
//构造方法：Date（）--->默认就是当前系统时间
//eg：Date date = new Date();
//直接输出Date对象，显示的时间，不太符合我们的习惯
  public static void main(String[] args) {
	
//格式化显示时间
//SimpleDateFormat：专门用来格式化的显示我们的
//Date对象（时间）
//构造方法：
//	SimpleDateFormat(“显示时间的格式”)	
//	我们可以自己来指定当前时间的格式
//一般有两种最为常见的格式，
//	a）年月日-- yyyy-MM-dd
//	eg:       2012-12-12
//	b）年月日时分秒  yyyy-MM-dd hh:mm:ss
	Date date = new Date();
	System.out.println("当前系统的时间："
				+date);  
	SimpleDateFormat sdf =
	new SimpleDateFormat("yyyy-MM-dd");
//format(Date对象)：把Date对象转化为对应
//显示时间的字符串	
	String message = sdf.format(date);
	System.out.println(message);
	
	
		
  }
}
