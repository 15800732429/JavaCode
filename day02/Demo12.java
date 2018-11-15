
public class Demo12 {
//int num1 = 1000
//int sum = ++num1 + ++num1 + ++num1
//sum = ？  num1 = ？	
  public static void main(String[] args)
  {
	int num = 1000;
	int sum = ++num + ++num + ++num;
//第1个++num：         num：1001    ++num：1001
//第2个++num：         num：1002    ++num：1002
//第3个++num：         num：1003    ++num：	1003
//把3个++num表达式的值加在一起：3006
//最后把3006赋值给sum	
	System.out.println("num = "+num);
	System.out.println("sum = "+sum);
  }
}
