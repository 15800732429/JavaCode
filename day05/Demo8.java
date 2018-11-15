
public class Demo8 {
//求出3000年以内的所有的闰年
//分析：闰年的条件 
  public static void main(String[] args)
  {
	int i = 1;
	while(i<=3000){
//判断i的值是否是闰年
	  if((i%4==0&&i%100!=0)||i%400==0)
	  {
		 System.out.println(i); 
	  }
	  i++;
	}
  }
}
