import java.util.Scanner;
public class Demo11 {
//Scanner可以使用double类型
//scanner.nextDouble():可以在控制台输入double
//类型
//在sub方法中，任意输入两个小数，求这个两个数差，
//并且把该结果返回到main中，显示
  static double sub(){
//创建Scanner对象
Scanner scanner=new Scanner(System.in);
    System.out.println("请输入第1个数：");
	double num1 = scanner.nextDouble();
    System.out.println("请输入第2个数：");
    double num2 = scanner.nextDouble();
    return num1-num2;//返回num1-num2结果
  }
  public static void main(String[] args){
	double result = sub();
	System.out.println("result="+result);
  }
}




