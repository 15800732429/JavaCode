
public class Demo5 {
//���3000�����ڵ����꣬����forʵ��
  public static void main(String[] args){
	for(int i=1;i<=3000;i++){
	  if((i%4==0&&i%100!=0)||i%400==0){
		  System.out.println(i+"������");
	  }
	}
  }
}