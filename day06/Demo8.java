
public class Demo8 {
//1+2+3+...+300=? ��forѭ����  
//sum = 0
//��1�Σ� sum = sum+1��
//��2�Σ� sum = sum+2��
//��3�Σ� sum = sum+3��
//	...
//��300�Σ� sum = sum+300��
//����һ������i��i��ȡֵ��1��300(sum = sum + i;)
// int sum = 0;
// int i=1;
// while(i<=300){
//	sum = sum + i;
//	i++;
// }
  public static void main(String[] args){
	int sum = 0;
	for(int i=1;i<=300;i++){
	  sum = sum + i;
	}
	System.out.println("sum="+sum);
  }
	
	
	
	
	
	
	
	
	
	
	
	
}
