package ch02_3_type_casting;

public class primitiveAndStringConversionExample {
	public static void main(String[] args) {
//			[	�ǹ����� ���� ���̴� ����Ÿ�Ժ�ȯ     ]
//		"���ڿ�" ---> ����
//		       <--- 
			String str = "100";
			int    var =  100;
			
			str = str + 1;
			var = var + 1;
			System.out.println(str);
		
//			���� < ------ ���ڿ�			
			int value = integer.parseint("123456") + 1;// 123457
//			���ڿ� < ------ ����
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
