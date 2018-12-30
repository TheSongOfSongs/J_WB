package workbook.StepB;

import java.util.Scanner;

public class DaysToSeconds {
	private int days;
	private int seconds;
	private int m_count;
	
	public DaysToSeconds()
	{
		input();
	}
	
	public void printSeconds()
	{
		System.out.printf("날 수에 해당되는 기간은 모두 " + getSeconds() + "초 입니다.\n");
		if(get_m_count()>0)
			System.out.printf("100만 초가 모두 "+m_count+"번이나 포함됩니다.\n");		
	}
	
	void input()
	{
		Scanner s = new Scanner(System.in);
		System.out.printf("날 수를 입력하세요 ");
		this.days = s.nextInt();
	}
	
	int getSeconds()
	{
		seconds = days*60*60*24;
		return this.seconds;
	}
	
	int get_m_count()
	{
		m_count=seconds/1000000;
		return this.m_count;
	}
}
