
public class Demo12 {
//���100��������ż���ĺ�
//������
//	1 ���ݣ���1��100������ѭ����������i��ȡֵ
//	   ��ֵ��1����100Ϊֹ
//	2 ż����ɸѡ��1��100��ѡ�����е�ż��
//	  if��i%2==0��-----��i��ż��
//	3 �ۼӣ�sum = 0
//	  ��ʽ��sum = sum + i;
  public static void main(String[] args){
	int i = 1,sum = 0;
	while(i<=100){
//i�е�ż�����˳���
	  if(i%2==0){
		sum = sum + i;
	  }
	  i++;
	}
	System.out.println("sum="+sum);
  }
}
