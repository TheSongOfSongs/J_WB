package workbook.StepF;

import java.util.Scanner;

public class FindSecondSubject {
	private int jumsu[][] = new int[5][3]; // 5명의 3과목 점수를 저장하고 있는 중복 리스트
	private int sum[] = new int[5]; // 각 학생의 총점 리스
	private double average[] = new double[5]; // 각 학생의 평균 리스트
	private int kor, eng, mat; // 3과목 점수 입력을 위한 변수
	
	public FindSecondSubject()
	{
		Scanner s = new Scanner(System.in);
		for(int i=0; i<jumsu.length; i++)
		{
			System.out.printf((i+1)+"번 학생 국어, 영어, 수학 점수를 입력하시오. ");
			
			kor = s.nextInt();
			eng = s.nextInt();
			mat = s.nextInt();
			
			jumsu[i][0] = kor;
			jumsu[i][1] = eng;
			jumsu[i][2] = mat;
		}
	}
	
	void getaverage()
	{
		for(int i=0; i<jumsu[0].length; i++)
			for(int j=0; j<jumsu.length; j++)
				sum[j] += jumsu[j][i];
		for(int i=0; i<jumsu.length; i++)
			average[i] = (double)sum[i]/3;
	}

	public void printScore()
	{
		getaverage();
		for(int i=0; i<jumsu.length; i++)
			System.out.printf("%d번 학생의 총점은 %d이고, 평균은 %.1f 입니다.\n", (i+1), sum[i], average[i]);
	}
}
