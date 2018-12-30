package workbook.StepE;

import java.util.Scanner;

public class StarTriang {
	private int height; // 입력받은 높이
	private int blank; // 입력받은 여백 크기
	
	public StarTriang(){input();}
	
	public void printTriang()
	{
		for(int i=0; i<height; i++) // 라인 증가
		{
			for(int j=0; j<blank; j++)
				System.out.printf(" ");
			
			for(int j=i; j<height; j++)
				System.out.printf(" ");
			
			for(int j=0;j<i; j++)
				System.out.printf("*");
		
			System.out.println(); // 줄 바꿈
		}	
	}
	
	void input()
	{
		Scanner s = new Scanner(System.in);
		System.out.printf("직각 삼각형의 높이와 왼쪽 여백의 크기를 입력하시오.");
		height = s.nextInt();
		blank = s.nextInt();
	}
}
