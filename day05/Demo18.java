
public class Demo18 {
//«Û1+2+3+4+5...+100,”√do...while
  public static void main(String[] args){
	int i = 1;
	int sum = 0;
	do{
	  sum = sum + i;	
	  i++;	
	}while(i<=100);
	System.out.println("sum ="+sum);
  }
}
