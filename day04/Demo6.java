
public class Demo6 {
//if...else跟if比较，永远都会执行其中一条语句
//要么执行if语句，要么执行else语句
//结构：if(条件){
//		语句1
//	   }else {
//	         语句2
//	   }
//规则：如果条件为true，执行语句1，反之为false，
//执行语句2	
  public static void main(String[] args){
	int age = 10;
	if(age>=18){
	  System.out.println("你可以注册了");
	}else{//if的相反条件
	  System.out.println("再等几年...");
	}
  }
//从控制台任意输入一个整数，判断该整数是是否是闰年
//如果是闰年，则输出闰年，反之，输出不是闰年
//使用if...else实现  
}
