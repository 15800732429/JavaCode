package com.tarena.set;
import java.util.HashSet;
public class Demo5 {
//HashSet:��ArrayList���ƣ�����Ԫ�ز����ظ�
//Ԫ������û���±꣩
  public static void main(String[] args){
	HashSet set = new HashSet();
	set.add("���");
	set.add(new User("����",23));
	set.add(new User("����",24));
//HashSet����	
	System.out.println(set.toString());
    User user = new User("����",24);
//HashSet��û���±꣬Ԫ��������
//Ҫɾ��HashSet�е�Ԫ�أ�ֻ��ʹ��remove������
//HashSet�е�Ԫ�أ�������дequals��������Ȼ
//�޷�ɾ��    
	set.remove(user);
    System.out.println(set.toString());
    System.out.println(set.isEmpty());
    System.out.println(set.size());
  }
}
