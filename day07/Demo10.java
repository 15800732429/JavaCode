import java.util.Scanner;
public class Demo10 {
//������ֵ�޲����ķ�����
//1��return���������һ�У�a�� �ѷ������ս��
//���ص����öˣ�˭��������������Ͱѽ�����ظ�˭����
//b����ֹ��ǰ�ķ�����return�Ժ�����ݶ���ִ��
//2��һ������ֻ����һ�����صĽ��
//3�����صĽ�������ͣ����������ֵ����һ��
	
//����һ��������ʵ�ִӿ���̨��������������������ͣ�
//�������յĽ�������ص�main�����У���ʾ	
  static int add(){//����Scanner	
Scanner scanner=new Scanner(System.in);
	System.out.println("�������1������");
	int num1 = scanner.nextInt();
	System.out.println("�������2������");
	int num2 = scanner.nextInt();
	int result = num1+num2;
	return result;
  }	//result���ص����ö�add����
  public static void main(String[] args){
	int sum = add();//���ؽ����ֵ��sum
	System.out.println("sum="+sum);
  }
	
	
	
	
	
	
}
