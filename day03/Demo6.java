
public class Demo6 {
//  i = 10�� result = i++ + i-- + --i	
  public static void main(String[] args)
  {
	int i = 10;
	int result = i++ + i-- + --i;
//��1��i++��   	 i++ :10         i : 11
//��2��i--��      i-- :11         i : 10
//��3��--i��      i��	9           --i �� 9
	System.out.println("result = "+result);
  }
}
