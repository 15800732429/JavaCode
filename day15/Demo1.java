package com.tarena.factory;

import java.util.Scanner;

public class Demo1 {
//����ģʽ������һ���࣬ר�Ÿ������ṩ����
  public static void main(String[] args) {
//���ù���ģʽ���������󣬲�����Ҫ�Լ�ȥnew����	
//	Car bmw = CarFactory.getInstance();
//	bmw.start();
//	bmw.run();
//	bmw.stop();
	  
//�����û��ӿ���̨���벻ͬ�Ĳ��������ṩ��ͬCar����
  	 Scanner sc = new Scanner(System.in);
  	 System.out.println("��������Ҫ�õĳ���");
  	 int num = sc.nextInt();
  	 Car car = CarFactory.getInstance(num);
  	 car.start();
  	 car.run();
  	 car.stop();
  }
}
class CarFactory{
//��̬�������������
//������ͨ����������ȷ�����״�������Car�ӿ�
//��ʵ�������	
public static Car getInstance(int type){
	Car car = null;
	if(type==1){
	  car = new Bmw();
	}else if(type==2){
	  car = new Taxi();
	}else if(type==3){
	  car = new QQ();	
	}
	return car;
  }
}

interface Car{
  void start();
  void run();
  void stop();
}
class QQ implements Car{
	@Override
	public void run() {
	  System.out.println("QQ��ʻ");
	}
	@Override
	public void start() {
	  System.out.println("QQ����");
	}
	@Override
	public void stop() {
	  System.out.println("QQɲ��");
	}
}
class Taxi implements Car{
	@Override
	public void run() {
	  System.out.println("���⳵����ʻ");
	}
	@Override
	public void start() {
	  System.out.println("���⳵����");
	}
	@Override
	public void stop() {
	  System.out.println("���⳵ɲ��");
	}
	
}
class Bmw implements Car{
	@Override
	public void run() {
	  System.out.println("Bmw������ʻ");	
	}
	@Override
	public void start() {
	  System.out.println("Bmw������");
	}
	@Override
	public void stop() {
	  System.out.println("Bmw��ɲ��");	
	}
	
}