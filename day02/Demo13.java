
public class Demo13 {
//�Լ���--��
//--i���ѱ���i��ֵ��һ
//����i��ֵ�����ʽ--i��ֵ
//--i����Ĺ��ɣ�����i-1��ֵ��ֵ��i��Ȼ���i����
//�Ժ��ֵ��Ϊ--i���ʽ��ֵ
  public static void main(String[] args)
  {
	int num = 10;
//	int result = --num;
//����������num-1��ֵ��ֵ��num��Ȼ���num�����Ժ�
//ֵ��Ϊ--num���ʽ��ֵ������--num���ʽ��ֵ
//��ֵ��result
//	System.out.println("result="+result);
//	System.out.println("num="+num);
//	result = --num + --num
	int result2 = --num + --num;
//��1��--num��       num ��9      --num��9 
//��2��--num��       num ��8      --num��8	
//������--num���ʽ��ֵ��ӣ� 17
//��17��ֵ��result2
	System.out.println("result2="+result2);
	System.out.println("num="+num);
	
	
	
  }
}
