/**
 * 运算符 
 * 	   算术运算  
 * 	    1.   +     --->  正号   加   字符串拼接  
 *      2.   -     --->  负号   减
 *      
 */
public class Demo06 {
	
	public static void main(String[] args) {
		
		/**
		 *  + 的使用   
		 */
		int i =  +4; //  正号 
		System.out.println(i);
		int  j = 10;
		i  = i + j; // 运算符   加 
		System.out.println(i);
		//拼接的作用
		System.out.println( "kang" + "xu" );
		
		/**
		 *  -  的使用   
		 */
		i = -i;
		System.out.println(i); // 负号
		int k = i-j;
		System.out.println(i-j);
		System.out.println(k);
		
		// *  乘     / 除法
		System.out.println(4*5);
		/**
		 *  / 除法
		 */
		System.out.println(4/5);
		
		float m = 4/5;      // int / int   --->  小数丢失 【精度丢失】
		System.out.println(m);
		
		float n = 4.0f/5;  // float / int  -----》float  (保留小数)
		System.out.println(n);
		
		System.out.println(12/0); //  java.lang.ArithmeticException: / by zero
		
		/**
		 *   %  取模 (余)
		 */
		System.out.println(4%5);
		System.out.println(10.1%3);  //  1.0999999999999996  
		System.out.println(0.1F%3);  // 小数也可以  取模
		System.out.println(-4%7);
		
		System.out.println(1234/10*10); //注意   "坑" 
		
	}

}
