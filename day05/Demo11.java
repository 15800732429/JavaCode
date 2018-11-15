
public class Demo11 {
//1+2+3+4+5+6+...+180 = ? 
//int sum = 0;//sum保存累加以后的结果
//第1次：sum = sum + 1；
//第2次：sum = sum + 2；
//第3次：sum = sum + 3；
//第4次：sum = sum + 4；
//第5次：sum = sum + 5;	
//	...
//第180次： sum = sum + 180；
//定义变量i ，取值从1到180（i=1）
//归纳公式：sum = sum + i；
//while(i<=180){
//    sum = sum + i;
//	  i++;
//}
  public static void main(String[] args){
	int i = 1;//i的取值从1到180
	int sum= 0;
	while(i<=180){
	  sum = sum + i;
	  i++;
	}
	System.out.println("sum="+sum);
  }
	
	
	
	
	
	
	
	
	
	
	
	
}

