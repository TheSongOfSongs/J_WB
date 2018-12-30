package workbook.StepF;

import java.util.Scanner;

public class FindScore {
	private double score[] = new double[10]; // 심사점수 리스트
	private double maxscore, minscore; // 가장 큰 점수, 가장 작은 점수
	private double total = 0; // 점수 총 합계
	private double average; // 평균점수
	
	public FindScore()
	{
		Scanner s = new Scanner(System.in);
		for(int i=0; i<score.length; i++)
		{
			System.out.printf((i+1)+"번 심사점수를 입력하시오. ");
			score[i] = s.nextDouble();
		}
	}
	
	double get_average()
	{
		for(int i=0; i<score.length; i++)
		{
			total += score[i];
			if(i==0)
			{
				maxscore = score[i];
				minscore = score[i];
			}
			else if(score[i]>maxscore)
				maxscore = score[i];
			else if(score[i]<minscore)
				minscore = score[i];
		}
		
		return average = (total-maxscore-minscore)/8;
	}
	
	public void printScore()
	{
		System.out.printf("가장 큰 점수와 가장 작은 점수를 제외한 8개의 점수에 대한 평균은 %.1f입니다.\n", get_average());
	}
}
