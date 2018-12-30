package workbook.StepD;

import java.util.Scanner;

public class Multiplication {
	private int dan; // 출력하려는 구구단의 단 수
	
	public Multiplication()
	{
		input();
	}
	
	public void printDan()
	{
		for(int i = 1; i<10; i++)
			System.out.printf("%d x %d = %d\n", dan, i, i*dan);
	}
	
	void input()
	{
		Scanner s = new Scanner(System.in);
		while(true)
		{
			System.out.printf("출력하고 싶은 구구단의 단 수를 입력하시오(2~9).");
			dan = s.nextInt();
			if(dan<2 || dan>9)
				System.out.printf("잘못 입력하였습니다.\n");
			else
				break;
		}
	}
}
