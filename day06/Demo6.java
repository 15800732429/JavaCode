
public class Demo6 {
//输出200到300之间所有的偶数和奇数
  public static void main(String[] args){
	for(int i=200;i<=300;i++){
	  if(i%2!=0){//奇数
		System.out.println(i+"是奇数");
	  }else{
		System.out.println(i+"是偶数");
	  }
	}
  }
}
