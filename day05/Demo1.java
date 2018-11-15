
public class Demo1 {
//while:
//语法结构：while(表达式){
//	                 循环体语句
//       }	
//规则：只要表达式为true，就执行循环体语句，执行完
//循环体语句，继续判断表达式，true继续执行循环体
//语句，直到表达式为false，退出循环
  public static void main(String[] args){
//打印5行“***********”
//把输出语句：System.out.println("***********");
//反复执行5次，关键如何控制循环的次数
	int i = 1;
	while(i<=5){
	  System.out.println("********");
	  ++i;
	}
	  
	  
  }
}
