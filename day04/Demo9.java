import java.util.Scanner;
public class Demo9 {
//任意输入两个数，把最大的数输出（if...else）
  public static void main(String[] args){
//1  导入Scanner	
//2 创建Scanner对象
	Scanner scanner =
		    new Scanner(System.in);
//3 定义变量num1和num2用来接收用户输入的两个整数
	System.out.println("请输入第1个数：");
	int num1 = scanner.nextInt();
	System.out.println("请输入第2个数：");
	int num2 = scanner.nextInt();
//4 if...else	  
	if(num1>=num2){
	  System.out.println("num1较大："+num1);
	}else{
	  System.out.println("num2较大："+num2);
	}
  }
}



