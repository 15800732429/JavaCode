
public class Demo1 {
//整数数据类型：byte,short,int,long
//byte:跟上传下载有关
//short：使用极少，取值范围太小
//int： 最为常用，取值范围约-21亿到21亿	
//long：超过int的取值范围都使用long
  public static void main(String[] args)
  {
	int numInt = 1000000;// 0
	System.out.println("numInt="+numInt);
    long numLong1 = 100;
    System.out.println("numLong1="+
    		numLong1);
    long numLong2 = 10000000000L;
//赋值的时候，赋的那个值称为整型常数，默认数据类型
//是int，如果超过int的取值范围，则报错
//我们可以强制的在整型常数的后面加上l或L，可以把该
//常数变为long类型的    
    System.out.println("numLong2="+
    		numLong2);
  }
}
