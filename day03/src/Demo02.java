/**
 *  数据类型转换
 *  	1.自动转换     ： 较小容量  的数据类型 转换成较大容量的数据类型   【精度不丢失】 
 *  			     小 结 ： (1)  byte  short char  int  进行运算的时候 会自动提升数据类型 【int】 
 *  				    (2)  如果有long 参入运算    会自动提升为long 类型数据
 *  		
 *      2.强制类型转换
 *      
 * @author Administrator
 *
 */
public class Demo02 {
	public static void main(String[] args) {
		
		byte a = 28; 
		short b  = a; //  byte  ---->      short   精度不丢失
		System.out.println(b);
		
		int c = b;    //  short ---->       int    精度不丢失
 		System.out.println(c);
 		
 		long d = c;
 		System.out.println(d);  //int ----> long 精度不丢失
 		
 		
 		
 		System.out.println("================================");
 		
 		
 		/**
 		 * byte 进行运算的时候  自动提升 为 int类型计算
 		 *
 		 */
 		byte x  = 4;
 		byte y = 5;
 		int z = x * y;  //  byte 在运算时候 自动 类型 提升 转成int
 		//byte w = x + y;
 		
 		
 		
 		/**
 		 * short 进行运算的时候  自动提升 为 int类型计算
 		 */
 		// short 进行运算
 		short u = 3;
 		short v = 4;
       //short q = u + v;
 		
 		/**
 		 * 只用int 参入运算  ----> 自动类型提升为 int
 		 */
 	   int i  = 3; 
 	   int j  =  4;
 	   j =  i + j;
 		
 	   
 	   
 	   /**
 	    * long 参入运算
 	    */
 	
 	   int k = 10;
 	   long h = 12L; 
 	   h  = k + h; //  int  + long  -----> 结果是long
 	   h = a + h;  //  byte + long ------> 结果是long
 	   
 	   
 	   /**
 	    *  short + byte   运算的时候，自动转为 int 类型 进行计算
 	    */
 	  byte m = 4;
 	  short n = 5;
 	  int r  = m + n; 
 	   
 	  /**
 	   * char + int  运算的时候 自动提升为 int
 	   */
 	  char ch  =  'a';
 	  int ab  = ch + 1;
 	  System.out.println(ab);
 	  
 	  ab = ch + m; // char + byte  ---> 都会自动提升为int
 	  
	}
	
	

}
