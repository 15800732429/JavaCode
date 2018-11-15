
public class Demo2 {
//定义一个10元素数组，从1到10分别给数组中元素赋值
  public static void main(String[] args){
	int[] ary = new int[10];
	for(int i=0;i<ary.length;i++){
	  ary[i] = i+1;
	}
	for(int i=0;i<ary.length;i++){
	  System.out.println(ary[i]);
	}
  }//定义50个元素的数组，从1开始到100之间的偶数，  
}   //分别给该数组元素赋值，2*（i+1）


