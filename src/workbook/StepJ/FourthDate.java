package workbook.StepJ;

import java.util.Scanner;

public class FourthDate {
	private int month1;
	private int day1;
	private int month2;
	private int day2;
	private int day_count;
	private int gap;
	private int monthdays[] = {31,28,31,30,31,30,31,31,30,31,30,31}; // 1~12월의 날 수
	
	public FourthDate()
	{
		input();
	}
	
	public void printDate()
	{
		if (month1>12 || month2>12)
			System.out.println("잘못 입력하셨습니다.");
		else if((day1 > monthdays[month1-1])||(day2 > monthdays[month2-1]))
			System.out.println("잘못 입력하셨습니다.");
		else
		{
			gap = CalcDate(month1, day1) - CalcDate(month2, day2);
			if(gap<0)
				gap *= (-1);
			
			System.out.printf("두 날짜의 간격은 %d일입니다.\n", gap);
		}
	}
	
	void input()
	{
		Scanner s = new Scanner(System.in);
		System.out.printf("첫번째 날짜를 입력하시오. (월 일) ");
		month1 = s.nextInt();
		day1 = s.nextInt();
		System.out.printf("두번째 날짜를 입력하시오. (월 일) ");
		month2 = s.nextInt();
		day2 = s.nextInt();
	}
	
	int CalcDate(int month, int day)
	{
		day_count = 0;
		for(int i=0; i<(month-1); i++)
			day_count += monthdays[i];
		
		return (day_count+day);
	}
}
