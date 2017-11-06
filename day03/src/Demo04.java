/**
 *  强制转换  : 较大类型数据 强制转为较小类型的数据
 * 
 */
public class Demo04 {
	public static void main(String[] args) {
		/*
		 * 合理的的数据转换   未出现进度丢失
		 */
		int a =  12;
		short b = (short)a;
		byte c =(byte) b;
		System.out.println(c);
		/**
		 * int ---> byte [数据类型的范围  ---》 数据错误]
		 */
		int d = 130;
		byte e = (byte)d;
		System.out.println(e);
		
		// 注意点 [数据没有问题 在计算过程 数据溢出]
		int i = 1000000000;
		int j = 30;
		long k = 1L * i * j ;
		System.out.println(k);
		
		/**
		 * double ----> float  强制类型转换
		 */
		double m = 3.14;
		float n = (float)m;
		System.out.println(n);
		
	}
}
