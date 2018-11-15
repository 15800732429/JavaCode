
public class Demo7 {
//动态初始化：
//数据类型[] 数组名 = new 数据类型[]{值1，值2，
//	          			 值3，值4，值5...};	
//动态初始化的数组中元素的个数：跟值得个数一致，
//	[]中不要添加任何的数字(不要指定元素的个数)
  public static void main(String[] args){
	char[] array = 
		new char[]{'a','b','c','d','e'};
	for(char c : array){
		System.out.println(c);
	}
	
	
  }
}
