
public class Demo1 {
//���庬��100�����������飬�����е�Ԫ�ظ�ֵ����0��ʼ
//��ֵ,һֱ�����һ��Ԫ�ظ�ֵ99,��0��99������Ԫ��
//��ֵ(for),���������ÿһ��Ԫ�ص�ֵ(for)
  public static void main(String[] args){
//	��������
	int[] array = new int[100];
//	����forѭ��������arrayÿ��Ԫ�ظ�ֵ������ѭ��
//	������i����Ϊ��ǰ������ÿ��Ԫ�ص��±�
	for(int i=0;i<array.length;i++){
	  array[i] = i;
	}
//	���Ҳʹ��for
	for(int i=0;i<=array.length-1;i++){
	  System.out.println(
"array["+i+"]="+array[i]);
	}
	
  }
}
