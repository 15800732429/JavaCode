public class Demo19 {
//通过for循环来操作数组中每一个元素
//充分利用数组中下标值，控制循环次数的变量i
//i作为数组元素的下标值
//int[] ary = new int[100];
//给ary中每一个元素赋值
//for(int i=0;i<ary.length;i++){
//	ary[i]= i;
//}	
//定义元素个数是200的数组，给每一个元素赋值从1开始
//一致到200为止，并且显示数组中每一个元素的值
  public static void main(String[] args){
	int[] ary = new int[200];
	for(int i=0;i<ary.length;i++){
	  ary[i] = i+1;
	  System.out.println(ary[i]);
	}
  }
	
	
	
	
	
	
	
	
	
	
	
}
