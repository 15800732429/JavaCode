
public class Demo11 {
//  int i = 100
//	int sum = ++i + ++i��
//	sum = ?, i = ? 
  public static void main(String[] args)
  {
	int i = 100;
	int sum = ++i + ++i;
//�ȵ�1��++i��          i��101��       ++i��101��
//��ִ�е�2��++i��   i��102��       ++i��102��
//�������++i�ı��ʽ��ֵ��ӽ����ֵ��sum	
	System.out.println("i="+i);
	System.out.println("sum="+sum);
  }
}
