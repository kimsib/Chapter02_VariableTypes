package ch02_1_variable;

public class variableexchangeExample {
	public static void main (String[] args) {
		
		int x = 100; 
		int y = 200;
		int temp;
		
		temp = x;
		
		System.out.println("x�ǰ�: " + x );
		System.out.println("y�ǰ�: " + y );
	
		x = y; 
		System.out.println("x=y, x�� ��:" + x);
		System.out.println("x=y, x�� ��:" + y);
		
		y = temp;
		System.out.println("y=x. x�� ��:" + x);
		System.out.println("y=x. y�� ��:" + y);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
