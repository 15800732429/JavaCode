package com.tarena.demo;

public class Demo2 {
  public static void main(String[] args){
	Kongtiao kt1 = new Kongtiao();
	kt1.name="����";
	kt1.type="�ڹ�";
	kt1.price=10000;
	kt1.degree=25;
//	����2��
	kt1.hot();
	kt1.hot();
//	����1��
	kt1.cool();
		
	Kongtiao kt2 = new Kongtiao();
	kt2.name="����";
	kt2.type="��ʽ";
	kt2.price = 90000;
	kt2.degree = 20;
//����2��
	kt2.cool();
	kt2.cool();
//����1��	
	kt2.hot();
  }
}
//���һ���յ��࣬
//���ԣ����֣����ͣ��۸��¶ȣ�degree��
//����������(cool)������(hot)
//��main�д����ÿյ���Ķ����������ԣ�Ȼ������2�Σ�
//����1�Ρ�
class Kongtiao{
  String name;//����
  String type;//����
  double price;//�۸�
  int degree;//�¶�
//���£�degree����
  void hot(){
	degree++;
	System.out.println(name+
	         "�����Ժ��¶���"+degree);
  }
//���£�degree���� 
  void cool(){
	degree--;
	System.out.println(name+"" +
			"�����Ժ��¶���"+degree);
  }
}







