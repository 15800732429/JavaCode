public class Demo3 {
//定义50个元素的数组，从1开始到100之间的偶数，  
//分别给该数组元素赋值，2*（i+1）
//分析：偶数：2,4,6,8,10...100
//for(i = 0;i<数组的长度;i++){
//  数组名[i] = (i+1)*2;	
//}
  public static void main(String[] args){
	int[] ary = new int[50];
	for(int i=0;i<ary.length;i++){
	  ary[i] = (i+1)*2;
	  System.out.println(ary[i]);
	}
  }	
  
}
