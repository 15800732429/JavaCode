
public class Demo7 {
//倒序输出1到100
//100,99，98,97,96... ...5,4,3,2,1
//分析：控制循环次数的变量i，初值赋值为100，每次
//执行循环i--，循环的条件i>0（i的值每次循环都
//减1，执行100次以后，i的值为0，退出循环）
  public static void main(String[] args)
  {
	int i = 100;//初值
	while(i>0){
	  System.out.println(i);
	  i--;//i的值，每次循环都要减1
	}
	
  }
}








