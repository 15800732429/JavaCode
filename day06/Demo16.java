import java.util.Scanner;
public class Demo16 {
//switch��䣺���֧ѡ�����
//switch(���ͱ��ʽ){
//  case  ������ֵ1��
//	���1
//	break;//�˳�switch���
//	...
//	defaul: //��û�з�������
//	  ���n
//}	
//�������֣�1��Ӧע�ᣬ2��Ӧ��¼�������������²���	
  public static void main(String[] args){
//	����Scanner����
  Scanner scanner=new Scanner(System.in);
//	�������num���������û����������
    int num = scanner.nextInt();
    switch(num){
      case 1:
    	  System.out.println("ע��");
    	  break;
      case 2:
    	  System.out.println("��¼");
    	  break;
      default:
    	  System.out.println("�����²���");    } }

}
