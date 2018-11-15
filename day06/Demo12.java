
public class Demo12 {
//continue：结束本次循环，继续下次循环
  public static void main(String[] args){
//不输出i=7	
	for(int i=1;i<=10;i++){
	  if(i==7){
		  continue;
//结束本次循环，在本次循环中，continue后面代码
//不再执行了，继续开始下次循环（i++）	  
	  }
	  System.out.println(i);
	}
  }
}
