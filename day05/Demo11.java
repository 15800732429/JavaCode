
public class Demo11 {
//1+2+3+4+5+6+...+180 = ? 
//int sum = 0;//sum�����ۼ��Ժ�Ľ��
//��1�Σ�sum = sum + 1��
//��2�Σ�sum = sum + 2��
//��3�Σ�sum = sum + 3��
//��4�Σ�sum = sum + 4��
//��5�Σ�sum = sum + 5;	
//	...
//��180�Σ� sum = sum + 180��
//�������i ��ȡֵ��1��180��i=1��
//���ɹ�ʽ��sum = sum + i��
//while(i<=180){
//    sum = sum + i;
//	  i++;
//}
  public static void main(String[] args){
	int i = 1;//i��ȡֵ��1��180
	int sum= 0;
	while(i<=180){
	  sum = sum + i;
	  i++;
	}
	System.out.println("sum="+sum);
  }
	
	
	
	
	
	
	
	
	
	
	
	
}

