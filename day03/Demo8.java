
public class Demo8 {
  public static void main(String[] args)
  {
	int i= 100;
	int sum = ++i + --i + i-- + i++;
//第1个++i：    i： 101         ++i： 101	
//第2个--i：    i： 100         --i：	100
//第3个i--：    i--:100        i：99
//第4个i++：    i++：99         i：100
	System.out.println("sum = "+sum);
  }
}
