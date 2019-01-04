package workbook.StepG;

import java.util.Scanner;

public class ThirdScore {
	private int jumsu[][]=new int[5][3];
	private int c_average[] = new int[3];
	private String class_name[] = {"국어", "영어", "수학"} ;
	private int kor, eng, mat;
	private int sum;
	private double average;
	private String grade;
	
	public ThirdScore()
	{
		input();
	}
	
	public void printScore()
	{
		System.out.println("1) 각 과목별 총점과 평균 점수");
		for(int i=0; i<c_average.length; i++)
			System.out.printf("%s 과목 총점은 %d 평균은 %.1f입니다.\n", class_name[i], c_average[i], get_average(c_average[i]));
		
		System.out.println("2) 각 학생별 총점과 평균 점수");
		for(int i=0; i<jumsu.length; i++)
		{
			sum=0;
			for(int j=0; j<jumsu[i].length; j++)
				sum += jumsu[i][j];
			
			average = sum/class_name.length;
			
			if(average>=90)
				grade = "A";
			else if(average>=80)
				grade = "B";
			else if(average>=70)
				grade = "C";
			else if(average>=60)
				grade = "D";
			else
				grade = "F";
			
			System.out.println((i+1)+"번 학생 점수 : 총점 "+ sum +  ", 평균 " + average + ", 등급 "+ grade);
		}
	}
	
	void input()
	{
		Scanner s = new Scanner(System.in);
		
		for(int i=0; i<jumsu.length; i++)
		{
			System.out.printf((i+1)+"번 학생의 국어, 영어, 수학 점수는? ");
			
			for(int j=0; j<jumsu[i].length; j++)
			{
				jumsu[i][j] = s.nextInt();
				c_average[j] += jumsu[i][j]; //1번 조건 총점 구하기
			}
		}
	}
	
	double get_average(int c_average) //1번 조건 평균 구하기
	{
		return (double)c_average/jumsu.length;
	}
	
}
