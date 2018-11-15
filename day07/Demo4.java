
public class Demo4 {
//把1,3,5,7,9...19，20以内的奇数，赋值给一个
//整型数组中每一个元素，倒叙输出数组中的每个元素值
//提示：赋值： 2*（i+1）-1	
//	  倒叙输出，数组的下标的取值应该length-1到0
//	 i--
  public static void main(String[] args){
//	创建数组
	int[] ary = new int[10];
//	给数组中每个元素赋值：i永远用来当成数组元素的
//	下标，用来标识每个数组的元素，i的取值从0开始
//	ary[i] = 2*（i+1）-1
	for(int i=0;i<ary.length;i++){
	  ary[i] = 2*(i+1)-1;
	}
//	倒叙输出：通过循环控制变量i的取值变化，进而
//	控制数组中元素，i的初值数组的最后一个元素的
//	下标length-1，循环的条件就是i>=0
	for(int i=ary.length-1;i>=0;i--){
	  System.out.println(
		"ary["+i+"]="+ary[i]);
	}
	
	
	
	
  }
}
