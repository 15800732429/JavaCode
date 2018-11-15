import java.util.Scanner;
public class Demo3 {
//使用引用类型Scanner
//1 导入Scanner
//2 根据Scanner工具类型，创建scanner对象
//  Scanner scanner = 
//	           new Scanner(System.in);
//3 调用scanner中功能：
//scanner.nextInt();从控制台输入一个整数
  public static void main(String[] args)
  {
//根据工具类型Scanner，来创建其对象  
	Scanner scanner =
		 new Scanner(System.in);
//调用scanner中输入整数的功能
	int num = scanner.nextInt();
	System.out.println("你输入的数字是："
			+num);
	
  }
}
