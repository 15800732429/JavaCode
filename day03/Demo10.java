
public class Demo10 {
//逻辑运算符：！（逻辑反），||（逻辑或），&&（逻辑与）
//逻辑运算符用来连接多个不同的条件
//重点使用||（或者） 和 &&（并且）
//||：只要连接的关系表达式中有一个为true，则整个
//表达式都为true
//&&：只要连接的关系表达式只有一个为false，则整个
//表达式都为false
  public static void main(String[] args)
  {
//	!：取反
	boolean result1 = 12>100;
	System.out.println("result1="
			+result1);
    System.out.println("!result1="
    		+!result1);
//||: 或者，有一个表达式为true，整个表达式就是true
    int num1 = 100,num2 = 200,num3=1000;
    boolean result2 = 
     num1>100 || num2>200 || num3==1000;
//     false       false       true  
     System.out.println("result2 ="+result2);
//&&: 并且，有一个表达式为false，整个表达式就是false
    boolean result3 = 
  num1==100 && num2==200 && num3!=1000;
//  true         true          false
    System.out.println("result3="+result3);
    
  
  }
	
	
	
	
	
}
