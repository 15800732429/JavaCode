
public class Demo9 {
//%:求余数
//1 负数的余数依然是负数
//2   浮点数的余数依然是浮点数	
  public static void main(String[] args)
  {
	int num1 = 12,num2 =11;
	int result1 = num1 % num2;
//10 / 11    商是0，余数10
//12 / 11         商是1，余数1	
	System.out.println("result1 ="+result1);
//	负数的余数依然是负数
	int num3 = -10,num4 = 3;
//-10 / -3 ,商是3，余数是-1	
	int result2 = num3 % num4;
	System.out.println("result2 ="+result2);
//  浮点数的余数依然是浮点数
	double num5 = 100.1;
	int num6 = 10;
	double result3 = num5 % num6;
	System.out.println("result3 ="+result3);
	
	
	
	
	
  
  }
}
