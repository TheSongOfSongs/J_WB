package workbook.StepK;

import java.util.Scanner;

public class K07 {
	private int user_num;
	
	public K07()
	{
		Scanner s = new Scanner(System.in);
		
		System.out.printf("등록할 학생의 명수는?  ");
		user_num = s.nextInt();
		
		Student user[] = new Student[user_num];
		
		for(int i=0; i<user_num; i++)
		{
			user[i] = new Student();
			System.out.printf("%d번 ", (i+1));
			user[i].input();
		}
		
		System.out.printf("=======================================\n");
		System.out.printf("등록된 %d명의 학생 목록은 다음과 같습니다.\n", user_num);
		System.out.printf("=======================================\n");
		System.out.printf("번호\t국어\t영어\t수학\t총점\t평균\t학점\n");
		
		for(int i=0; i<user_num; i++)
			user[i].print(i);
	}

}

class Student
{
	private int score[] = {0, 0, 0, 0};
	private double average;
	private String grade;
	
	void input()
	{
		Scanner s = new Scanner(System.in);	
		
		System.out.printf("학생의 국어, 영어, 수학점수를 입력하시오 --> ");
		for(int i=0; i<score.length -1; i++)
			score[i] = s.nextInt();
		
		get_others();
	}

	void print(int index)
	{
		System.out.printf("%d\t", (1+index));
		for(int i=0; i<score.length; i++)
			System.out.printf("%d\t", score[i]);
		System.out.printf("%.1f\t%s\n", average, grade);
	}
	
	void get_others()
	{
		for(int i=0; i<3; i++)
			score[3] += score[i];
		
		average = (double)score[3]/3;
		
		if(average>=95)
			grade = "A+";
		else if(average>=90)
			grade = "A";
		else if(average>=85)
			grade = "B+";
		else if(average>=80)
			grade = "B";
		else if(average>=75)
			grade = "C+";
		else if(average>=70)
			grade = "C";
		else if(average>=65)
			grade = "D+";
		else if(average>=60)
			grade = "D";
	}

}
