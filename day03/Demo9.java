
public class Demo9 {
//关系运算符：==（等于）,!=（不等于）,>,>=,<,<=
//关系表达式：用关系运算符连接的表达式
//关系表达式最后一定要有一个结果boolean（true或
//false）
//算术运算符> 关系运算符 > 赋值运算符
  public static void main(String[] args)
  {
	int num1 = 100,num2 = 120;
	boolean result = num1 == num2;
//分析：首先执行 num1 == num2，结果false，最后
//false赋值给result
	System.out.println("result ="+result);
	
	boolean result2 = num1+300 != num2;
//分析：首先num1+300，结果400，然后400！=num2，
//结果true，最后true赋值给result2
	System.out.println("result2="+result2);
	boolean result3 = num1<=num2;
	System.out.println("result3="+
			result3);
	
	
	
	
	
  }
}
