package com.tarena.demo;

public class Demo3 {
  public static void main(String[] args){
	Box box1 = new Box();
	box1.length=10;
	box1.width=8;
	box1.high = 9;
	box1.getTiji();
  }
}
//设计一个长方体（Box）
//属性：长（length），宽（width），高（high）
//方法：求体积（不需要返回值，直接输出）
class Box{
	int length;
	int width;
	int high;
//求体积：长*宽*高
	void getTiji(){
	  int result = length*width*high;
	  System.out.println("该长方体的体积："
			  +result);
	}
}