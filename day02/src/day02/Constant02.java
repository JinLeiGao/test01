package day02;

public class Constant02 {
	
	public static void main(String[] args) {
		
		// 计算 圆 的 面积    （S=πr²）   半径 ： 3
	 	 double  PI  = 3.14;
	 	//    半径 ： 3
	 	final int SXT_MAX_RADIUS = 3; 
	 	
	 	double  area = PI * SXT_MAX_RADIUS * SXT_MAX_RADIUS;
	 	
	 	System.out.println("尚学堂圆的面积： " + area);
	 	
	}

}
