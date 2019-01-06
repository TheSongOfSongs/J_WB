package workbook.StepI;

import java.util.Scanner;

public class FifthFindingMax {
	private int findmax[] = new int[10];
	private int max;
	
	public FifthFindingMax()
	{
		input();
	}
	
	public void printMax()
	{
		System.out.printf("최댓값은 %d입니다.\n", MaxOfTen());
	}
	
	void input()
	{
		Scanner s = new Scanner(System.in);
		
		for(int i=0; i<findmax.length; i++)
		{ 
			System.out.printf("%d번 수를 입력시오. ", (i+1));
			findmax[i] = s.nextInt();
		}
	}
	
	int MaxOfTen()
	{
		max = findmax[0];
		
		for(int i=0; i<findmax.length-1; i++)
			if(max<findmax[i+1])
				max = findmax[i+1];
		
		return max;
	}
}
