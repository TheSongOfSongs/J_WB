package workbook.StepA;

import java.util.Scanner;

public class YearToAge {
	private int birth_year;
	private int age;
	
	public YearToAge(){input();}
	public void printAge() {
		System.out.printf("당신의 나이는 %d입니다.\n", getAge());
	}	
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("태어난 년도는?");
		this.birth_year = s.nextInt();
	}	
	int getAge() {
		age = 2018 - birth_year + 1;
		return this.age;
	}	
}