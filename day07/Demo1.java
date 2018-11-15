
public class Demo1 {
//定义含有100个整数的数组，给所有的元素赋值，从0开始
//赋值,一直到最后一个元素赋值99,从0到99给数组元素
//赋值(for),再输出数组每一个元素的值(for)
  public static void main(String[] args){
//	创建数组
	int[] array = new int[100];
//	利用for循环给数组array每个元素赋值：控制循环
//	次数的i，作为当前数组中每个元素的下标
	for(int i=0;i<array.length;i++){
	  array[i] = i;
	}
//	输出也使用for
	for(int i=0;i<=array.length-1;i++){
	  System.out.println(
"array["+i+"]="+array[i]);
	}
	
  }
}
