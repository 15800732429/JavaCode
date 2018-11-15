package com.tarena.demo;
public class Demo5 {
  public static void main(String[] args){
	System.out.println(Person1.AGE);
	System.out.println(Person1.NAME);
  }
}
//常量：外界都可以访问，其值不变，不依赖于对象
//public static final 数据类型 常量名=“值”
//常量的名字：开发的习惯，全部大写
class Person1{
  public static final int AGE = 20;
 public final static String NAME = "常遇春";
}