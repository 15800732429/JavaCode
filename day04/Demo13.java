import java.util.Scanner;
public class Demo13 {
//�������뻹�����ݣ����㵱ǰ��������
//Ĭ������£�����double  rate = 10.0 ��%��
//1�����ڻ��  5��	   year<=1&&year>0
//3�����ڻ��  6��        year<=3&&year>1
//5�����ڻ��  8��        year<=5&&year>3
//10�����ڻ��ԭ����  year<=10&&year>5
//20�����ڻ���	�������ϸ�20% year<=20&&year>10
//30�����ڻ�������ϸ�50% year<=30&&year>20
  public static void main(String[] args){
	int year;
	double rate = 10.0;//ԭ����
	double realRate;
Scanner scanner=new Scanner(System.in);
  	System.out.println("�����뻹�����ݣ�year����");
  	year = scanner.nextInt();
  	if(year<=1 && year>0){
  	  realRate = 0.5 * rate; 
  	}else if(year<=3 && year>1){
  	  realRate = 0.6*rate;
  	}else if(year<=5 && year>3){
  	  realRate = 0.8*rate;
  	}else if(year<=10 && year>5){
  	  realRate = rate;
  	}else if(year<=20 && year>10){
  	  realRate = 1.2*rate;
  	}else {
  	  realRate = 1.5*rate;
  	}
  	System.out.println("��ǰ���ʣ�"+realRate+"%");
  }	
	
	
	
	
}
