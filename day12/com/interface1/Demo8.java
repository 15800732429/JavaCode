package com.tarena.interface1;

public class Demo8 {
  public static void main(String[] args) {
	Emp emp = new Emp();
	emp.m1();
	emp.m2();
	emp.m3();
	emp.m();
  }
}
//接口之间可以多继承：一个子接口可以继承多个父接口
interface Moo1{
  void m1();
}
interface Moo2{
  void m2();
}
interface Moo3{
  void m3();
}
interface Moo extends Moo1,Moo2,Moo3{
//Moo1，Moo2，Moo3中所有的抽象方法也都被
//Moo继承了，Moo的实现类，必须要实现所有的
//抽象方法	
  void m();	
}
class Emp implements Moo{
	@Override
	public void m() {
	  System.out.println("接口Moo的方法");
	}
	@Override
	public void m1() {
	  System.out.println("接口Moo1的方法");
	}
	@Override
	public void m2() {
	  System.out.println("接口Moo2的方法");	
	}
	@Override
	public void m3() {
	  System.out.println("接口Moo3的方法");
	}
	
}







