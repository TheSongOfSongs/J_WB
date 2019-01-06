package workbook.StepI;

import java.util.Scanner;

public class StepIManager {
	public StepIManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. 메뉴판\n");
			printf("2. 원하는 문자로 삼각형\n");
			printf("3. 비만도 판정\n");
			printf("4. 메뉴판(2)\n");
			printf("5. 최댓값 찾기\n");
			printf("6. 임의의 수를 만들어 리턴\n");
			printf("7. 자판기 가격\n");
			printf("=>원하는 메뉴는?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
				case 1: 				
					FirstMenu first = new FirstMenu();
					first.ShowMenu();
					break;
				case 2: 				
					SecondTriangle second = new SecondTriangle();
					break;
				case 3:
					ThirdCheckBMI third = new ThirdCheckBMI();
					break;
				case 4:
					FourthMenu fourth = new FourthMenu();
					fourth.pirntPrice();
					break;
				case 5:
					FifthFindingMax fifth = new FifthFindingMax();
					fifth.printMax();
					break;
				case 6:
					SixthRandom sixth = new SixthRandom();
					sixth.printResult();
					break;
				case 7:
					SeventhDrink seventh = new SeventhDrink();
					seventh.printOrder();
					break;
				
			}
		}
	}
	void printf(String s){System.out.print(s);} 
}
