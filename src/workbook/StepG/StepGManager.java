package workbook.StepG;

import java.util.Scanner;

public class StepGManager {
	public StepGManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. 나이 계산 및 연령대 판정\n");
			printf("2. 물의 온도 구간 판정\n");
			printf("3. 점수 계산\n");
			printf("4. 부동산 중개 수수\n");
			printf("5. PC방 이용료\n");
			printf("6. 쇼핑몰 매출 계산기\n");
			printf("7. 놀이공원 매표소\n");
			printf("=>원하는 메뉴는?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
				case 1: 				
					FirstAge first = new FirstAge();
					first.printFirst();
					break;
				case 2:
					SecondWater second = new SecondWater();
					second.printWater();
					break;
				case 3:
					ThirdScore third = new ThirdScore();
					third.printScore();
					break;
				case 4:
					FourthCommission fourth = new FourthCommission();
					fourth.printCommision();
					break;
				case 5:
					FifthPC fifth = new FifthPC();
					fifth.printCharge();
					break;
				case 6:
					SixthShopping sixth = new SixthShopping();
					sixth.printSale();
					break;
				case 7:
					SeventhTicket seventh = new SeventhTicket();
					seventh.printTotal();
					break;
					
					
			}
		}
	}
	void printf(String s){System.out.print(s);} 
}
