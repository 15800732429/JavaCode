
public class Demo15 {
/*�˽�
 * 1*1 = 1
 * 1*2 = 2  2*2 =4
 * 1*3 = 3  2*3 =6  3*3 = 9
 * 1*4 = 4  2*4 =8  3*4 = 12  4*4 = 16
 * ...
 * ����������������i
 * for(int i=1;i<=9;i++){//����
 *   for(int j=1;j<=i;j++){//��ʽ����
 * System.out.print(i+"*"+j+"="+i*j);
 *   }
 *   System.out.println();
 * }
 */
  public static void main(String[] args){
//���ѭ�������ܵ��������ڲ�ѭ��������ʽ���ֵĸ���
	for(int i=1;i<=9;i++){//����
      for(int j=1;j<=i;j++){//��ʽ���ֵĸ���
    	int result = i*j;
System.out.print(i+"*"+j+"="+result+"  ");
      }
      System.out.println();
	}
  }
	
	
	
	
	
	
	
	
	
	
	
	
}
