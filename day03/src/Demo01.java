import java.math.BigDecimal;

/**
 * 数据类型
 * 	分类 ： 
 * 	    1.基本类型   8 种  如 int double  char
 * 
 * 		2. 引用类型   String class 数组(后面再讲)
 * 
 * @author Administrator
 *
 */
public class Demo01 {
	
	public static void main(String[] args) {
		
		// 引用类型 
		String str = "";
		
		/** 
		 *  第一类  整型  【整数】
		 *   byte    short  int  long 
		 */
		
		//1.byte     [-128 , 127]  记
		byte a =  12;
		System.out.println(a);
       //a = 128;
		
		// 2.short 短整型  []   [-32768,32767]  记
		short  b  = 13123; 
		System.out.println(b);
		//b = 40000; 
		
		//3. int (整型)  4字节     32位
		int c = 1000000000;
		//c = 10000000000;
		
		//4.long 长整型  8字节   64位数
		long  d = 10000000000l; // 不推荐使用‘l’
		long f = 123L;  // 
		
		/**
		 * 第二类
		 * 浮点型 【小数】  
		 *  float  double 
		 */
		double g = 3.14;
		System.out.println(g);
		
		g = 1.0/3;
		System.out.println(g);
		
		float h = 3.14f;
		h = 0.5F;
	
		
		/**
		 * 第三类   字符型
		 * char   
		 */
		char  j = 'A';
		System.out.println(j+1);  // 转换为 65 + 1
		System.out.println(j+"1");  // 拼接
		
		/**
		 * 第四类   布尔类型 boolean
		 *  只有  true  false 
		 */
		
		boolean x = true;
		boolean y = false;
		
//		BigDecimal
		
		
	}

}