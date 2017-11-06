package day02;
/**
 * 常量： 在程序执行的过程中，值不会发生变化
 *  1. 字面值常量   
 *  2. fianl  修饰的  
 * 
 * @author Administrator
 *
 */
public class Constant {
	
	public static void main(String[] args) {
		/*
		 * 字面值 常量
		 * 计算一个 长方形面积  长 12   宽 13
		 */
		System.out.println("长方形的面积为：" + (12*13));  // +  拼接的效果
		
		/*
		 * 计算计算一个正方形 
		 * 		边长 ：  5 
		 */
		final int c  =  5 ;   //  final 最终
		//		c = c+1; //  不能发生变化
		System.out.println("正方形面积：" + (c*c));
	}
	

}
