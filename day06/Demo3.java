
public class Demo3 {
//用for和if语句，结合使用，输出100以内所有的偶数
//2种方法  
  public static void main(String[] args){
//	1 方法1
	for(int i=1;i<=100;i++){
//	  if过滤：i%2余数为0，i就是偶数
      if(i%2==0){
    	System.out.println(i+"是偶数！");
      }
	}
  }
}
