
public class Demo13 {
//循环嵌套：一个循环内部有嵌套一个循环
//外层循环执行一次，内层循环会执行全部
//for循环的嵌套
//打印”*“,外层控制打印的行数，内层控制打印每个
//”*“的个数（内层循环每次只打印一个”*“），并控制换行
  public static void main(String[] args){
	 for(int i=1;i<=3;i++){//行数
//内层每次循环只打印一个”*“号，可以使用for循环
	   for(int j=1;j<=5;j++){
		 System.out.print("*");
	   }
	   System.out.println();//换行
	 }
  }
  
  
}
