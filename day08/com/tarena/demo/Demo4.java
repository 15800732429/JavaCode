package com.tarena.demo;

public class Demo4 {
  public static void main(String[] args){
	Car car1 = new Car();
	car1.name = "��ı���";
	car1.no = "123456789";
	car1.price = 100;
	car1.start();
	car1.run();
	car1.stop();
	Car car2 = new Car();
	car2.name = "����ʦ��QQ";
	car2.no = "6666666";
	car2.price = 99999;
	car2.start();
	car2.run();
	car2.stop();
	
  }
}
//���һ�������ͣ�Car��
//���ԣ����֣����ƣ��۸��ٶ�
//��������������ʻ��ɲ��
class Car{
//  ���ԣ�
  String name;//����
  String no;//���ƺ�
  double price;//�۸�
  double speed = 0;//�ٶȣ�Ĭ��ֵ������Car�Ķ���
//�տ�ʼ������ʱ���ٶȶ�Ĭ����0 
//  ������������speed��
  void start(){
	speed = 100;
	System.out.println(name+"������");
  }
  void run(){//��ʻ
	System.out.println(name+"������ʻ" +
		"��ǰ���ٶ���"+speed); 
  }
  void stop(){//ɲ����speedΪ0
	speed = 0;
	System.out.println(name+"ɲ���ˣ�" +
		"��ǰ���ٶ���"+speed);
  }
  
  
}





