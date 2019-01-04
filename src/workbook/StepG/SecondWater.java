package workbook.StepG;

import java.util.Scanner;

public class SecondWater {
	private int input_degree; // 입력받은 온도
	private double degrees[] = new double[10]; // 온도 리스트 
	private String degree_name[] = {"냉수", "미온수", "온수", "끓는물"};
	private int[] count = {0,0,0,0}; 
	private int sel;
	
	public SecondWater()
	{
		input();
	}
	
	public void printWater()
	{
		for(int i=0; i<degrees.length; i++)
			System.out.println((i+1)+"번 물의 온도는 "+degrees[i]+"입니다. " + degree_name[get_count(degrees[i])]);
		for(int i=0; i<degree_name.length; i++)
			System.out.println(degree_name[i]+" 입력 횟수 : "+count[i]);
	}
	
	void input()
	{
		Scanner s = new Scanner(System.in);
		
		for(int i=0; i<degrees.length; i++)
		{
			System.out.printf((i+1)+"번 물의 온도를 입력하시오. ");
			degrees[i] = s.nextDouble();
		}
	}
	
	int get_count(double deg)
	{
		if(deg>0 && deg<25)
			sel = 0;
		else if(deg<40)
			sel = 1;
		else if(deg<80)
			sel = 2;
		else if(deg<100)
			sel = 3;
		
		count[sel]++;
		
		return sel;
	}
	
	
}
