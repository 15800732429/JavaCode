
public class Demo1 {
//i++:����++
//i++������ȷ������ʽi++��ֵ�ǵ�ǰi��ֵ��Ȼ��
//i=i+1	
//�мǣ�����ʽi++��ֵ������i��ֵ֮������	
  public static void main(String[] args)
  {
	int num = 100;
    int sum = num++;
//����num++��ֵ��100,Ȼ��num = num+1��101��
//���num++����ʽ��ֵ��ֵ��sum��100�� 
//	System.out.println(num);   
       
    int i = 100;
    i = i++;
    
//�������ȼ��� ++����������ȼ����ڸ�ֵ���㣬������
// i++������i++�Ľ����ֵ��i
//����ȷ��i++����ʽ��ֵ��i=100����Ȼ�� i=i+1
//��i=101��������i++����ʽ��100����ֵ��ֵ��
//i��i=100��
//i����ֵ2�Σ���1������i = 101����2��i++����ʽ
//��ֵ��ֵ��i i = 100    
    System.out.println("i="+i);
    
    
  }
}