
public class Demo19 {
//��200��������ż���ĺ�
  public static void main(String[] args)
  {
	int i = 1;
	int sum = 0;
	do{
	  if(i%2==0){ //ż��
		sum = sum + i;//�ۼ�
	  }	
	  i++;
	}while(i<=200);
	System.out.println("sum = "+sum);
  }
}
