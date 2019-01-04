package workbook.StepH;

import java.util.Scanner;

public class SeventhPrint {
	private String input; // 입력받는 문자열
	
	public SeventhPrint()
	{
		input();
	}
	
	void input()
	{
		Scanner s = new Scanner(System.in);
		
		System.out.printf("============================\n");
		System.out.printf("=> 문자열을 입력하세요 (x: 종료) : ");
		input = s.next();
		
		if(input.equals("x"))
			System.out.printf("* 종료되었습니다.\n");
		else
			printString();
		
	}
	
	void printString()
	{
		System.out.printf("=> 총 문자의 개수는 %d개입니다.\n", input.length());
		for(int i=0; i<input.length(); i++)
			System.out.printf("=> %s\n", input.charAt(i));
		
		System.out.printf("\n\n\n");
		input();
	}
	
}
