import java.util.Scanner;
public class Demo10 {
//买咖啡，每杯咖啡价格是5元，优惠的规则：买第1杯
//原价，买第2杯开始，半价
//比如买1杯，5元
//比如买3杯，第1杯5元，从第2杯到第3杯，2.5元
//总价：10
//功能：用户输入购买杯数，输出应付总价
//分析：
//变量：num（购买杯数），total（总价）
//	   price（咖啡单价）：5
//流程：分类
//1） 只买1杯                
//	total：5元
//2）买多杯  total=
//	          price+(num-1)*0.5*price;                 
//3） 0杯				total：0	
  public static void main(String[] args){
//	1 定义变量：total必须定义double
	int price =5,num;
	double total=0;
//	2 创建Scanner对象
Scanner scanner=new Scanner(System.in);
//	3 num用来接收用户输入的杯数
    System.out.println("请输入购买的杯数：");
	num = scanner.nextInt();
//	4 if分类：1杯，多杯，0杯
	if(num>0){
	  total=price+(num-1)*0.5*price;
	}else{
	  total=0;
	}
	System.out.println("应付："+total);
//	if(num==1){
//	  total = price;
//	}
//	if(num>1){
//	  total=price+(num-1)*0.5*price;
//	}
//	if(num==0){
//	  total=0;
//	}
//	System.out.println("应付："+total);
  }
	
	
	
	
	
	
	
	
	
	
}
