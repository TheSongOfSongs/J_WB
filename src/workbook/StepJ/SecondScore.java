package workbook.StepJ;

import java.util.Scanner;

public class SecondScore {
	private double maxscore, minscore; // 가장 큰 점수, 가장 작은 점수
	private double average; // 평균점수
	
	public SecondScore()
	{
		input();
	}
	
	public void printAverage()
	{
		System.out.printf("가장 큰 점수와 가장 작은 점수를 제외한 8개의 점수에 대한 평균은 %.1f 입니다.\n", average);
	}
	
	void input()
	{
		double score[] = new double[10]; // 심사점수 리스트
		
		Scanner s = new Scanner(System.in);
		for(int i=0; i<score.length; i++)
		{
			System.out.printf((i+1)+"번 심사점수를 입력하시오. ");
			score[i] = s.nextDouble();
		}
		
		get_average(score);
	}
	
	void get_average(double num[])
	{
		double sum = 0;
		
		for (int i=0; i<num.length; i++)
			sum += num[i];
		
		sum = sum - Min(num) - Max(num);
		average  = sum / (num.length-2);	
	}
	
	double Min(double num[])
	{
		for(int i=0; i<num.length; i++)
			if(i==0)
				minscore = num[i];
			else if(num[i]<minscore)
				minscore = num[i];
		
		return minscore;
	}
	
	double Max(double num[])
	{
		for(int i=0; i<num.length; i++)
			if(i==0)
				maxscore = num[i];
			else if(num[i]>maxscore)
				maxscore = num[i];
		
		return maxscore;
	}
	
	

}
