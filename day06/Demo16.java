import java.util.Scanner;
public class Demo16 {
//switch语句：多分支选择语句
//switch(整型表达式){
//  case  整型数值1：
//	语句1
//	break;//退出switch语句
//	...
//	defaul: //都没有符合条件
//	  语句n
//}	
//输入数字，1对应注册，2对应登录，其他，请重新操作	
  public static void main(String[] args){
//	创建Scanner对象
  Scanner scanner=new Scanner(System.in);
//	定义变量num用来接收用户输入的数字
    int num = scanner.nextInt();
    switch(num){
      case 1:
    	  System.out.println("注册");
    	  break;
      case 2:
    	  System.out.println("登录");
    	  break;
      default:
    	  System.out.println("请重新操作");    } }

}
