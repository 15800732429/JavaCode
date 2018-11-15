public class Demo12 {
//求闰年：能被4整除并且不能被100整除，或者能被400
//整除，这样年份就是闰年
//分析:	
//1）整除的判断的方式：余数为0
//	能被4整除 ： 			year%4 ==0
//  不能被100整除:			year%100 !=0
//	能被400整除:          year%400 ==0
//2） 多个条件之间逻辑关系？
// 能被4整除并且不能被100整除，或者能被400整除
//（year%4==0&&year%100！=0）||year%400==0   	
  public static void main(String[] args)
  {
	int year = 2002;
	boolean result = 
(year%4==0 && year%100!=0)||year%400==0;
	System.out.println(
	year+"是闰年吗？"+result);
  }


}
