public class Demo4 {
	// 求500以内所有的偶数，和所有的奇数，
	// 并且显示是偶数还是奇数
	// while中if...else的使用
	// 分析：
	// 1） 从1到500之间所有的数，范围
	// 2） if（i%2==0） 偶数
	// else 奇数
	public static void main(String[] args) {
		int i = 1;
		while (i <= 500) {
			if (i % 2 == 0) {// 偶数
				System.out.println(i + "是偶数");
			} else {// 奇数
				System.out.println(i + "是奇数");
			}
			++i;
		}
	}

}
