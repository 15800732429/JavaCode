
public class Demo8 {
//���3000�����ڵ����е�����
//��������������� 
  public static void main(String[] args)
  {
	int i = 1;
	while(i<=3000){
//�ж�i��ֵ�Ƿ�������
	  if((i%4==0&&i%100!=0)||i%400==0)
	  {
		 System.out.println(i); 
	  }
	  i++;
	}
  }
}
