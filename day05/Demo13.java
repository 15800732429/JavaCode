
public class Demo13 {
//�ֱ����100�������е�ż���ĺͺ������ĺ�
//������ż���ĺ� �������ĺ�Ӧ������������������
  public static void main(String[] args)
  {
	int i = 1;
	int sum1 = 0;//ż���ĺ�
	int sum2 = 0;//�����ĺ�
	while(i<=100){
//	��i�е�ż�����������룬�ֱ��ۼ�
	  if(i%2==0){
		sum1 = sum1 + i;//ż����
	  }else{
		sum2 = sum2 + i;//������
	  }
	  i++;
	}
	System.out.println("ż���ͣ�"+sum1);
	System.out.println("�����ͣ�"+sum2);
	
	
	
  }
}
