public class Demo3 {
//����50��Ԫ�ص����飬��1��ʼ��100֮���ż����  
//�ֱ��������Ԫ�ظ�ֵ��2*��i+1��
//������ż����2,4,6,8,10...100
//for(i = 0;i<����ĳ���;i++){
//  ������[i] = (i+1)*2;	
//}
  public static void main(String[] args){
	int[] ary = new int[50];
	for(int i=0;i<ary.length;i++){
	  ary[i] = (i+1)*2;
	  System.out.println(ary[i]);
	}
  }	
  
}
