
public class Demo13 {
//分别求出100以内所有的偶数的和和奇数的和
//分析：偶数的和 和奇数的和应该用两个变量来保存
  public static void main(String[] args)
  {
	int i = 1;
	int sum1 = 0;//偶数的和
	int sum2 = 0;//奇数的和
	while(i<=100){
//	把i中的偶数和奇数分离，分别累加
	  if(i%2==0){
		sum1 = sum1 + i;//偶数和
	  }else{
		sum2 = sum2 + i;//奇数和
	  }
	  i++;
	}
	System.out.println("偶数和："+sum1);
	System.out.println("奇数和："+sum2);
	
	
	
  }
}
