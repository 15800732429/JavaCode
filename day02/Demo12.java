
public class Demo12 {
//int num1 = 1000
//int sum = ++num1 + ++num1 + ++num1
//sum = ��  num1 = ��	
  public static void main(String[] args)
  {
	int num = 1000;
	int sum = ++num + ++num + ++num;
//��1��++num��         num��1001    ++num��1001
//��2��++num��         num��1002    ++num��1002
//��3��++num��         num��1003    ++num��	1003
//��3��++num���ʽ��ֵ����һ��3006
//����3006��ֵ��sum	
	System.out.println("num = "+num);
	System.out.println("sum = "+sum);
  }
}
