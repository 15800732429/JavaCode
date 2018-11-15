
public class Demo14 {
//判断一个年份，是否是闰年，如果是闰年，输出闰年，
//如果不是闰年，输出不是闰年
//1 如何输出不同的结果	
//	String ：给String赋不同的值，以此来输出不同
//	的结果
//2 如何判断闰年？
//能被4整除并且不能被100整除，或者能被400整除
//  boolean flag = 
//(year%4==0 && year%100!=0)||
//	                       year%400==0
//3 利用条件运算符：整合起来
//	String result = 
//	         flag ? "是闰年" : "不是闰年"
  public static void main(String[] args){
//	1 定义变量：year（年份），result（输出结果）
//	         flag（判断是否是闰年）
	int year;
	String result;
	boolean flag;
//  2 year赋值
	year = 2001;
//	3 判断year是否是闰年，并且把判断结果给flag 
//能被4整除并且不能被100整除，或者能被400整除	
	flag =
(year%4==0 && year%100!=0)||year%400==0;	
//	4 条件运算符:把flag作为表达式1，如果flag为
//	 true，（“是闰年”）表达式2作为结果，反之
//	 flag为false，（“不是闰年”）表达式3作为结果
//	 把条件运算最后的结果给result
	result = flag ? "是闰年" :"不是闰年";
//	5 输出result的值  
	System.out.println(year+result);
  }	
	
	
	
	
	
	
	
	
	
	
	
}
