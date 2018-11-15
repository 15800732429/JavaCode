public class Demo14 {
//1/1+1/2+1/3+1/4+1/5+...+1/100
//分析：分子都是1，分母是从1到100
//累加： sum = 0；
//第1次：sum = sum +1/1;
//第2次：sum = sum +1/2;
//第3次：sum = sum +1/3;
//	...
//第100次：sum = sum + 1/100
//归纳公式： sum = sum + 1.0/i(i的取值1到100)
//1.0/i:自动类型转化，结果是double类型
  public static void main(String[] args){
	double sum = 0;
	int i = 1;//i的取值范围从1到100
	while(i<=100){
//	  System.out.println(1.0/i);
	  sum = sum + 1.0/i;
	  i++;
	}
	System.out.println("sum="+sum);
  }
	
	
	

  
}
