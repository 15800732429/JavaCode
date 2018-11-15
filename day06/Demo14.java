
public class Demo14 {
//*  
//**  
//***  
//****
//*****
//******
//分析：外层循环，控制行数(i)
//for(int i=1;i<=6;i++){
//内层确定每行打印”*“的格式，及换行
//规律：每行”*“的个数，跟行数一致的
//	for(int j=1;j<=i;j++){控制打印”*“的个数
//  j的取值是从1到i（当前的值）
//	  System.out.print("*");
//  }
//}
  public static void main(String[] args){
//外层控制打印的行数（i），内层控制打印”*“的个数
//行数跟每行个数一致，内层循环执行的次数跟当前
//行数一致的（”*“个数j，j的取值1到i）
	for(int i=1;i<=10;i++){
	  for(int j=1;j<=i;j++){
//	j的取值从1到i，内层循环执行的次数跟行数一致了
		System.out.print("*");
	  }
	  System.out.println();
	}
  }
	
	
	
	
	
	
	
	
}
