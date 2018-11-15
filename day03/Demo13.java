
public class Demo13 {
//条件运算符：表达式1 ？ 表达式2 ：表达式3
//运算规则：如果表达式1为true，则整个表达式结果
//就是表达式2，如果表达式1为false，则整个表达式
//结果就是表达式3
//求两个数中的最大值
  public static void main(String[] args)
  {
	int num1 = 100,num2 = 200;
	int max = num1>=num2 ? num1 : num2;
//	                           表达式1         表达式2     表达式3
//              判断条件         结果1     结果2
	System.out.println("两个数中较大的值是："
			+max);
  }
	
}
