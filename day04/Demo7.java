import java.util.Scanner;
public class Demo7 {
//从控制台任意输入一个整数，判断该整数是是否是闰年
//如果是闰年，则输出闰年，反之，输出不是闰年
//使用if...else实现  
  public static void main(String[] args){
//1 导入Scanner
//2 创建Scanner对象
	Scanner scanner = 
		new Scanner(System.in);
//3 定义变量year接收用户输入的整数
    int year = scanner.nextInt();
//4 if(闰年判断条件)
//（year%4==0&&year%100！=0）||
//	                      year%400==0
    if((year%4==0&&year%100!=0)||
    		            year%400==0){
      System.out.println(year+"是闰年");
    }
//5 else：不要加入任何的条件，else本身就是if
//		的相反条件
    else{
      System.out.println(year+"不是闰年");
    }
  }

	
	
	
	
	
}
