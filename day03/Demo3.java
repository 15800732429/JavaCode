
public class Demo3 {
//i = 200  sum = ++i + i++ + i++
  public static void main(String[] args){
	int i = 200;
	int sum = ++i + i++ + i++;
//604
//第1个++i：  	 i ： 201      ++i : 201
//第2个i++:   i++: 201     i: 202
//第3个i++：      i++： 202     i： 203
	System.out.println("i = "+i);
	System.out.println("sum = "+sum);
  }
}
