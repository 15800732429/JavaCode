
public class Demo9 {
//300��������ż���ĺͣ�for��
//������
//1 ȡֵ�ķ�Χ��1��300������ѭ�������ı���i��ȡֵ
//��1��300
//2 ż����ɸѡ��ʽ��i%2==0��ż��
//3 �ۼ� ��sum = sum + i��
  public static void main(String[] args){
	int sum = 0;
	for(int i=1;i<=300;i++){
	  if(i%2==0){//ż��
		 sum = sum + i;
	  }
	}
	System.out.println("sum = "+sum);
  }
}




