import java.util.Scanner;
public class Demo11 {
//Scanner����ʹ��double����
//scanner.nextDouble():�����ڿ���̨����double
//����
//��sub�����У�������������С����������������
//���ҰѸý�����ص�main�У���ʾ
  static double sub(){
//����Scanner����
Scanner scanner=new Scanner(System.in);
    System.out.println("�������1������");
	double num1 = scanner.nextDouble();
    System.out.println("�������2������");
    double num2 = scanner.nextDouble();
    return num1-num2;//����num1-num2���
  }
  public static void main(String[] args){
	double result = sub();
	System.out.println("result="+result);
  }
}




