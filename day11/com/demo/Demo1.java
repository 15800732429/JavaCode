package com.tarena.demo;

public class Demo1 {
//alt+/:eclipse��ʾ�������Զ������Ǵ���һЩ
//�̶��Ĵ��룬����main����	
  public static void main(String[] args) {
//1 ֱ�Ӷ������������࣬Ȼ�󴴽�����������Ķ���
	Benz benz =new Benz("����ʦ����",0);
//	  ����                   ��������
	benz.start();
	benz.run();
	benz.stop();
//2 ��������ָ���������:
//	���ඨ�����֮������������������new����
	Car benz2 = new Benz("����ʦ����",0);
//  ����  ������ = new ����Ĺ��췽�� 
	benz2.start();
	benz2.run();
	benz2.stop();
	
  }
}
//��������ָ���������
abstract class Car{//����
  String name;
  int speed;
//����3�����󷽷�����������ʻ��ɲ��
  abstract void start();
  abstract void run();
  abstract void stop();
}
class Benz extends Car{
//����������࣬ʵ�ֳ���Car���еĳ��󷽷�	
	Benz(String name,int speed){
	  this.name = name;
	  this.speed = speed;
	}
	@Override
	void run() {
System.out.println(name+"��ʻ���ٶ���"+speed);	
	}
	@Override
	void start() {
	  speed = 100;
	  System.out.println(name+"������");
	}
	@Override
	void stop() {
	  speed = 0;
System.out.println(name+"ɲ��,�ٶ���"+speed);
	}
	
}







