public class Demo4 {
	// ��500�������е�ż���������е�������
	// ������ʾ��ż����������
	// while��if...else��ʹ��
	// ������
	// 1�� ��1��500֮�����е�������Χ
	// 2�� if��i%2==0�� ż��
	// else ����
	public static void main(String[] args) {
		int i = 1;
		while (i <= 500) {
			if (i % 2 == 0) {// ż��
				System.out.println(i + "��ż��");
			} else {// ����
				System.out.println(i + "������");
			}
			++i;
		}
	}

}
