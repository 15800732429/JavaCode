
public class Demo9 {
//��ϵ�������==�����ڣ�,!=�������ڣ�,>,>=,<,<=
//��ϵ���ʽ���ù�ϵ��������ӵı��ʽ
//��ϵ���ʽ���һ��Ҫ��һ�����boolean��true��
//false��
//���������> ��ϵ����� > ��ֵ�����
  public static void main(String[] args)
  {
	int num1 = 100,num2 = 120;
	boolean result = num1 == num2;
//����������ִ�� num1 == num2�����false�����
//false��ֵ��result
	System.out.println("result ="+result);
	
	boolean result2 = num1+300 != num2;
//����������num1+300�����400��Ȼ��400��=num2��
//���true�����true��ֵ��result2
	System.out.println("result2="+result2);
	boolean result3 = num1<=num2;
	System.out.println("result3="+
			result3);
	
	
	
	
	
  }
}
