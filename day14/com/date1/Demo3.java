package com.tarena.date1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo3 {
//Date:java���ʱ��Ĳ�������ͨ��Date����ʵ�ֵ�
//���췽����Date����--->Ĭ�Ͼ��ǵ�ǰϵͳʱ��
//eg��Date date = new Date();
//ֱ�����Date������ʾ��ʱ�䣬��̫�������ǵ�ϰ��
  public static void main(String[] args) {
	
//��ʽ����ʾʱ��
//SimpleDateFormat��ר��������ʽ������ʾ���ǵ�
//Date����ʱ�䣩
//���췽����
//	SimpleDateFormat(����ʾʱ��ĸ�ʽ��)	
//	���ǿ����Լ���ָ����ǰʱ��ĸ�ʽ
//һ����������Ϊ�����ĸ�ʽ��
//	a��������-- yyyy-MM-dd
//	eg:       2012-12-12
//	b��������ʱ����  yyyy-MM-dd hh:mm:ss
	Date date = new Date();
	System.out.println("��ǰϵͳ��ʱ�䣺"
				+date);  
	SimpleDateFormat sdf =
	new SimpleDateFormat("yyyy-MM-dd");
//format(Date����)����Date����ת��Ϊ��Ӧ
//��ʾʱ����ַ���	
	String message = sdf.format(date);
	System.out.println(message);
	
	
		
  }
}
