package day02;
/**		标识符组成规则
 *      A:英文大小写字母(字符统称-->中英文皆可，强烈不推荐使用中文)
		B:数字
		C:$和_

 *
 */
public class Demo01 {

	public static void main(String[] args) {
		
		// 
		int count = 5;  // 变量的标识符
		System.out.println(count);
		
		int 康旭 = 110;
		System.out.println(康旭);
		
		//1. 大小写  敏感
		int Sc = 23;
		System.out.println(Sc);
		int sc = 24;
		System.out.println(sc);
		
		//2.不能以数字开头   
		int kx110 = 110;
//		int 110kx = 110;
 		
		// 3.可以使用 $ 和 _  (￥)
		int $WQ = 120;
		System.out.println($WQ);
		int _WQ = 121;
		
		// 注意： 1. 【强制】所有编程相关命名均不能以下划线或美元符号开始，也不能以下划线或美元符号结束
		

	}

}
