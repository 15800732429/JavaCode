
public class Demo5 {
//求出2000到3000之间所有的偶数
//1 取值的范围从2000开始，控制循环的变量i的值
//初值从2000开始
  public static void main(String[] args)
  {
	int i = 2000;
	while(i<=3000){
	  if(i%2==0){//偶数
		System.out.println(i+"是偶数");
	  }
	  ++i;
	}
  }
}
