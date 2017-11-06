/**
 * 自动转换 【浮点数】（float double）
 * @author Administrator
 *
 */
public class Demo03 {
	
	public static void main(String[] args) {
		
		/**
		 * int + float  ---->  类型自动转为float
		 */
		int a =  3;
		float b = 0.14F;
		b =  a + b; 
//		double w = a + b;
		
		//  float  + long ---> float
		long c = 1L;
	    b =  c + b; 
	    
	    double d =  3.14D;
	    float e =  2.123F;
	    d = d + e; 
	     
	    int i = 12;
	    double  j = i;
		
	    System.out.println(1.0/3);
	    System.out.println(10.0/3);
	    
	    System.out.println("===================>");
	    
	    System.out.println(1.0f/3);
	    System.out.println(10.0f/3);
	    
	}

}
