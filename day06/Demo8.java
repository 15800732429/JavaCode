
public class Demo8 {
//1+2+3+...+300=? （for循环）  
//sum = 0
//第1次： sum = sum+1；
//第2次： sum = sum+2；
//第3次： sum = sum+3；
//	...
//第300次： sum = sum+300；
//定义一个变量i：i的取值从1到300(sum = sum + i;)
// int sum = 0;
// int i=1;
// while(i<=300){
//	sum = sum + i;
//	i++;
// }
  public static void main(String[] args){
	int sum = 0;
	for(int i=1;i<=300;i++){
	  sum = sum + i;
	}
	System.out.println("sum="+sum);
  }
	
	
	
	
	
	
	
	
	
	
	
	
}
