
public class Demo8 {
//数组元素的默认值：
  
  public static void main(String[] args){
//	1 数字 : 整型数组默认值就是0
//	                浮点型数组默认值是0.0
	long[] ary1 = new long[3];
	System.out.println(ary1[0]);
	double[] ary2 = new double[3];
	System.out.println(ary2[0]);
//	2 字符：不用考虑，企业开发基本都是使用字符串
//	3 字符串：引用类型数组默认值是null
//	null：空，专门用来表示引用类型中的值不存在
	String[] ary3 = new String[5];
	System.out.println(ary3[0]);
//  4 boolean：boolean数组的默认值false
	boolean[] ary4 = new boolean[6];
	System.out.println(ary4[0]);
	
	
	
	
	
	
	
	
  }
}
