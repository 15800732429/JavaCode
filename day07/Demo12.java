
public class Demo12 {
//�������ķ�����
//1 �βΣ������������õ�ʱ��ϵͳ��ʱ���ٵĴ洢
//�ռ䣬��������ʵ�δ��ݹ�����ֵ	
//2 ʵ�Σ���ʵ���ڵı������ǰ�ʵ�ε�ֵ�����β���
//3 ֵ�ô��ݣ���ʵ�ε�ֵ���Ƶ��β���
//4 �βεĸı��ʵ��û���κε�Ӱ��
  static void update(int num1){
//	num1���β�  
	num1 = num1-1;
	System.out.println("�β�num1="+num1);
  }
  public static void main(String[] args){
	int num = 20;
	update(num);//num��ʵ��
	System.out.println("ʵ��num="+num);
  }
}
