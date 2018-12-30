package workbook.StepC;

import java.util.Scanner;

public class StepCManager {
	public StepCManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. 나이계산\n");
			printf("2. 물의 온도\n");
			printf("3. 직사각형 넓이계산\n");
			printf("4. 아파트 평형 계산\n");
			printf("5. 날짜계산\n");
			printf("6. 점수계산\n");
			printf("7. 파일 용량 계산\n");
			printf("8. 최댓값과 최솟값\n");
			printf("9. 소득세 계산\n");
			printf("10. 사칙연산 계산\n");
			printf("11. 윤년 판정\n");
			printf("=>원하는 메뉴는?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
				case 1: 				
					first_age first = new first_age();
					first.printAge();
					break;
				case 2:
					second_water second = new second_water();
					second.printDegree();
					break;
				case 3:
					third_rectangle third = new third_rectangle();
					third.printRectangle();
					break;
				case 4:
					fourth_Apartment fourth = new fourth_Apartment();
					fourth.printApartment();
					break;
				case 5:
					fifth_days fifth = new fifth_days();
					fifth.printDays();
					break;
				case 6:
					sixth_score sixth = new sixth_score();
					sixth.printScore();
					break;
				case 7:
					seventh_file seventh = new seventh_file();
					seventh.printTime();
					break;
				case 8:
					eighth_max_min eighth = new eighth_max_min();
					eighth.printNums();
				case 9:
					ninth_tax ninth = new ninth_tax();
					ninth.printTax();
				case 10:
					tenth_calculate tenth = new tenth_calculate();
					tenth.printResult();
				case 11:
					eleventh_four eleventh = new eleventh_four();
					eleventh.printFour();
			}
		}
		
	}
	void printf(String s){System.out.print(s);} 
}