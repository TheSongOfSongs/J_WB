package workbook.StepB;

import java.util.Scanner;

public class YourScores {
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double average;
	
	public YourScores() { input();}
	
	void input()
	{
		Scanner s = new Scanner(System.in);
		System.out.printf("국어 점수를 입력하세요");
		this.kor = s.nextInt();
		System.out.printf("수학 점수를 입력하세요");
		this.eng = s.nextInt();
		System.out.printf("영어 점수를 입력하세요");
		this.math = s.nextInt();
	}
	
	public void printTotal()
	{
		System.out.printf("입력하신 총점은 %d 이고,\n평균은 %.1f입니다.\n",getTotal(), getAverage());
		if(kor<90)
			System.out.printf("국어점수가 우수합니다.\n");
		if(math<90)
			System.out.printf("수점수가 우수합니다.\n");
		if(eng<90)
			System.out.printf("영어점수가 우수합니다.\n");
	}
	
	int getTotal()
	{
		total = kor + eng + math;
		return this.total;
	}
	
	double getAverage()
	{
		average = total/3;
		return this.average;
	}

}
