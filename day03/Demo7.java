
public class Demo7 {
//复合赋值运算：+=,-=,*=,/=,%=
//建议：看懂就可以了，使用较少，不便于阅读代码	
		
  public static void main(String[] args)
  {
	int i = 10;
	i += 1;//等价于： i = i+1；
	System.out.println(i);//11
	i %= 10;//等价于：i = i%10
	System.out.println(i);
  }
}
