package day02;

/**
 * ����  
 * ע������  ��
 * 		 1.  ���÷�Χ  [������]
 * 		 2.  ����ִ�й��� ��ֵ���Է����仯
 * 
 * @author Administrator
 *
 */
public class Demo05 {
	
 	final static String SXT_STR = "��־��";
	
	static int a  = 3; // ����

	public static void main(String[] args) {
		// ȫ�ֱ���  a 
		System.out.println(a);
		
		//System.out.println(i);  // �ֲ�����i  ��������Χ ���ɴ�
		// �ֲ����� i  
		int i = 2;
		System.out.println(i);
		
		System.out.println(SXT_STR); // ���������÷�Χ
		//hello() ;  ������ ��ʾЧ��
		
		
		/**
		 * ��������
		 * 1. ��ֵ
		 * 2. ȡֵ
		 */
		int x   = 45;   // x  ��ֵ
		int y = x;      // x   ȡֵ      y ��ֵ
		
		String gf = "����ӱ";
		String wife  = gf; 
		System.out.println(wife);
		
		
		
	}

	
	public static void hello(String[] args) {
		
		System.out.println(SXT_STR); // ����
		
		System.out.println(a);
	}
	
}
