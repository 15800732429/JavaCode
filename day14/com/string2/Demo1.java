package com.tarena.string2;

public class Demo1 {
//String ��
  public static void main(String[] args) {
//1 split("��ʶ"):ͨ����ʶ��һ���ַ����ָ��
//	һ���ַ�������  
	String str1=
"��Щ������׷����Ů��,�ϴ�,����־,��¥��";
	String[] strs = str1.split(",");
	for(String str : strs){
	  System.out.println(str);
	}
//2 endsWith(str):�ж�һ���ַ����Ƿ���str��β��
//	����Ƿ���true����֮Ϊfalse
	String str2="���췽��.bmp";
	System.out.println("�ж�str2�Ƿ���.bmp" +
		"��β"+str2.endsWith(".bmp"));
//3 startsWith(str):�ж�һ���ַ����Ƿ���str��ͷ��
//	����Ƿ���true����֮Ϊfalse
	String str3="���ڿ��¿���";
	System.out.println("str3�Ƿ��ԡ����ڡ�" +
		"��Ϊ��ͷ"+str3.startsWith("����"));
//4 ͳ���ַ����ֵ�λ�õ��±�
//	1��indexOf(char)��ͳ��char�ַ���1�γ���
//	λ�õ��±�
//	2��lastIndexOf(char):char�ַ����һ��
//	���ֵ�λ�õ��±�
//	����������ͬʱ������2�����ƹ��ܵķ�����ֻ��
//	�����ж��ַ������ֵ�λ���±�
	String str4="������java�ĵ�14��";
//	             0 1234
//ͳ����ĸ��a����1�γ��ֵ�λ�õ��±�
	System.out.println("a���ֵ�λ�õ��±꣺"
			+str4.indexOf('a'));
//��ĸ��a�����һ�γ��ֵ�λ�õ��±�
	System.out.println("a���һ�γ���" +
	"λ�õ��±�"+str4.lastIndexOf('a'));
	String str5="liuyingqianliu";
	System.out.println("liu��1�γ���λ�ã�"
			+str5.indexOf("liu"));
	System.out.println("liu���һ�γ��ֵ�λ�ã�"
			+str5.lastIndexOf("liu"));
//5 length()��ͳ�Ƶ�ǰ�ַ������ַ��ĸ���
	System.out.println(str5.length());
	
//Ӧ��String�з�����ִ��һ������
//	�ж�һ���ַ����е������Ƿ�������
//	eg��  ��a��  ��12000�� ---�� 12000
//	           String ---��int
//	ֻҪ���������֣���9��
	String num= "b";
    int index = 
    	"0123456789".indexOf(num);
    if(index==-1){
    	System.out.println("��������");
    }else{
    	System.out.println("������");
    }
    
  }
}
