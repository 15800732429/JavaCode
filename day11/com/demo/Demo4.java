package com.tarena.demo;

public class Demo4 {
//����javaBean�࣬����������Ժ󣬵��ý�Ϊ����
//����˽�����Է���	
  public static void main(String[] args) {
	User user = 
new User("���޼�","��",20,
			"zhang@163.com",false,10);
//ͨ��set�������޸�����	
	user.setName("���粻��");
	user.setSex("�����");
//ͨ��get������������Ե�ֵ
	System.out.println(user.getName());
	System.out.println(user.getEmail());
	System.out.println(user.getSex());
	System.out.println(user.getSalary());
	System.out.println(user.getAge());
	System.out.println(user.isMarry());
  }
}

// JavaBean:��ҵ�����ı�̵�ϰ�ߣ�����java�﷨
// ���򣬺ô������ʷ��㣨˽�����Եķ��ʣ�
// 1 �������е����ԣ�ȫ��ʹ��private����
// 2 ���ÿһ��private���ε����ԣ����ṩ��get��
// set���������ڷ���
// 3 ����Ҫ��һ���ղεĹ��췽��
// ���������User���û��ࣩ
// ���ԣ����֣��Ա����䣬���䣬���boolean����
// ����
// ���췽����1���ղεĹ��췽��
// 2�� �����е����Ը�ֵ
// ������������е����ԣ��ṩget ��set����
// ���Ҵ����д��
// User����javaBean�����е�Ҫ�󣬽���JavaBean

class User {
	// 1 ���е�����˽��
	private String name;
	private String sex;
	private int age;
	private String email;
	private boolean marry;
	private double salary;

	// 2 Ҫ�ղεĹ��췽��
	public User() {
	}

	public User(String name, String sex, int age, String email, boolean marry,
			double salary) {
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.email = email;
		this.marry = marry;
		this.salary = salary;
	}

	// 3 ���˽�����ԣ��ṩget/set����
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
//boolean���Ե�ȡֵ�ķ������֣�
//					is�������֣�����ĸ��д��
	public boolean isMarry() {
		return marry;
	}

	public void setMarry(boolean marry) {
		this.marry = marry;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
