
public class Demo12 {
//带参数的方法：
//1 形参：当方法被调用的时候，系统临时开辟的存储
//空间，用来保存实参传递过来的值	
//2 实参：真实存在的变量，是把实参的值复制形参中
//3 值得传递：把实参的值复制到形参中
//4 形参的改变对实参没有任何的影响
  static void update(int num1){
//	num1是形参  
	num1 = num1-1;
	System.out.println("形参num1="+num1);
  }
  public static void main(String[] args){
	int num = 20;
	update(num);//num是实参
	System.out.println("实参num="+num);
  }
}
