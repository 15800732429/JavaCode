package com.tarena.string2;

public class Demo1 {
//String ：
  public static void main(String[] args) {
//1 split("标识"):通过标识把一个字符串分割成
//	一个字符串数组  
	String str1=
"哪些年我们追过的女孩,紫川,三国志,红楼梦";
	String[] strs = str1.split(",");
	for(String str : strs){
	  System.out.println(str);
	}
//2 endsWith(str):判断一个字符串是否以str结尾，
//	如果是返回true，反之为false
	String str2="构造方法.bmp";
	System.out.println("判断str2是否以.bmp" +
		"结尾"+str2.endsWith(".bmp"));
//3 startsWith(str):判断一个字符串是否以str开头，
//	如果是返回true，反之为false
	String str3="终于快下课了";
	System.out.println("str3是否以“终于”" +
		"作为开头"+str3.startsWith("终于"));
//4 统计字符出现的位置的下标
//	1）indexOf(char)：统计char字符第1次出现
//	位置的下标
//	2）lastIndexOf(char):char字符最后一次
//	出现的位置的下标
//	这两个方法同时重载类2个相似功能的方法，只是
//	用来判断字符串出现的位置下标
	String str4="今天是java的第14天";
//	             0 1234
//统计字母“a”第1次出现的位置的下标
	System.out.println("a出现的位置的下标："
			+str4.indexOf('a'));
//字母“a”最后一次出现的位置的下标
	System.out.println("a最后一次出现" +
	"位置的下标"+str4.lastIndexOf('a'));
	String str5="liuyingqianliu";
	System.out.println("liu第1次出现位置："
			+str5.indexOf("liu"));
	System.out.println("liu最后一次出现的位置："
			+str5.lastIndexOf("liu"));
//5 length()：统计当前字符串中字符的个数
	System.out.println(str5.length());
	
//应用String中方法来执行一个操作
//	判断一个字符串中的内容是否是数字
//	eg：  “a”  “12000” ---》 12000
//	           String ---》int
//	只要单个的数字，“9”
	String num= "b";
    int index = 
    	"0123456789".indexOf(num);
    if(index==-1){
    	System.out.println("不是数字");
    }else{
    	System.out.println("是数字");
    }
    
  }
}
