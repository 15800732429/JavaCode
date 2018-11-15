
public class Demo15 {
//do...while
//语法格式：
//do{
//	循环体语句
//}while（条件）;
//不管条件true还是false,永远都先执行一次循环体
//语句，如果条件为true，继续执行循环体...直到
//条件为false，退出循环
  public static void main(String[] args){
//打印5行：学习java，太累了。。。求放假
	int i =1;
	do{
	  System.out.println("学习java，" +
	  		"太累了...求放假");	
	  i++;
	}while(i<=5);
  }
}








