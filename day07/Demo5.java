public class Demo5 {
//用于针对数组元素遍历for循环
//for(数据类型 变量名：数组的名字){
//	对变量的操作
//}	
//功能：仅仅用于显示数组中每一个元素	
//变量就是数组中元素值
  public static void main(String[] args){
	int[] ary = new int[3];
	ary[0] = 12;
	ary[1] = 19;
	ary[2] = 22;
	for(int a : ary){
	  System.out.println(a);
	}
  }
}
