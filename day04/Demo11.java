import java.util.Scanner;
public class Demo11 {
//if���Ƕ�ף�һ��if�����ڲ����ְ�������һ��
//if���	
//�ӿ�������һ���˵�����͹��ʣ����������10W����
//������25�굽35��֮�䣬������Ҫ�󣬷�������Ҫ��
//�������������if��salary>=100000��{
//	            if(age��25��35֮��){
//	            	����Ҫ��
//				}
//           }  
//age��25��35֮�䣺age>=25&&age<=35
  
  public static void main(String[] args){
//1	����Scanner����
Scanner scanner=new Scanner(System.in);
//2 ����age��salary�����û���������͹���
    System.out.println("��������������");
    int age = scanner.nextInt();
    System.out.println("���������Ĺ��ʣ�");
    int salary = scanner.nextInt();
//3 ��д���if��䣨salary>=100000��
    if(salary>=100000){
//4 ��д�ڲ�if��䣨age>=25&&age<=35��
      if(age>=25&&age<=35){
    	 System.out.println("����Ҫ��");
      }else{
    	 System.out.println("�����ʣ�����");  
      }
    }else{
      System.out.println("С�Ŭ��׬Ǯ�ɣ�");
    }

	  
  }	
	
	
	
	
	
	
	
	
	
	
	
	
}
