public class Demo8 {
//�����������+��-��*��/��%
//1 ������������˵����ݱ�����ͬһ����
//2 ����Ľ��������������������������һ��
  public static void main(String[] args)
  {
	float numFloat = 20.1f;
	int numInt = 18;
	float result1 = numInt + numFloat;
//����������numInt��int�����Զ�ת��Ϊfloat����
//(18.0f),Ȼ��ִ��numInt����numFloat,����
//�����ֵ��result1
	System.out.println("result1="+result1);
    int numInt2 = 9,numInt3 = 10;
    double numDouble =
    	      numInt2 / numInt3;
//����������numInt2��numInt3��ͬһ���������ͣ�
//ֱ��ִ�г������㣬��������numInt2��numInt3
//ͬһ���������� �����0.9�����ͱ���������������
//С�����Ժ����е����� ���������0 ���Զ�����ת��
//0.0����ֵ��numDouble
    System.out.println(numDouble);
  
  
  
  
  
  }
}
