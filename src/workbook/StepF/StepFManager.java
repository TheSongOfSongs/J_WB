package workbook.StepF;

import java.util.Scanner;

public class StepFManager {
	public StepFManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. 두 번째로 큰 수 출력\n");
			printf("2. 심사점수 계산\n");
			printf("3. 국, 영, 수 총점과 평균\n");
			printf("4. 국, 영, 수 총점과 평균(2)\n");
			printf("5. 비만 판정\n");
			printf("6. 5층 아파트의 거주자 숫자\n");
			printf("7. 5층 아파트의 거주자 숫자(2)\n");
			printf("8. 겹치지 않는 수자 10개 입력\n");
			printf("9. 배열을 이용한 연중 날짜 계산\n");
			printf("=>원하는 메뉴는?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
				case 1: 				
					FindSecond first = new FindSecond();
					first.printFind();
					break;
				case 2:
					FindScore second = new FindScore();
					second.printScore();
					break;
				case 3:
					FindSubject third = new FindSubject();
					third.printScore();
					break;
				case 4:
					FindSecondSubject fourth = new FindSecondSubject();
					fourth.printScore();
					break;
				case 5:
					CheckBMI fifth = new CheckBMI();
					fifth.printCount();
					break;
				case 6:
					PeopleApartment sixth = new PeopleApartment();
					sixth.printPeople();
					break;
				case 7:
					FloorApartment seventh = new FloorApartment();
					seventh.printPeople();
					break;
				case 8:
					InputNumber eighth = new InputNumber();
					eighth.printNum();
					break;
				case 9:
					InputDate ninth = new InputDate();
					ninth.printDate();
			}
		}
		
	}
	void printf(String s){System.out.print(s);} 
}