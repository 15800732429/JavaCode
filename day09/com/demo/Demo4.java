package com.tarena.demo;

public class Demo4 {
  public static void main(String[] args)
  {
	Emp2 emp1 = 
		new Emp2("黄忠","男",55);
	emp1.show();
	System.out.println("---------------");
	emp1.show("江陵", "123456789987");
	
  }
}
//方法重载：同一个类的内部，方法名相同，参数不同
//参数不同：参数的个数，类型，顺序，有一个不同，就是
//参数不同
//方法重载的好处：调用相似功能的方法的时候，调用
//变得简单，只要记住一个名字，就可以调用多个同名
//相似的方法
//方法重载的原理：当多个方法的名字相同以后，系统
//会自动根据参数的不同，来调用对应的方法
//多态：事物在不同的情况下有不同的表现
//方法重载属于多态的一种	

//案例：设计雇员类(Emp)
//属性：名字，性别，年龄，住址，电话
//构造方法：给名字，性别，年龄赋值
//方法：使用方法重载
//1） show:只显示名字，性别，年龄（不带任何参数）
//2） show：a） 给地址，电话属性赋值（带参数）
//         b） 显示当前雇员所有的信息
class Emp2{
//属性
  String name;//姓名
  String sex;//性别
  int age;//年龄
  String address;//地址
  String phone;//电话
//构造方法
  Emp2(String name,String sex,int age){
	this.name = name;
	this.sex = sex;
	this.age = age;
  }//方法:方法重载
  void show(){
System.out.println(name+","+sex+","+age);
  }
  
  void show(String address,String phone){
	this.address = address;
	this.phone = phone;
System.out.println(name+","+sex+","+age
		+","+address+","+phone);
  }
  
}










