
public class Demo14 {
//�ж�һ����ݣ��Ƿ������꣬��������꣬������꣬
//����������꣬�����������
//1 ��������ͬ�Ľ��	
//	String ����String����ͬ��ֵ���Դ��������ͬ
//	�Ľ��
//2 ����ж����ꣿ
//�ܱ�4�������Ҳ��ܱ�100�����������ܱ�400����
//  boolean flag = 
//(year%4==0 && year%100!=0)||
//	                       year%400==0
//3 �����������������������
//	String result = 
//	         flag ? "������" : "��������"
  public static void main(String[] args){
//	1 ���������year����ݣ���result����������
//	         flag���ж��Ƿ������꣩
	int year;
	String result;
	boolean flag;
//  2 year��ֵ
	year = 2001;
//	3 �ж�year�Ƿ������꣬���Ұ��жϽ����flag 
//�ܱ�4�������Ҳ��ܱ�100�����������ܱ�400����	
	flag =
(year%4==0 && year%100!=0)||year%400==0;	
//	4 ���������:��flag��Ϊ���ʽ1�����flagΪ
//	 true�����������ꡱ�����ʽ2��Ϊ�������֮
//	 flagΪfalse�������������ꡱ�����ʽ3��Ϊ���
//	 �������������Ľ����result
	result = flag ? "������" :"��������";
//	5 ���result��ֵ  
	System.out.println(year+result);
  }	
	
	
	
	
	
	
	
	
	
	
	
}
