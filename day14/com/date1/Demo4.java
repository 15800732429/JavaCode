package com.tarena.date1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo4 {
//java��һ�����ʱ�����·��
//1 ����Date����
//2 ����SimpleDateFormat���󣬶������乹�췽��
//���趨��ʾʱ��ĸ�ʽ
//3 ����SimpleDateFormat����.format(ʱ�����)
  public static void main(String[] args) {
	Date date = new Date();
	SimpleDateFormat sdf = new
SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	String message = sdf.format(date);
	System.out.println(message);
  }
}
