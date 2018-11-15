package com.tarena.demo;

public class Demo6 {
  public static void main(String[] args){
//	长方体对象
	Box box1 = new Box(10,8,10);
	box1.getTiji();
//	正方体对象  
	Box box2 = new Box(10);
	box2.getTiji();
  }
}
//构造方法重载：
//案例：
//长，宽，高都一致的长方体，称为正方体
//设计一个长方体
//属性：长，宽，高
//构造方法：
//   1） 带三个参数，给长，宽，高分别的赋值，标准
//      长方体
//   2） 带一个参数，给长，宽，高赋同样的一个值，
//      正方体
//方法：求体积
class Box{
  int c;//长
  int k;//宽
  int g;//高
//长方体  
  Box(int c,int k,int g){
	this.c = c;
	this.k = k;
	this.g = g;
  }
//正方体
  Box(int length){
	this.c = length;
	this.k = length;
	this.g = length;
  }
//求体积：
  void getTiji(){
	int result = c*k*g;
	System.out.println(result);
  }
}



