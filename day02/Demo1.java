
public class Demo1 {
//�����������ͣ�byte,short,int,long
//byte:���ϴ������й�
//short��ʹ�ü��٣�ȡֵ��Χ̫С
//int�� ��Ϊ���ã�ȡֵ��ΧԼ-21�ڵ�21��	
//long������int��ȡֵ��Χ��ʹ��long
  public static void main(String[] args)
  {
	int numInt = 1000000;// 0
	System.out.println("numInt="+numInt);
    long numLong1 = 100;
    System.out.println("numLong1="+
    		numLong1);
    long numLong2 = 10000000000L;
//��ֵ��ʱ�򣬸����Ǹ�ֵ��Ϊ���ͳ�����Ĭ����������
//��int���������int��ȡֵ��Χ���򱨴�
//���ǿ���ǿ�Ƶ������ͳ����ĺ������l��L�����԰Ѹ�
//������Ϊlong���͵�    
    System.out.println("numLong2="+
    		numLong2);
  }
}
