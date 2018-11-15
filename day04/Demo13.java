import java.util.Scanner;
public class Demo13 {
//根据输入还款的年份，计算当前还款利率
//默认情况下，利率double  rate = 10.0 （%）
//1年以内还款：  5折	   year<=1&&year>0
//3年以内还款：  6折        year<=3&&year>1
//5年以内还款：  8折        year<=5&&year>3
//10年以内还款：原利率  year<=10&&year>5
//20年以内还款	：利率上浮20% year<=20&&year>10
//30年以内还款：利率上浮50% year<=30&&year>20
  public static void main(String[] args){
	int year;
	double rate = 10.0;//原利率
	double realRate;
Scanner scanner=new Scanner(System.in);
  	System.out.println("请输入还款的年份（year）：");
  	year = scanner.nextInt();
  	if(year<=1 && year>0){
  	  realRate = 0.5 * rate; 
  	}else if(year<=3 && year>1){
  	  realRate = 0.6*rate;
  	}else if(year<=5 && year>3){
  	  realRate = 0.8*rate;
  	}else if(year<=10 && year>5){
  	  realRate = rate;
  	}else if(year<=20 && year>10){
  	  realRate = 1.2*rate;
  	}else {
  	  realRate = 1.5*rate;
  	}
  	System.out.println("当前利率："+realRate+"%");
  }	
	
	
	
	
}
