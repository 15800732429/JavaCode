
public class Demo5 {
//�ж�����
  public static void main(String[] args){
//	������ݣ�
	int year = 2000;
	String result =
(year%4==0&&year%100!=0)||year%400==0?
		"������" : "��������";
	System.out.println(year+result);
  }
}
