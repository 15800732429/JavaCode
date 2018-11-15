
public class Demo3 {
//求出100以内所有的偶数
//分析：1）如何求偶数？
//	     if（i%2==0） 偶数
//	   2）范围从1到100，把1到100之间的每一个
//	   数字都取出来，然后用if语句进行判断
  public static void main(String[] args)
  {
	int i = 1;
	while(i<=100){
//筛选：把i的每一次取值，都用if进行判断
	  if(i%2==0){
		System.out.println(i);
	  }
	  ++i;
	}
  }

}
