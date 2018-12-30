package workbook.StepC;

import java.util.Scanner;

public class first_age {
	private int birth_year;
	private int age;
	
	public first_age(){input();}
	public void printAge() {
		age = getAge();
		if(age<7)
			System.out.printf("유아입니다.\n");
		else if(age<13)
			System.out.printf("어린이입니다.\n");
		else if(age<20)
			System.out.printf("청소년입니다.\n");
		else if(age<30)
			System.out.printf("청년입니다.\n");
		else if(age<60)
			System.out.printf("중년입니다.\n");
		else
			System.out.printf("노년입니다.\n");
	}	
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("태어난 년도를 입력하세요 ");
		this.birth_year = s.nextInt();
	}	
	
	int getAge() {
		age = 2018 - birth_year + 1;
		return this.age;
	}	
}