
public class Demo10 {
//�߼�������������߼�������||���߼��򣩣�&&���߼��룩
//�߼�������������Ӷ����ͬ������
//�ص�ʹ��||�����ߣ� �� &&�����ң�
//||��ֻҪ���ӵĹ�ϵ���ʽ����һ��Ϊtrue��������
//���ʽ��Ϊtrue
//&&��ֻҪ���ӵĹ�ϵ���ʽֻ��һ��Ϊfalse��������
//���ʽ��Ϊfalse
  public static void main(String[] args)
  {
//	!��ȡ��
	boolean result1 = 12>100;
	System.out.println("result1="
			+result1);
    System.out.println("!result1="
    		+!result1);
//||: ���ߣ���һ�����ʽΪtrue���������ʽ����true
    int num1 = 100,num2 = 200,num3=1000;
    boolean result2 = 
     num1>100 || num2>200 || num3==1000;
//     false       false       true  
     System.out.println("result2 ="+result2);
//&&: ���ң���һ�����ʽΪfalse���������ʽ����false
    boolean result3 = 
  num1==100 && num2==200 && num3!=1000;
//  true         true          false
    System.out.println("result3="+result3);
    
  
  }
	
	
	
	
	
}
