package com.tarena.list;
import java.util.List;
import java.util.ArrayList;
public class Demo12 {
//List���ӿڣ��涨�ܶ���Լ��ϲ����ķ���
//ArrayList��List�ӿ�һ��ʵ����
//ʹ�ø�������ָ���������
//1) ��Լ��ϵ�ʹ�ã�����Ҫ���뼯����
//2) add(����)�������������Ԫ��
//3) isEmpty():�жϼ����Ƿ���Ԫ�أ��У�false
//	 û�У�true
//4) get(index):��index�±꣬ȡ�����϶�Ӧ��Ԫ��
//	 �м�ȡ��Ԫ���Ժ�,�����������ת��
//5) toString():��ArrayList�У��÷�����
//	 ��ʾ���ü��������е�Ԫ�أ������������ã�
//6) clear():��ոü��������е�Ԫ��	
//7) remove(index):����index�±�ɾ����Ӧλ�õ�
//	Ԫ��
//8�� size����:��ʾ��ǰ������Ԫ�صĸ���	
  public static void main(String[] args){
	List list =new ArrayList();
	list.add(new Person("���"));
	list.add(new User("���ĳɶ�",32));
	list.add(new User("����",43));
	System.out.println("list���Ƿ���Ԫ�أ�"
			+list.isEmpty());
	User user = (User)list.get(1);
	System.out.println(user.name);
//	list.clear();��ռ��������е�Ԫ��
//	System.out.println(list.isEmpty());
	list.remove(1);
//ɾ����2��Ԫ�أ�ͬʱ��3��Ԫ�ػ���ǰ��ռ�ݵ�2��Ԫ��
//��λ��	
	User user2 = (User)list.get(1);
	System.out.println(user2.name);
	System.out.println(list.size());
  }
}
