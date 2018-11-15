
public class Demo20 {
//求200以内所有偶数的和
  public static void main(String[] args)
  {
	int i = 2;
	int sum = 0;
	do{
	  sum = sum + i;	
	  i = i + 2;
	}while(i<=200);
	System.out.println("sum="+sum);
  }
}
