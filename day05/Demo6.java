
public class Demo6 {
//1 2 3 4 5 6 7 8 9 10 ...
//	2   4   6   8   10 ...
//求出100以内所有的偶数，但这次在while中我们不
//再使用if语句来进行筛选，通过修改控制循环次数i
//的增量来实现,以前i++或++i，这次i=i+2;	
//int i = 2;
//while(i<=100){
//	System.out.println(i);
//	i = i + 2;
//}	
//2 4 6 8...100	
	
  public static void main(String[] args)
  {
	int i = 2;
	while(i<=100){
	  System.out.println(i);
	  i = i+2;
	}
  }
	
	
	
	
	
	
	
	
	
	
	
	
}
