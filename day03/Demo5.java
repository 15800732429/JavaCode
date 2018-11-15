
public class Demo5 {
  public static void main(String[] args)
  {
	int num = 100;
	num = num--;
//优先级：哪个运算符优先执行
//自减优先于赋值运算	
//首先确定num--表达式的值就是num的值（100），然后
//num = num-1(99)，最后把num--表达式的值赋值
//给num（num = 100）	
	System.out.println("num="+num);

  }
}
