import java.util.Scanner;
public class Demo3 {
//ʹ����������Scanner
//1 ����Scanner
//2 ����Scanner�������ͣ�����scanner����
//  Scanner scanner = 
//	           new Scanner(System.in);
//3 ����scanner�й��ܣ�
//scanner.nextInt();�ӿ���̨����һ������
  public static void main(String[] args)
  {
//���ݹ�������Scanner�������������  
	Scanner scanner =
		 new Scanner(System.in);
//����scanner�����������Ĺ���
	int num = scanner.nextInt();
	System.out.println("������������ǣ�"
			+num);
	
  }
}
