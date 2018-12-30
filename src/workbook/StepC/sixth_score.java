package workbook.StepC;

import java.util.Scanner;

public class sixth_score {
	private int kor, eng, math;
	private int total;
	private double average;
	
	public sixth_score(){input();}
	
	public void printScore() {
		System.out.printf("입력하신 총점은 %d 이고,\n", getTotal());
		System.out.printf("평균은 %.1f 입니다.\n", getAverage());
		
		if(average>90)
			System.out.printf("수 입니다.\n");
		else if(average>80)
			System.out.printf("우 입니다.\n");
		else if(average>70)
			System.out.printf("미 입니다.\n");
		else if(average>60)
			System.out.printf("양 입니다.\n");
		else
			System.out.printf("가 입니다.\n");
	}	
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("국어 점수를 입력하세요");
		this.kor = s.nextInt();
		System.out.printf("수학 점수를 입력하세요");
		this.eng = s.nextInt();
		System.out.printf("영어 점수를 입력하세요");
		this.math = s.nextInt();
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