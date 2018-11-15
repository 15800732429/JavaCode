
public class Demo11 {
//  int i = 100
//	int sum = ++i + ++i；
//	sum = ?, i = ? 
  public static void main(String[] args)
  {
	int i = 100;
	int sum = ++i + ++i;
//先第1个++i：          i（101）       ++i（101）
//再执行第2个++i：   i（102）       ++i（102）
//最后两个++i的表达式的值相加结果赋值给sum	
	System.out.println("i="+i);
	System.out.println("sum="+sum);
  }
}
