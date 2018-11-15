import java.util.Scanner;
public class Demo13 {
//设计一个方法，从main方法中接收参数num1，num2
//的值，然后执行加法操作，并把结果返回给调用端，
//在main中输出其结果
//可以从main方法任意的输入两个参数的值	
  static int add(int num1,int num2){
	int result = num1 + num2;
	return result;
  }
  public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
    System.out.println("请输入第1个数：");
    int a = scanner.nextInt();
    System.out.println("请输入第2个数：");
    int b = scanner.nextInt();
    int sum = add(a,b);
    System.out.println("sum="+sum);
  }
}
