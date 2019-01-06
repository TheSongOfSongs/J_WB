package workbook.StepI;

import java.util.Scanner;

public class SecondTriangle {
	private int blanks;
	private int size;
	private char ch;
	
	public SecondTriangle()
	{
		input();
	}
	
	void input()
	{
		Scanner s = new Scanner(System.in);
		
		System.out.printf("직각 삼각형을 그리는데 사용할 문자를 입력하시오. ");
		ch = s.next().charAt(0);
		
		System.out.printf("직각 삼각형의 높이와 왼쪽 여백의 크기를 입력하시오. ");
		size = s.nextInt();
		blanks = s.nextInt();
		
		PrintCharWithBlank(blanks, size, ch);
	}
	
	void PrintCharWithBlank(int blanks, int size, char ch)
	{
		for(int i=0; i<size; i++) // 라인 증가
		{
			for(int j=0; j<(blanks+size-i+1); j++)
				System.out.print(" ");
				
			for(int j=0;j<(i+1); j++)
				System.out.printf("%s", ch);
		
			System.out.println(); // 줄 바꿈
		}	
	}
}
