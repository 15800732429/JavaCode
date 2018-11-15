
public class Demo11 {
//赋值 < 逻辑 < 关系 < 算术
  public static void main(String[] args){
	int num1 = 10,num2 = 20,num3 =100;
	boolean result1 = 
num1+100>2000 && num2+num1>1000
               && num1+num2+num3!=10000;
//第1步（算术）：      num1+100       110
//      num2+num1      30 
//   num1+num2+num3    130
//第2步（关系）：     110>2000       false  
//      30>1000        false
//      130!=10000      true
//第3步（逻辑）：整体             false
//第4步（赋值）： false 赋值给result1
     System.out.println(result1);
  
  }
}
