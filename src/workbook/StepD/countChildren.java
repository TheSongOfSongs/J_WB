package workbook.StepD;

import java.util.Scanner;

public class countChildren {
	private int count_all; // 가족 인원수
	private int count_young; // 미성년자의 수
	private int birth_year; // 태어난 년도
	private int age; // 나이
	private int i; // 반복문을 위한 변수
	
	public countChildren(){input();}
	
	public void printFourth()
	{
		System.out.printf("가족들 중에 미성년자는 모두 %d명입니다.\n", get_count_young());
	}
	
	void input()
	{
		Scanner s = new Scanner(System.in);
		System.out.printf("가족이 몇 명인지 입력하세요 ");
		this.count_all = s.nextInt();
	}
	
	int get_count_young()
	{
		Scanner s = new Scanner(System.in);
		
		for(i=0; i<count_all;i++)
		{
			System.out.printf("태어난 연도를 입력하세요 ");
			this.birth_year = s.nextInt();
			if(get_age()<20)
				count_young++;
		}
		return this.count_young;
	}
	
	int get_age()
	{
		age = 2018-birth_year+1;
		return this.age;
	}
}
