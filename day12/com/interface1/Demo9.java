package com.tarena.interface1;

public class Demo9 {

}
//һ��ʵ�������ʵ�ֶ����ͬ�Ľӿ�
//�ܽ᣺java������Զ�ǵ��̳У��ӿڿ��Զ�̳У�
//ʵ�������ʵ�ֶ���ӿڣ�java�����ַ�ʽ����
//��߹���
interface Eoo{
  void f1();
}
interface Noo{
  void f2();
}
class User implements Eoo,Noo{
//Userʵ���࣬����Ҫʵ��Eoo��Noo�����еĳ��󷽷�		
	@Override
	public void f1() {
	  System.out.println("Eoo�ӿ��з���");
	}
	@Override
	public void f2() {
	  System.out.println("Noo�ӿ��еķ���");
	}
}










