import java.util.Scanner;
public class Demo11 {
//if语句嵌套：一个if语句的内部，又包含另外一个
//if语句	
//从控制输入一个人的年龄和工资，如果工资在10W以上
//年龄在25岁到35岁之间，就满足要求，否则不满足要求
//分析：首先外层if（salary>=100000）{
//	            if(age在25到35之间){
//	            	符合要求
//				}
//           }  
//age在25到35之间：age>=25&&age<=35
  
  public static void main(String[] args){
//1	创建Scanner对象
Scanner scanner=new Scanner(System.in);
//2 定义age，salary接收用户输入年龄和工资
    System.out.println("请输入您的年龄");
    int age = scanner.nextInt();
    System.out.println("请输入您的工资：");
    int salary = scanner.nextInt();
//3 编写外层if语句（salary>=100000）
    if(salary>=100000){
//4 编写内层if语句（age>=25&&age<=35）
      if(age>=25&&age<=35){
    	 System.out.println("符合要求");
      }else{
    	 System.out.println("不合适，岁数");  
      }
    }else{
      System.out.println("小伙，努力赚钱吧！");
    }

	  
  }	
	
	
	
	
	
	
	
	
	
	
	
	
}
