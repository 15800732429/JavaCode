
public class Demo5 {
//判断闰年
  public static void main(String[] args){
//	定义年份：
	int year = 2000;
	String result =
(year%4==0&&year%100!=0)||year%400==0?
		"是闰年" : "不是闰年";
	System.out.println(year+result);
  }
}
