package com.tarena.date1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo4 {
//java中一般操作时间的套路：
//1 创建Date对象
//2 创建SimpleDateFormat对象，而且在其构造方法
//中设定显示时间的格式
//3 调用SimpleDateFormat对象.format(时间对象)
  public static void main(String[] args) {
	Date date = new Date();
	SimpleDateFormat sdf = new
SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	String message = sdf.format(date);
	System.out.println(message);
  }
}
