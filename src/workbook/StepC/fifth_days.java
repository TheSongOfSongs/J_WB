package workbook.StepC;

import java.util.Scanner;

public class fifth_days {
	private int month, day;
	private int day_count;
	
	public fifth_days(){input();}
	public void printDays() {
		if(month<0 || month>12)
			System.out.printf("잘못 입력하셨습니다.\n");
		else if(((month==1)||(month==3)||(month==5)||(month==7)||(month==8)||(month==10)||(month==12)) && day>31)
			System.out.printf("잘못 입력하셨습니다.\n");
		else if(month==2 && day>28)
			System.out.printf("잘못 입력하셨습니다.\n");
		else if(((month==4)||(month==6)||(month==9)||(month==11)) && day>30)
			System.out.printf("잘못 입력하셨습니다.\n");
		else
			System.out.printf("이 날짜는 1년 중 "+get_count()+" 번째 날에 해당됩니다.\n");
	}	
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("월을 입력하시오. ");
		this.month = s.nextInt();
		System.out.printf("일을 입력하시오. ");
		this.day = s.nextInt();
	}	
	
	int get_count() {
		if(month==1)
			day_count = day;
		else if(month==2)
			day_count = 31+day;
		else if(month==3)
			day_count = 31+28+day;
		else if(month==4)
			day_count = 31+28+31+day;
		else if(month==5)
			day_count = 31+28+31+30+day;
		else if(month==6)
			day_count = 31+28+31+30+31+day;
		else if(month==7)
			day_count = 31+28+31+30+31+30+day;
		else if(month==8)
			day_count = 31+28+31+30+31+30+31+day;	
		else if(month==9)
			day_count = 31+28+31+30+31+30+31+31+day;	
		else if(month==10)
			day_count = 31+28+31+30+31+30+31+31+30+day;
		else if(month==11)
			day_count = 31+28+31+30+31+30+31+31+30+31+day;
		else
			day_count = 31+28+31+30+31+30+31+31+30+31+30+day;
		return day_count;
	}	
}