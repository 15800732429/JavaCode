import java.util.Scanner;
public class Demo10 {
//�򿧷ȣ�ÿ�����ȼ۸���5Ԫ���ŻݵĹ������1��
//ԭ�ۣ����2����ʼ�����
//������1����5Ԫ
//������3������1��5Ԫ���ӵ�2������3����2.5Ԫ
//�ܼۣ�10
//���ܣ��û����빺���������Ӧ���ܼ�
//������
//������num������������total���ܼۣ�
//	   price�����ȵ��ۣ���5
//���̣�����
//1�� ֻ��1��                
//	total��5Ԫ
//2����౭  total=
//	          price+(num-1)*0.5*price;                 
//3�� 0��				total��0	
  public static void main(String[] args){
//	1 ���������total���붨��double
	int price =5,num;
	double total=0;
//	2 ����Scanner����
Scanner scanner=new Scanner(System.in);
//	3 num���������û�����ı���
    System.out.println("�����빺��ı�����");
	num = scanner.nextInt();
//	4 if���ࣺ1�����౭��0��
	if(num>0){
	  total=price+(num-1)*0.5*price;
	}else{
	  total=0;
	}
	System.out.println("Ӧ����"+total);
//	if(num==1){
//	  total = price;
//	}
//	if(num>1){
//	  total=price+(num-1)*0.5*price;
//	}
//	if(num==0){
//	  total=0;
//	}
//	System.out.println("Ӧ����"+total);
  }
	
	
	
	
	
	
	
	
	
	
}
