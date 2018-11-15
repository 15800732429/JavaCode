
public class Demo13 {
//自减：--，
//--i：把变量i的值减一
//变量i的值，表达式--i的值
//--i运算的规律：首先i-1的值赋值给i，然后把i减完
//以后的值作为--i表达式的值
  public static void main(String[] args)
  {
	int num = 10;
//	int result = --num;
//分析：首先num-1的值赋值给num，然后把num减完以后
//值作为--num表达式的值，最后把--num表达式的值
//赋值给result
//	System.out.println("result="+result);
//	System.out.println("num="+num);
//	result = --num + --num
	int result2 = --num + --num;
//第1个--num：       num ：9      --num：9 
//第2个--num：       num ：8      --num：8	
//把两个--num表达式的值相加： 17
//把17赋值给result2
	System.out.println("result2="+result2);
	System.out.println("num="+num);
	
	
	
  }
}
