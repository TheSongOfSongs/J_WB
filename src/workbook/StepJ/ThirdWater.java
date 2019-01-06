package workbook.StepJ;

import java.util.Scanner;

public class ThirdWater {
	private int input_degree; // 입력받은 온도
	private double degrees[] = new double[10]; // 온도 리스트 
	private String degree_name[] = {"냉수", "미온수", "온수", "끓는물"};
	private int[] count = {0,0,0,0}; 
	private byte sel;

	public ThirdWater()
	{
		input();
	}
	
	public void printDegree()
	{
		for(int i=0; i<degrees.length; i++)
		{
			System.out.printf("%d번 물의 온도는 %.1f도 입니다.\n", (i+1), degrees[i]);
			count[AskWater(degrees[i])]++;
		}
			
		for(int i=0; i<degree_name.length; i++)
			System.out.println(degree_name[i]+" 입력 횟수는 "+count[i]+" 입니다.");

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
	
	byte AskWater(double degree)
	{
		
		if(degree>0 && degree<25)
			sel = 0;
		else if(degree<40)
			sel = 1;
		else if(degree<80)
			sel = 2;
		else if(degree<100)
			sel = 3;
		
		return sel;
	}
	
}
