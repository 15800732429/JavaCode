
public class Demo8 {
  public static void main(String[] args)
  {
	int i= 100;
	int sum = ++i + --i + i-- + i++;
//��1��++i��    i�� 101         ++i�� 101	
//��2��--i��    i�� 100         --i��	100
//��3��i--��    i--:100        i��99
//��4��i++��    i++��99         i��100
	System.out.println("sum = "+sum);
  }
}
