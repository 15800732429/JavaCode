import java.util.Scanner;
public class Demo9 {
//�����������������������������if...else��
  public static void main(String[] args){
//1  ����Scanner	
//2 ����Scanner����
	Scanner scanner =
		    new Scanner(System.in);
//3 �������num1��num2���������û��������������
	System.out.println("�������1������");
	int num1 = scanner.nextInt();
	System.out.println("�������2������");
	int num2 = scanner.nextInt();
//4 if...else	  
	if(num1>=num2){
	  System.out.println("num1�ϴ�"+num1);
	}else{
	  System.out.println("num2�ϴ�"+num2);
	}
  }
}



