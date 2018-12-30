package workbook.StepA;

import java.util.Scanner;

public class YourScoreIs {
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double average;
	
	public YourScoreIs() { input();}
	
	void input()
	{
		Scanner a = new Scanner(System.in);
		Scanner b = new Scanner(System.in);
		Scanner c = new Scanner(System.in);
		System.out.printf("국어 점수를 입력하세요");
		this.kor = a.nextInt();
		System.out.printf("수학 점수를 입력하세요");
		this.eng = b.nextInt();
		System.out.printf("영어 점수를 입력하세요");
		this.math = c.nextInt();
	}
	
	public void printTotal()
	{
		System.out.printf("입력하신 총점은 %d 이고,\n평균은 %.1f입니다.",getTotal(), getAverage());
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
