public class Demo18 {
//1 数组：保存相同类型的多个变量
//	    内存中的一段连续的存储单位
//2 创建数组的方式：new开辟存储空间
//  数据类型[] 数组名 = new 数据类型[n]
//	n：数组中变量的个数
//3 元素：数组中的变量
//4 下标：用来标识数组每一个元素
//	数组下标从0开始,一直到最后,第1个元素的下标是0
//5 数组的长度：数组名.length(元素个数)  
  public static void main(String[] args){
//  定义一个整型数组
	int[] ary1 = new int[5];
//	ary1中第1个元素赋值12
	ary1[0] = 12;
System.out.println("ary1[0]="+ary1[0]);
//	给ary1[]中最后一个元素赋值100
    ary1[4] = 100;
System.out.println("ary1[4]="+ary1[4]);
    System.out.println("ary1的长度："+
    		ary1.length);
  }
	
}
