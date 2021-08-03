package ch02_3_type_casting;

public class stringConcatExample {
	public static void main(String[] args) {
		
		
		int value = 10 + 2 + 8;
		System.out.println("value: " + value);
		
		
		
		String Str1 = 10 + 2 + "8";
		System.out.println("Str1 : " + Str1);
		
		String Str2 = 10 + "2" + 8;
		System.out.println("Str2 : " + Str2);
		
		String Str3 = "10" + 2 + 8;
		System.out.println("Str3 : " + Str3);
		
		String Str4 = "10" + (2 + 8);
		System.out.println("Str4 : " + Str4);
		
	}
}
