package workbook.StepE;

import java.util.Scanner;

public class StarTriangle {
	private int height; // 입력받은 높이
	
	public StarTriangle(){input();}
	
	public void printTriangle()
	{
		for(int i=0; i<height; i++) // 라인 증가
		{
			for(int j=0; j<(height-i); j++)
				System.out.printf(" ");
			for(int j=0;j<2*i+1; j++)
				System.out.printf("*");
			System.out.println(); // 줄 바꿈
		}	
	}
	
	void input()
	{
		Scanner s = new Scanner(System.in);
		System.out.printf("이등변 삼각형의 높이를 입력하시오.");
		height = s.nextInt();
	}
}
