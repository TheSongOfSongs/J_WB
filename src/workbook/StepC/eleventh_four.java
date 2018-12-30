package workbook.StepC;

import java.util.Scanner;

public class eleventh_four {
	private int year;
	
	public eleventh_four(){input();}
	
	void input()
	{
		Scanner s = new Scanner(System.in);
		System.out.printf("연도를 입력하세요 ");
		this.year = s.nextInt();
	}
	
	public void printFour()
	{
		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
					System.out.printf("입력하신 연도는 윤년입니다.\n");
				else
					System.out.printf("입력하신 연도는 윤년이 아닙니다.\n");
			}
			else
				System.out.printf("입력하신 연도는 윤년입니다.\n");
		}
		else
			System.out.printf("입력하신 연도는 윤년이 아닙니다.\n");
	}
	

}
