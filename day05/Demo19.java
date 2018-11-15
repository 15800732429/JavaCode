
public class Demo19 {
//求200以内所有偶数的和
  public static void main(String[] args)
  {
	int i = 1;
	int sum = 0;
	do{
	  if(i%2==0){ //偶数
		sum = sum + i;//累加
	  }	
	  i++;
	}while(i<=200);
	System.out.println("sum = "+sum);
  }
}
