import java.util.Scanner;
public class Demo13 {
//���һ����������main�����н��ղ���num1��num2
//��ֵ��Ȼ��ִ�мӷ����������ѽ�����ظ����öˣ�
//��main���������
//���Դ�main�����������������������ֵ	
  static int add(int num1,int num2){
	int result = num1 + num2;
	return result;
  }
  public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
    System.out.println("�������1������");
    int a = scanner.nextInt();
    System.out.println("�������2������");
    int b = scanner.nextInt();
    int sum = add(a,b);
    System.out.println("sum="+sum);
  }
}
