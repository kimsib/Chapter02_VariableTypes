package ch02_4_console_in_out;

import java.io.IOException;
import java.util.Scanner;
public class SystemInOut {
	public static void main(String[] args)  {
		
//		boolean working = true;
//		int keyCode;
//		while(working) { 
//		try {
//			keyCode = System.in.read();
	//		System.out.printf("keycode: %d\n", keyCode);
			
	//		if(keyCode == 'q' || keyCode == 'Q') {
	//			working = false;
//				}
//			}
			
		
//		 catch (IOException e) {
			// TODO Auto-generated catch block
	//		e.printStackTrace();
//		}
		
//		}
		
//		System.out.println("���α׷��� ���������� ����Ǿ����ϴ�.");
		
		
		
		Scanner scn = new Scanner(System.in);
		String str = "";
		while(true) {
			
			System.out.println();
			str = scn.nextLine();
			System.out.printf("�Է��Ͻ� ���ڿ��� \"%s\"\n", str);
			if(str.equalsIgnoreCase("q")) {
					break;
				}
			}
			
			
			
		}
		
		System.out.println("���α׷��� ���������� ����Ǿ����ϴ�.");
		scn.close();
		
		
	}

