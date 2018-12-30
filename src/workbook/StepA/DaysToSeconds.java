package workbook.StepA;

import java.util.Scanner;

public class DaysToSeconds {
	private int days;
	private int seconds;
	
	public DaysToSeconds()
	{
		input();
	}
	
	public void printSeconds()
	{
		System.out.printf("날 수에 해당하는 시간은 모두 " + getSeconds() + "초 입니다.");
	}
	
	void input()
	{
		Scanner s = new Scanner(System.in);
		System.out.printf("날 수를 입력하세요.");
		this.days = s.nextInt();
	}
	
	int getSeconds()
	{
		seconds = days*60*60*24;
		return this.seconds;
	}
}
