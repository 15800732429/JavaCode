
public class Demo15 {
/*了解
 * 1*1 = 1
 * 1*2 = 2  2*2 =4
 * 1*3 = 3  2*3 =6  3*3 = 9
 * 1*4 = 4  2*4 =8  3*4 = 12  4*4 = 16
 * ...
 * 分析：外层控制行数i
 * for(int i=1;i<=9;i++){//行数
 *   for(int j=1;j<=i;j++){//算式个数
 * System.out.print(i+"*"+j+"="+i*j);
 *   }
 *   System.out.println();
 * }
 */
  public static void main(String[] args){
//外层循环控制总的行数，内层循环控制算式出现的个数
	for(int i=1;i<=9;i++){//行数
      for(int j=1;j<=i;j++){//算式出现的个数
    	int result = i*j;
System.out.print(i+"*"+j+"="+result+"  ");
      }
      System.out.println();
	}
  }
	
	
	
	
	
	
	
	
	
	
	
	
}
