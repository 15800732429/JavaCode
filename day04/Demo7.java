import java.util.Scanner;
public class Demo7 {
//�ӿ���̨��������һ���������жϸ��������Ƿ�������
//��������꣬��������꣬��֮�������������
//ʹ��if...elseʵ��  
  public static void main(String[] args){
//1 ����Scanner
//2 ����Scanner����
	Scanner scanner = 
		new Scanner(System.in);
//3 �������year�����û����������
    int year = scanner.nextInt();
//4 if(�����ж�����)
//��year%4==0&&year%100��=0��||
//	                      year%400==0
    if((year%4==0&&year%100!=0)||
    		            year%400==0){
      System.out.println(year+"������");
    }
//5 else����Ҫ�����κε�������else�������if
//		���෴����
    else{
      System.out.println(year+"��������");
    }
  }

	
	
	
	
	
}
