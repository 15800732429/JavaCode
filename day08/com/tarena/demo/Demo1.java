package com.tarena.demo;
//面向对象
//1 类和对象：
//	类就是一个模板，代表一类事物，比如：人类，车类
//	对象就是根据类来创建出来一个类具体实现，代表是
//	一个具体，实际存在事物，比如：刘老师，门口宝马
//2 类的组成：属性和方法（行为）
//	class 类名{
//	  属性（变量）：
//	  数据类型 属性名1;
//	  数据类型 属性名2;
//	 ... ...
//	  方法：去掉static
//	  返回值类型  方法名(参数列表){
//	    方法体
// }
//}
//3 类名：首字母大写，不要使用中文
//4  包 ：把类放到包里，同一进行管理		
//对象：
//1 创建对象的格式(目前)：类名 对象名 = new 类名();
//2 访问对象中的属性和方法
//	对象名.属性名
//	对象名.方法名(参数值列表)
//3 暂时创建对象及调用对象的属性和方法，都在main中
//	执行
public class Demo1 {
  public static void main(String[] args){
	Person person1=new Person();
//给person1中的name属性赋值	
	person1.name = "刘彻";
//	System.out.println("person1中的name"
//		+"属性值："+person1.name);
	person1.age = 26;
	person1.money = 100;
	person1.sex ="男";
//	说话的方法
	person1.speak();
//	加法
	person1.add(25, 69);
	
	Person person2=new Person();
	person2.name="嬴政";
	person2.money=95;
	person2.age=55;
	person2.sex="男";
	
	person2.speak();
	person2.add(100, 100);
  }
}
//案例：设计一个类：人类
//属性： 姓名，年龄，性别，工资
//方法： 说话和加法
class Person{
//属性：数据类型 属性名;
  String name; //姓名
  int age;//年龄
  String sex;//性别
  double money;//工资
//方法： 返回值类型  方法名(参数列表){
//        方法体
//     }  
  void speak(){
	System.out.println("我是"+name);
  }
  void add(int num1,int num2){
	int sum = num1 + num2;
	System.out.println(num1+"+"+num2+
			"的值是"+sum);
  }
}













