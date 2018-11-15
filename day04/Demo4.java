import java.util.Scanner;
public class Demo4 {
//从控制台输入一个任意的整数，判断该整数是否是偶数
  public static void main(String[] args) {
//	1 导入Scanner
//	2 根据Scanner工具类创建其对象(固定格式)
	Scanner scanner =
		       new Scanner(System.in);
//	3 定义变量num接收输入的参数
	System.out.println("请输入一个整数：");
	int num = scanner.nextInt();
//	4 if语句
	if(num%2==0){
		System.out.println(num+"是偶数");
	}
  }
}
