package com.tarena.demo;

public class Demo3 {

}
//用final修饰方法，该方法不能被方法重写
class Koo1{
  final void show(){
	System.out.println("最温柔的月光");
  }
}
class Koo2 extends Koo1{
//被final修饰的方法，已经最终的方法了，不能再被
//子类所重写	
//  void show(){
//	System.out.println("残酷月光");
//  }
}






