public class Demo8 {
//算术运算符：+，-，*，/，%
//1 参与运算的两端的数据必须是同一类型
//2 运算的结果，跟参与运算的数据最后类型一致
  public static void main(String[] args)
  {
	float numFloat = 20.1f;
	int numInt = 18;
	float result1 = numInt + numFloat;
//分析：首先numInt由int类型自动转化为float类型
//(18.0f),然后执行numInt加上numFloat,最后把
//结果赋值给result1
	System.out.println("result1="+result1);
    int numInt2 = 9,numInt3 = 10;
    double numDouble =
    	      numInt2 / numInt3;
//分析：首先numInt2跟numInt3是同一个数据类型，
//直接执行除法运算，结果必须跟numInt2和numInt3
//同一个数据类型 （结果0.9，类型必须是整数，舍弃
//小数点以后所有的内容 ），结果是0 ，自动类型转化
//0.0，赋值给numDouble
    System.out.println(numDouble);
  
  
  
  
  
  }
}
