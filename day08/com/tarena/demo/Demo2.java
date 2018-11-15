package com.tarena.demo;

public class Demo2 {
  public static void main(String[] args){
	Kongtiao kt1 = new Kongtiao();
	kt1.name="美的";
	kt1.type="壁挂";
	kt1.price=10000;
	kt1.degree=25;
//	升温2次
	kt1.hot();
	kt1.hot();
//	降温1次
	kt1.cool();
		
	Kongtiao kt2 = new Kongtiao();
	kt2.name="格力";
	kt2.type="柜式";
	kt2.price = 90000;
	kt2.degree = 20;
//降温2次
	kt2.cool();
	kt2.cool();
//升温1次	
	kt2.hot();
  }
}
//设计一个空调类，
//属性：名字，类型，价格，温度（degree）
//方法：降温(cool)，升温(hot)
//在main中创建该空调类的对象，设置属性，然后升温2次，
//降温1次。
class Kongtiao{
  String name;//名字
  String type;//类型
  double price;//价格
  int degree;//温度
//升温：degree升高
  void hot(){
	degree++;
	System.out.println(name+
	         "升温以后，温度是"+degree);
  }
//降温：degree降低 
  void cool(){
	degree--;
	System.out.println(name+"" +
			"降温以后，温度是"+degree);
  }
}







