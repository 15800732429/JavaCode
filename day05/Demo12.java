
public class Demo12 {
//求出100以内所有偶数的和
//分析：
//	1 数据：从1到100，控制循环次数变量i的取值
//	   初值是1，都100为止
//	2 偶数：筛选从1到100中选出所有的偶数
//	  if（i%2==0）-----》i是偶数
//	3 累加：sum = 0
//	  公式：sum = sum + i;
  public static void main(String[] args){
	int i = 1,sum = 0;
	while(i<=100){
//i中的偶数过滤出来
	  if(i%2==0){
		sum = sum + i;
	  }
	  i++;
	}
	System.out.println("sum="+sum);
  }
}
