package com.tarena.string2;

public class Demo2 {
//�ɱ䳤���ַ�����StringBuffer��StringBuilder
//�ص㣺��������Ķ��������ַ�������޸ģ��ڲ�
//ֻ��һ������
//����StringBuffer���ֽ��磬�ٶ��������̰߳�ȫ
//	   StrinBuilder���ֽ����ٶȽϿ죬
//	   �̲߳���ȫ
//���ַ��������Ƶ�����޸Ĳ������Ϳ��Կ���ʹ��
//StringBuffer��StringBuilder�����String
  public static void main(String[] args){
	StringBuffer buf =
		new StringBuffer("����");
//append(����):��StringBuffer����ĺ��棬׷��
//����	
	buf.append("�о�ѧ�Ķ���û���������,");
	buf.append("���ܿ�ʼѧϰ���ݿ����ݡ�");
//toString()����StringBuffer�����е����ݣ�
//ת��ΪString��ʾ����
	System.out.println(buf.toString());
    StringBuilder bud = 
    	new StringBuilder();
    bud.append("����ͦ��,�����ɵġ�");
//append(����):���Է��κε���������
//    bud.append(true);
//    bud.append(12);
//    bud.append(12.1f);
    System.out.println(bud.toString());
//insert(�±�,����)�����±��λ�ò�����������
    bud.insert(0, "����");
    System.out.println(bud.toString());
//��������ͦ��,�����ɵġ�  
//      4
//delete(start,end):ɾ���±��start��ʼ��
//   end-start���ַ�
    bud.delete(4,6);
    System.out.println(bud.toString());
  }
}
