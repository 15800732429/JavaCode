
public class Demo9 {
//300以内所有偶数的和（for）
//分析：
//1 取值的范围：1到300，控制循环次数的变量i的取值
//从1到300
//2 偶数的筛选方式：i%2==0，偶数
//3 累加 ：sum = sum + i；
  public static void main(String[] args){
	int sum = 0;
	for(int i=1;i<=300;i++){
	  if(i%2==0){//偶数
		 sum = sum + i;
	  }
	}
	System.out.println("sum = "+sum);
  }
}




