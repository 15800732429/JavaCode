package com.tarena.demo;

public class Demo3 {
  public static void main(String[] args){
	Emp emp = new Emp("����","123456");
//emp.name��Emp�������������private����
//������	
//	System.out.println(emp.name);
	
//����public����setName��������������name
//���Ե�ֵ
	emp.setName("������");	
//����public����getName���������name���Ե�ֵ
	String name = emp.getName();
	System.out.println("name����ֵ��"+name);
  
  
	emp.setPassword("654321");
    String password = emp.getPassword();
    System.out.println("password="+password);
  
  }
}
//����Ȩ�޿��ƣ����η�
//1 private����private���ε����ԣ����������췽��
//��ֻ���ڸ�����ڲ����ʣ�����޷�����
//һ�������ʹ��private���Ե�ʱ��϶�
//2 public����public���ε����ԣ����������췽������
//������������ķ���
//3 �����󲿷ֶ�������public���Σ����ڷ���
//���Դ󲿷ֶ�������private���Σ���ȫ
//������public���εķ�����ȥ������private����
//������
class Emp{
  private String name;
  private String password;
//���ʣ�1��ȡֵ    2������ֵ��������public���εķ���
//������private���ε�����  
  public String getPassword(){
	return password;
  }
  public void setPassword(String password){
	this.password = password;
  }
  public String getName(){
	return name;
  }
  public void setName(String name){
	this.name = name;
  }
//ͨ��get/set��������ӵķ���private����name
//����  
  
//����ͨ�����췽����������ӷ���name��password
//����  
  Emp(String name,String password){
	this.name = name;
	this.password = password;
  }
  
}





