
public class Demo11 {
//��ֵ < �߼� < ��ϵ < ����
  public static void main(String[] args){
	int num1 = 10,num2 = 20,num3 =100;
	boolean result1 = 
num1+100>2000 && num2+num1>1000
               && num1+num2+num3!=10000;
//��1������������      num1+100       110
//      num2+num1      30 
//   num1+num2+num3    130
//��2������ϵ����     110>2000       false  
//      30>1000        false
//      130!=10000      true
//��3�����߼���������             false
//��4������ֵ���� false ��ֵ��result1
     System.out.println(result1);
  
  }
}
