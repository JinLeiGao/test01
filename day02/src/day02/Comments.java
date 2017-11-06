package day02;

/**
 *  介绍 Java 注释    --> 提高代码的可读性  便于代码的阅读
 *  
 *  1.  单行注释       //   作用 ： 注释一行代码
 *  2.  多行注释                    作用 ： 注释多行代码
 *  3.  文档性注释       
 * @author Administrator
 *
 */
public class Comments {

	
	public static void main(String[] arg/*s*/) {
		
		// 单行注释 
		//int count = 1; sdfasfd
		
		//2. 多行注释
		
		/*
		 * 打印 
		 * 
		System.out.println("jack.ma");  // 马云
		System.out.println("李岩松");
		System.out.println("赵丽颖");
		*/
		
		
	}
	
	 // 3.文档性 注释
	/**
	 * 登录
	 * @param params 参数
	 * @return     返回值  
	 */
	public int login( int params) {
		return 12;
	}
	

}
