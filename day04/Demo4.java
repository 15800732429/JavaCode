import java.util.Scanner;
public class Demo4 {
//�ӿ���̨����һ��������������жϸ������Ƿ���ż��
  public static void main(String[] args) {
//	1 ����Scanner
//	2 ����Scanner�����ഴ�������(�̶���ʽ)
	Scanner scanner =
		       new Scanner(System.in);
//	3 �������num��������Ĳ���
	System.out.println("������һ��������");
	int num = scanner.nextInt();
//	4 if���
	if(num%2==0){
		System.out.println(num+"��ż��");
	}
  }
}
