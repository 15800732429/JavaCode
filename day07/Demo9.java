
public class Demo9 {
//方法：一段含有特定业务逻辑功能的代码，可以被人调用
//格式：static 返回值类型  方法名(参数列表){
//	       	方法体
//     }
//返回值类型：该方法返回数据的类型
//void: 没有任何的返回值
//参数列表：外界调用该方法的时候，传入的参数
//无参无返回值	
//调用方法：方法名(参数值);	
   static void speak(){
	 System.out.println("今天天气不错");
	 System.out.println("希望明天天气也很好");
   }
//在main方法中调用speak()方法
   public static void main(String[] args){
	 speak();
	 System.out.println("你好！");
   }
}



