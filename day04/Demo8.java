import java.util.Scanner;
public class Demo8 {
//��������һ���������жϸ���������������ż��
//���ʱ��������ż����ʹ��if...else...	
//ż�����ܱ�2��������
//���������ܱ�2��������	
  public static void main(String[] args)
  {
//1 ����Scanner
//2  ����Scanner����	
	Scanner scanner = 
		       new Scanner(System.in);
//3 ����num�������������ô����������
	System.out.println("������Ҫ�ж�������");
	int num = scanner.nextInt();
//4 ��дif...else
//	if(num%2!=0) ------���� else ---ż��  
    if(num%2!=0){
      System.out.println(num+"��������");
    }else{//ż����if���෴����
      System.out.println(num+"��ż����");	
    }
  }
}




