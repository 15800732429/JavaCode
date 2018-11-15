
public class Demo3 {
//变量：内存中一块独立的存储空间
//1） 变量的名字和变量的类型（确定变量能保存的数据）
//2） 定义变量的格式：数据类型 变量名;
//3) "="赋值符号：把右边的数据赋值给左边的变量
//4) 同一个区域：变量名字不要重复
//5） 变量要先定义后使用
  public static void main(String[] args)
  {
//定义一个整形（int）的变量num1，用来保存整数
	int num1;//程序执行到这个位置，会在内存中
//开辟一个名字叫做a，用来保存整数的存储空间
//	把55这个数赋值给num1
	num1 = 55;
//	把num1的值，输出
//	System.out.println(变量的名字);输出变量值
	System.out.println(num1);
//	再把100赋值给num1,最后给num1赋的值会覆盖之前
//	的赋值，在num1当中，最后只存在100,曾经55被
//	覆盖
	num1 = 100;
	System.out.println(num1);
  }
	
}
