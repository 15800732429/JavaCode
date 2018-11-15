import java.util.Scanner;
public class Demo10 {
//带返回值无参数的方法：
//1）return：方法最后一行，a） 把方法最终结果
//返回到调用端（谁调用这个方法，就把结果返回给谁）。
//b）终止当前的方法，return以后的内容都不执行
//2）一个方法只能有一个返回的结果
//3）返回的结果的类型，必须跟返回值类型一致
	
//调用一个方法，实现从控制台任意输入两个整数，求和，
//并把最终的结果，返回到main方法中，显示	
  static int add(){//创建Scanner	
Scanner scanner=new Scanner(System.in);
	System.out.println("请输入第1个数：");
	int num1 = scanner.nextInt();
	System.out.println("请输入第2个数：");
	int num2 = scanner.nextInt();
	int result = num1+num2;
	return result;
  }	//result返回到调用端add（）
  public static void main(String[] args){
	int sum = add();//返回结果赋值给sum
	System.out.println("sum="+sum);
  }
	
	
	
	
	
	
}
