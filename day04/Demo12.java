import java.util.Scanner;
public class Demo12 {
//���֧if...else if���
//�﷨�ṹ�� 
//if(����1){
//  ���1	
//}else if(����2){
//	���2
//}else if(����3){
//  ���3	
//}...else{
//  ���n	
//}
//��������������ķ���������������֮��Ӧ
//���㣬���ã��еȣ����񣬲�����	
//90~100   ����  score>=90&&score<=100
//80~89    ����  score>=80&&score<90
//70~79    �е�  score>=70&&score<80
//60~69	       ����  score>=60&&score<70
//60������     ������	  score<60
	
  public static void main(String[] args){
//	1 ����Scanner����
	Scanner scanner = 
		new Scanner(System.in);
//	2 �������score�����û�����ķ���
	System.out.println("���������ķ�����");
	int score = scanner.nextInt();
//	3 ���֧if...else if :�ؼ�����ȡֵ��Χ
	if(score>=90){
	  System.out.println("���㣡");
	}else if(score>=80&&score<90){
	  System.out.println("���ã�");
	}else if(score>=70&&score<80){
	  System.out.println("�е�");
	}else if(score>=60&&score<70){
	  System.out.println("����");
	}else{
	  System.out.println("������");
	}
	
	
	
	
	
	
	  
  }
	
	
	
	
	
	
	
	
	
	
}
