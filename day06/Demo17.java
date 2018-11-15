import java.util.Scanner;
public class Demo17 {
//根据输入分数（0~5），显示你的成绩（5分制度）	
//5-----优秀        4-----良好	   3-----中等
//2,1,0------不及格  
  public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
    System.out.println("请输入你的分数（5分制）：");
    int score = scanner.nextInt();
    switch(score){
    case 5:
    	System.out.println("优秀");
    	break;
    case 4:
    	System.out.println("良好");
    	break;
    case 3:
    	System.out.println("中等");
    	break;
    case 2:
//    	System.out.println("不及格2");
//    	break;
// 如果没有执行break，继续往下执行，直到遇到
// break，退出switch语句  	
    case 1:
    case 0:
    	System.out.println("不及格");
    	break;
    }
  }
}


