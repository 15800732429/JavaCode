
public class Demo5 {
//求出3000年以内的闰年，利用for实现
  public static void main(String[] args){
	for(int i=1;i<=3000;i++){
	  if((i%4==0&&i%100!=0)||i%400==0){
		  System.out.println(i+"是闰年");
	  }
	}
  }
}
