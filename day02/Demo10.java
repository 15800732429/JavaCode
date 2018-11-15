
public class Demo10 {
//自增：前置，++运算符放到变量的前面
//++i：变量i的值，++i表达式的值
//++i运算规则：首先i+1的值赋值给i，然后把i
//（加1以后的值）作为++i整个表达式的值	
//规律：前置++运算，变量的值跟++表达式的值一样
  public static void main(String[] args)
  {
	int num = 100;
	int result = ++num;
//分析：首先num=num+1，然后把当前num的值（101）
//作为++num整个表达式的值（101），最后++num
//表达式的值赋值result	
  }
}


