package com.tarena.demo;

public class Demo4 {
//符合javaBean类，创建完对象以后，调用较为方便
//访问私有属性方便	
  public static void main(String[] args) {
	User user = 
new User("张无忌","男",20,
			"zhang@163.com",false,10);
//通过set方法来修改属性	
	user.setName("东风不败");
	user.setSex("不清楚");
//通过get方法来获得属性的值
	System.out.println(user.getName());
	System.out.println(user.getEmail());
	System.out.println(user.getSex());
	System.out.println(user.getSalary());
	System.out.println(user.getAge());
	System.out.println(user.isMarry());
  }
}

// JavaBean:企业开发的编程的习惯，不是java语法
// 规则，好处，访问方便（私有属性的访问）
// 1 类中所有的属性，全部使用private修饰
// 2 针对每一个private修饰的属性，都提供其get和
// set方法，便于访问
// 3 必须要有一个空参的构造方法
// 案例：设计User（用户类）
// 属性：名字，性别，年龄，邮箱，婚否（boolean），
// 工资
// 构造方法：1）空参的构造方法
// 2） 给所有的属性赋值
// 方法：针对所有的属性，提供get 、set方法
// （我带大家写）
// User满足javaBean的所有的要求，叫做JavaBean

class User {
	// 1 所有的属性私有
	private String name;
	private String sex;
	private int age;
	private String email;
	private boolean marry;
	private double salary;

	// 2 要空参的构造方法
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

	// 3 针对私有属性，提供get/set方法
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
//boolean属性的取值的方法名字：
//					is属性名字（首字母大写）
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
