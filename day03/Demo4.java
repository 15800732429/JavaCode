
public class Demo4 {
//i--:先确定表达式i--的值（i当前的值），然后i=i-1
//i--：变量i的值跟表达式i--的值不一致
  public static void main(String[] args)
  {
	int num = 10;
	int result = num--;
//首先是num的值作为num--表达式的值（10），然后
//num = num-1，最后把num--表达式的值赋值给
//result
	System.out.println("num ="+num);
	System.out.println("result ="+result);
  }
}
