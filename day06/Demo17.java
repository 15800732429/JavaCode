import java.util.Scanner;
public class Demo17 {
//�������������0~5������ʾ��ĳɼ���5���ƶȣ�	
//5-----����        4-----����	   3-----�е�
//2,1,0------������  
  public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
    System.out.println("��������ķ�����5���ƣ���");
    int score = scanner.nextInt();
    switch(score){
    case 5:
    	System.out.println("����");
    	break;
    case 4:
    	System.out.println("����");
    	break;
    case 3:
    	System.out.println("�е�");
    	break;
    case 2:
//    	System.out.println("������2");
//    	break;
// ���û��ִ��break����������ִ�У�ֱ������
// break���˳�switch���  	
    case 1:
    case 0:
    	System.out.println("������");
    	break;
    }
  }
}


