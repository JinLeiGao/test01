package day02;

/**
 * 变量  
 * 注意问题  ：
 * 		 1.  作用范围  [作用域]
 * 		 2.  程序执行过程 数值可以发生变化
 * 
 * @author Administrator
 *
 */
public class Demo05 {
	
 	final static String SXT_STR = "董志华";
	
	static int a  = 3; // 属性

	public static void main(String[] args) {
		// 全局变量  a 
		System.out.println(a);
		
		//System.out.println(i);  // 局部变量i  的作用域范围 不可达
		// 局部变量 i  
		int i = 2;
		System.out.println(i);
		
		System.out.println(SXT_STR); // 常量的作用范围
		//hello() ;  不掌握 演示效果
		
		
		/**
		 * 变量作用
		 * 1. 存值
		 * 2. 取值
		 */
		int x   = 45;   // x  存值
		int y = x;      // x   取值      y 存值
		
		String gf = "赵丽颖";
		String wife  = gf; 
		System.out.println(wife);
		
		
		
	}

	
	public static void hello(String[] args) {
		
		System.out.println(SXT_STR); // 常量
		
		System.out.println(a);
	}
	
}
