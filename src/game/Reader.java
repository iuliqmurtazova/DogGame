package game;

import java.util.Scanner;

public class Reader {
	private static Scanner input = new Scanner(System.in);; 
	
	public static String readFromConsoleString(){
		String dogName=input.next();
		return dogName;
	}
	
	public static int readFromConsoleInt(){
		return input.nextInt();
	}
}
