package com.tarena.interface1;

public class Demo7 {
  public static void main(String[] args) {
//����ͨ���ӿڵ�ʵ���࣬���������󣬲�ִ���䷽��	
	Bmw bmw = new Bmw();
	bmw.start();
	bmw.run();
	bmw.stop();
//��������ָ���������
//�ӿڶ������ʵ���ഴ���ö���
//��ʽ���ӿ� ������ = new ʵ����Ĺ��췽��
//����ֻ�ܵ���ʵ������ʵ�֣���д���ӿڵķ��������ܵ���
//ʵ�����ж��еķ���
//�ӿں�������࣬������
	Car car1 = new Bmw();
	car1.start();
	car1.run();
	car1.stop();
//	car1.show();//���ܵ���ʵ������еķ���
	
  }
}
//�ӿڣ�������������ͣ������Ӧ��
//1 �ڲ��ṹ�������ͳ��󷽷�
//2 �ӿڵĸ�ʽ��
//interface �ӿ���{
//  ���������Լ�д��
//  ���󷽷������Լ�д��
//}
  interface Car{
//	����
	public static final 
					String COLOR="��ɫ";
	int PRICE = 500;
//	���󷽷�
	public abstract void start();
	void run();
	void stop();
  }
  class Bmw implements Car{
	@Override
	public void run() {
	  System.out.println("��ʻ");
	}
	@Override
	public void start() {
	  System.out.println("����");	
	}
	@Override
	public void stop() {
	  System.out.println("ɲ��");	
	}
	void show(){
	  System.out.println(Car.COLOR);
	  System.out.println(Car.PRICE);
	}
  }





