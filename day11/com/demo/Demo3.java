package com.tarena.demo;

public class Demo3 {
  public static void main(String[] args){
	Emp emp = new Emp("张三","123456");
//emp.name在Emp这个类外界访问用private修饰
//的属性	
//	System.out.println(emp.name);
	
//调用public修饰setName方法，重新设置name
//属性的值
	emp.setName("张三丰");	
//调用public修饰getName方法，获得name属性的值
	String name = emp.getName();
	System.out.println("name属性值："+name);
  
  
	emp.setPassword("654321");
    String password = emp.getPassword();
    System.out.println("password="+password);
  
  }
}
//访问权限控制：修饰符
//1 private：用private修饰的属性，方法，构造方法
//，只能在该类的内部访问，外接无法访问
//一般情况都使用private属性的时候较多
//2 public：用public修饰的属性，方法，构造方法，类
//，外界可以任意的访问
//3 方法大部分都建议用public修饰，易于访问
//属性大部分都建议用private修饰，安全
//可以用public修饰的方法，去访问用private修饰
//的属性
class Emp{
  private String name;
  private String password;
//访问：1）取值    2）设置值，可以用public修饰的方法
//来访问private修饰的属性  
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
//通过get/set方法来间接的访问private修饰name
//属性  
  
//可以通过构造方法，在外界间接访问name和password
//属性  
  Emp(String name,String password){
	this.name = name;
	this.password = password;
  }
  
}





