package com.tarena.demo;
public class Demo2 {
  public static void main(String[] args) {
//使用子类来定义对象，并创建该对象
	Teacher t1 = new Teacher();
	t1.name = "刘老师";
	t1.add(30, 36);//父类中继承过来的方法
	t1.show();//子类重写父类的方法
	t1.welcome();//子类独有的方法
//父类声明（定义）指向子类对象
//父类 对象名 = new 子类构造方法;
	Person p1 = new Teacher();
	p1.name = "谦哥";
	p1.add(30, 36);//父类中继承过来的方法
	p1.show();//子类重写父类的方法
//	p1.welcome();不能调用子类独有的方法
  }
}
//父类声明指向子类对象（了解，记住即可）
//1 利用父类来定义对象，然后用子类的构造方法来创建
//这个对象
//2 格式：     父类 对象名 = new 子类的构造方法
//     父类定义（声明）      子类创建对象
//3 规律：父类声明指向子类对象所有创建的对象，规则
//就是该对象只能访问从父类中继承过来的方法或者子类
//重写父类的方法，但不能访问子类独有的方法
class Person{//父类
  String name;	
  void show(){
	System.out.println("今天早上，阿根廷输了...可怜的梅西");
  }
  void add(int num1,int num2){
	System.out.println(num1+num2);
  }
}
class Teacher extends Person{//子类
  void show(){//子类重写父类的方法
	System.out.println(name+"昨天熬夜看球");
  }
  void welcome(){//子类独有的方法
	System.out.println("北京欢迎你...");
  }
}







