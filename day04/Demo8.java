import java.util.Scanner;
public class Demo8 {
//任意输入一个整数，判断该整数是奇数还是偶数
//输出时奇数还是偶数，使用if...else...	
//偶数：能被2整除的数
//奇数：不能被2整除的数	
  public static void main(String[] args)
  {
//1 导入Scanner
//2  创建Scanner对象	
	Scanner scanner = 
		       new Scanner(System.in);
//3 定义num变量用来接收用处输入的整数
	System.out.println("请输入要判断整数：");
	int num = scanner.nextInt();
//4 编写if...else
//	if(num%2!=0) ------奇数 else ---偶数  
    if(num%2!=0){
      System.out.println(num+"是奇数！");
    }else{//偶数，if的相反条件
      System.out.println(num+"是偶数！");	
    }
  }
}




