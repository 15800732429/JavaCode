import java.util.Scanner;
public class Demo12 {
//多分支if...else if语句
//语法结构： 
//if(条件1){
//  语句1	
//}else if(条件2){
//	语句2
//}else if(条件3){
//  语句3	
//}...else{
//  语句n	
//}
//案例：根据输入的分数，输出与分数与之对应
//优秀，良好，中等，及格，不及格	
//90~100   优秀  score>=90&&score<=100
//80~89    良好  score>=80&&score<90
//70~79    中等  score>=70&&score<80
//60~69	       及格  score>=60&&score<70
//60分以下     不及格	  score<60
	
  public static void main(String[] args){
//	1 创建Scanner对象
	Scanner scanner = 
		new Scanner(System.in);
//	2 定义变量score接收用户输入的分数
	System.out.println("请输入您的分数：");
	int score = scanner.nextInt();
//	3 多分支if...else if :关键各种取值范围
	if(score>=90){
	  System.out.println("优秀！");
	}else if(score>=80&&score<90){
	  System.out.println("良好！");
	}else if(score>=70&&score<80){
	  System.out.println("中等");
	}else if(score>=60&&score<70){
	  System.out.println("及格");
	}else{
	  System.out.println("不及格");
	}
	
	
	
	
	
	
	  
  }
	
	
	
	
	
	
	
	
	
	
}
