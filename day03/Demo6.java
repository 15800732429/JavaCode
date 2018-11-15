
public class Demo6 {
//  i = 10， result = i++ + i-- + --i	
  public static void main(String[] args)
  {
	int i = 10;
	int result = i++ + i-- + --i;
//第1个i++：   	 i++ :10         i : 11
//第2个i--：      i-- :11         i : 10
//第3个--i：      i：	9           --i ： 9
	System.out.println("result = "+result);
  }
}
