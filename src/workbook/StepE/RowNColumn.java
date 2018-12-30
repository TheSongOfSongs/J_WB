package workbook.StepE;

import java.util.Scanner;

public class RowNColumn {
	private int rows, columns;// 행의 개수, 열의 개수
	private int number; //각 칸에 출력하는 값
	
	public RowNColumn() {input();}
	
	public void input()
	{
		Scanner s = new Scanner(System.in);
		System.out.printf("출력하려는 행의 크기와 열의 크기를 입력하시오. ");
		rows = s.nextInt();
		columns = s.nextInt();
	}
	
	public void printRNC()
	{
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=columns; j++)
			{
				number = i*j;
				if(number<10)
					System.out.printf("    ");
				else if(number<100)
					System.out.printf("   ");
				else
					System.out.printf("  ");
				System.out.printf("%d", number);
			}
			System.out.println();
		}
	}
}
