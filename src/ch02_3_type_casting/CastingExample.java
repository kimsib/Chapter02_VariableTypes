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
		
	
		
//		강제(명시적)형변환
//		:~ 해석하는 방법을 변환..
		
//				System.out.println((char)65);
//				확장(promotion) : int ----> double 손실(x) 자동
//				축소(Demotion) : double ----> int 손실(o) 강제  . . 0.5 --> 0
				
				
//	작은 = 큰		
		
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
