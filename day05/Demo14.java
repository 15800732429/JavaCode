public class Demo14 {
//1/1+1/2+1/3+1/4+1/5+...+1/100
//���������Ӷ���1����ĸ�Ǵ�1��100
//�ۼӣ� sum = 0��
//��1�Σ�sum = sum +1/1;
//��2�Σ�sum = sum +1/2;
//��3�Σ�sum = sum +1/3;
//	...
//��100�Σ�sum = sum + 1/100
//���ɹ�ʽ�� sum = sum + 1.0/i(i��ȡֵ1��100)
//1.0/i:�Զ�����ת���������double����
  public static void main(String[] args){
	double sum = 0;
	int i = 1;//i��ȡֵ��Χ��1��100
	while(i<=100){
//	  System.out.println(1.0/i);
	  sum = sum + 1.0/i;
	  i++;
	}
	System.out.println("sum="+sum);
  }
	
	
	

  
}
