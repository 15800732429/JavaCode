package com.tarena.demo;
public class Demo1 {
  public static void main(String[] args){
	Foo4 foo4 = new Foo4();
	System.out.println(foo4.f1);
	System.out.println(foo4.f2);
	System.out.println(foo4.f3);
	System.out.println(foo4.f4);
  }
}
//java�е��̳У�һ������ֻ����һ��ֱ�ӵĸ��࣬������
//���̳С�
//Foo��ָһ����
class Foo1{
   int f1 = 11;
}
class Foo2 extends Foo1{
// int f1 = 11;	
   int f2 = 12;
}
class Foo3 extends Foo2{
   int f3 = 13;	
}
class Foo4 extends Foo3{
//Foo4��̳�֮ǰ���е����Ժͷ���
   int f4 = 16;
}



