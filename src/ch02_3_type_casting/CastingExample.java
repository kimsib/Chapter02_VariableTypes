package ch02_3_type_casting;

public class CastingExample {
	public static void main(String[] args) {
		int intvalue = 44032;
		char charvalue = (char) intvalue;
		
		System.out.println(charvalue);
		
		long longvalue = 500;
		intvalue = (int) longvalue;
		System.out.println(intvalue);
		
		double doublevalue = 3.14;
		intvalue = (int) doublevalue;
		System.out.println(intvalue);
		
	
		
//		����(�����)����ȯ
//		:~ �ؼ��ϴ� ����� ��ȯ..
		
//				System.out.println((char)65);
//				Ȯ��(promotion) : int ----> double �ս�(x) �ڵ�
//				���(Demotion) : double ----> int �ս�(o) ����  . . 0.5 --> 0
				
				
//	���� = ū		
		
//		int iv = 127; 
//		iv = 1000000;
		
//		byte bv = (byte)iv;
//		System.out.println(bv);
		
//		(char)<---- int....long
//		double dv = 3.14;
//		iv = (int)dv;
		
//		System.out.println(iv);
		
//		int number =(int)"7810011111111"
				
//				System.out.println("781001-1111111");
		
		
		
		
		
		
		
		
	}
}
