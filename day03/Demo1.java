
public class Demo1 {
//i++:后置++
//i++：首先确定表达式i++的值是当前i的值，然后
//i=i+1	
//切记：表达式i++的值跟变量i的值之间区别	
  public static void main(String[] args)
  {
	int num = 100;
    int sum = num++;
//首先num++的值是100,然后num = num+1（101）
//最后num++表达式的值赋值给sum（100） 
//	System.out.println(num);   
       
    int i = 100;
    i = i++;
    
//运算优先级： ++运算符的优先级高于赋值运算，先运算
// i++，最后把i++的结果赋值给i
//首先确定i++表达式的值（i=100），然后 i=i+1
//（i=101），最后把i++表达式（100）的值赋值给
//i（i=100）
//i被赋值2次，第1次自增i = 101，第2次i++表达式
//的值赋值给i i = 100    
    System.out.println("i="+i);
    
    
  }
}
