package com.tarena.interface1;

public class Demo9 {

}
//一个实现类可以实现多个不同的接口
//总结：java中类永远是单继承，接口可以多继承，
//实现类可以实现多个接口，java用这种方式可以
//提高功能
interface Eoo{
  void f1();
}
interface Noo{
  void f2();
}
class User implements Eoo,Noo{
//User实现类，必须要实现Eoo，Noo中所有的抽象方法		
	@Override
	public void f1() {
	  System.out.println("Eoo接口中方法");
	}
	@Override
	public void f2() {
	  System.out.println("Noo接口中的方法");
	}
}










