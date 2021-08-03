package ch02_3_type_casting;

public class primitiveAndStringConversionExample {
	public static void main(String[] args) {
//			[	실무에서 많이 쓰이는 강제타입변환     ]
//		"문자열" ---> 숫자
//		       <--- 
			String str = "100";
			int    var =  100;
			
			str = str + 1;
			var = var + 1;
			System.out.println(str);
		
//			숫자 < ------ 문자열			
			int value = integer.parseint("123456") + 1;// 123457
//			문자열 < ------ 숫자
			String str = integer.toString(value) + "8";	//1234578
			str = String.valueof("100" + 1);
			
			System.out.println(str);
			
			
			
			String number = "1234";
					
			System.out.println(number + 5); // "12345"
			
			
			System.out.println(value);
			
			System.out.println(integer.MAX_VALUE);
			System.out.println(integer.MIN_VALUE);
			System.out.println(integer.SIZE);
			
			System.out.println(Byte.MAXVALUE);
			
			int higf = integer.MIN_VALUE;
		
	}
}
