package workbook.StepF;

import java.util.Scanner;

public class InputDate {
	private int monthdays[] = {31,28,31,30,31,30,31,31,30,31,30,31}; // 1~12월의 날 수
	private int month, day;	// 입력받은 월, 일
	private int day_count = 0;	// 1년 중 날 수

	public InputDate()
	{
		Scanner s = new Scanner(System.in);
		System.out.printf("월을 입력하시오. ");
		month = s.nextInt();
		System.out.printf("일을 입력하시오. ");
		day = s.nextInt();
	}
	
	public void printDate()
	{
		if (month>12)
			System.out.println("잘못 입력하셨습니다.");
		else if(day > monthdays[month-1])
			System.out.println("잘못 입력하셨습니다.");
		else
			System.out.printf("이 날짜는 1년 중 "+get_date()+"번째 날에 해당됩니다.\n");
	}
	
	int get_date()
	{
		for(int i=0; i<(month-1); i++)
			day_count += monthdays[i];
		
		return (day_count+day);
	}

}
