
public class Demo7 {
//强制类型转化：由大范围数向小范围数转化，容易出现
//精度损失
//强制类型转化的格式：（要转化的数据类型）数据
  public static void main(String[] args)
  {
//	损失精度  
	double numDouble = 19.8;
	int numInt = (int)numDouble;
//分析：首先numDouble要强制的由double类型转化
//为int类型，这个转化会损失精度，小数点以后的数字
//全部舍弃	
	System.out.println("numInt="+numInt);
//  不损失精度
	long numLong = 1000;
	short numShort = (short)numLong;
	System.out.println("numShort="
			+numShort);
  }
}
