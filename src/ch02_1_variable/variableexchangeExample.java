package ch02_1_variable;

public class variableexchangeExample {
	public static void main (String[] args) {
		
		int x = 100; 
		int y = 200;
		int temp;
		
		temp = x;
		
		System.out.println("x의값: " + x );
		System.out.println("y의값: " + y );
	
		x = y; 
		System.out.println("x=y, x의 값:" + x);
		System.out.println("x=y, x의 값:" + y);
		
		y = temp;
		System.out.println("y=x. x의 값:" + x);
		System.out.println("y=x. y의 값:" + y);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
