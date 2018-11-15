package com.tarena.object1;

public class Demo3 {
//相等（基本数据类型和引用类型）
//1 基本数据类型用“==”来判断是否相等，引用类型
//	判断相等的标准，是比较两个对象是否相等
//2 引用类型中“==”，判断两个对象的地址是否一致，
//	判断两个对象是否是同一个对象，因为同一个内存
//	地址只能有一个对象
//3 Object中equals方法比较就是“==”，重写
//4 重写equals的原则（两个对象相等，equals是true，
//	反之false）
//	1） 任何跟null，比较的对象，永远false
//	2） 跟自己比较，永远都为true
//	3） 要比较的两个对象必须是同一个类型
//	对象 instanceof 类：如果对象是类的对象，则
//	返回值为true,反之，false
//5 总结：比较相等的时候，对象使用equals方法来比较
//	基本数据类型用“==”
  public static void main(String[] args) {
	Car car1 =new Car("宝马",100);
	Car car2 =new Car("宝马",101);
	System.out.println("car1跟car2是否相等"
			+car1.equals(car2));
  }	
}

class Car{
  String name;
  double price;
  Car(String name,double price){
	this.name = name;
	this.price = price;
  }
//重写equals方法
//obj：要比较的那个对象  
//this:当前对象
//==：判断两个对象的地址是否一致  
  @Override
  public boolean equals(Object obj) {
	if(obj==null){//任何对象跟null，都是false
		return false;
	}
	if(this==obj){
		return true;
	}
	if(obj instanceof Car){
//obj对象是否是Car类的对象，同类型对象才可以比较		
//记住：确定obj是Car类的对象，必须要把obj进行
//类型转化，转化Car的对象，好比较其属性
	  Car car =(Car)obj;
	  if(this.name.equals(car.name)&&
	    this.price == car.price){
		return true;
	  }
	}
	return false;
  }
// 比较，重写equals和hashCode
// hashCode只要满足，两个对象如果相等，则
// hashCode一致即可。
// hashCode值一致不代表两个对象相等
  @Override
  public int hashCode() {
	int num =(int)(price+100);
	return num;
  }
  
}










