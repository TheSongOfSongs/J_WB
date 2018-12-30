package workbook.StepB;

import java.util.Scanner;

public class YearToAge {
	private int age;
	private int birth_year;
	
	public YearToAge(){input();}
	public void printAge() {
		if(getAge()<20)
			System.out.printf("미성년자입니다.\n");
		else
			System.out.printf("미성년자가 아닙니다.\n");
	}	
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("태어난 연도를 입력하세요. ");
		this.birth_year = s.nextInt();
	}	
	
	int getAge() {
		age = 2018 - birth_year + 1;
		return this.age;
	}	

}
