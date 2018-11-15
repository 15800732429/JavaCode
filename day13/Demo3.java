package com.tarena.object1;

public class Demo3 {
//��ȣ������������ͺ��������ͣ�
//1 �������������á�==�����ж��Ƿ���ȣ���������
//	�ж���ȵı�׼���ǱȽ����������Ƿ����
//2 ���������С�==�����ж���������ĵ�ַ�Ƿ�һ�£�
//	�ж����������Ƿ���ͬһ��������Ϊͬһ���ڴ�
//	��ַֻ����һ������
//3 Object��equals�����ȽϾ��ǡ�==������д
//4 ��дequals��ԭ������������ȣ�equals��true��
//	��֮false��
//	1�� �κθ�null���ȽϵĶ�����Զfalse
//	2�� ���Լ��Ƚϣ���Զ��Ϊtrue
//	3�� Ҫ�Ƚϵ��������������ͬһ������
//	���� instanceof �ࣺ�����������Ķ�����
//	����ֵΪtrue,��֮��false
//5 �ܽ᣺�Ƚ���ȵ�ʱ�򣬶���ʹ��equals�������Ƚ�
//	�������������á�==��
  public static void main(String[] args) {
	Car car1 =new Car("����",100);
	Car car2 =new Car("����",101);
	System.out.println("car1��car2�Ƿ����"
			+car1.equals(car2));
  }	
}

class Car{
  String name;
  double price;
  Car(String name,double price){
	this.name = name;
	this.price = price;
  }
//��дequals����
//obj��Ҫ�Ƚϵ��Ǹ�����  
//this:��ǰ����
//==���ж���������ĵ�ַ�Ƿ�һ��  
  @Override
  public boolean equals(Object obj) {
	if(obj==null){//�κζ����null������false
		return false;
	}
	if(this==obj){
		return true;
	}
	if(obj instanceof Car){
//obj�����Ƿ���Car��Ķ���ͬ���Ͷ���ſ��ԱȽ�		
//��ס��ȷ��obj��Car��Ķ��󣬱���Ҫ��obj����
//����ת����ת��Car�Ķ��󣬺ñȽ�������
	  Car car =(Car)obj;
	  if(this.name.equals(car.name)&&
	    this.price == car.price){
		return true;
	  }
	}
	return false;
  }
// �Ƚϣ���дequals��hashCode
// hashCodeֻҪ���㣬�������������ȣ���
// hashCodeһ�¼��ɡ�
// hashCodeֵһ�²����������������
  @Override
  public int hashCode() {
	int num =(int)(price+100);
	return num;
  }
  
}










