package workbook.StepH;

import java.util.Scanner;

public class StepHManager {
	public StepHManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. 숫자 알아 맞추기\n");
			printf("2. 로또 번호 만들기\n");
			printf("3. 로또 번호 당첨확인\n");
			printf("4. 가위바위보 게임\n");
			printf("5. 슬롯머신\n");
			printf("6. 5개 숫자의 제곱수 조합\n");
			printf("7. 문자의 개수와 나누어 출력하기\n");
			printf("8. 문자열 바꾸기\n");
			printf("9. 사용자 정보 출력하기\n");
			printf("=>원하는 메뉴는?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
				case 1: 				
					FirstNumber first = new FirstNumber();
					first.user_try();
					break;
				case 2:
					SecondLottery second = new SecondLottery();
					second.printOnemore();
					break;
				case 3:
					ThirdChecking third = new ThirdChecking();
					third.printFind();
					break;
				case 4:
					FourthGame fourth = new FourthGame();
					fourth.printScore();
					break;
				case 5:
					FifthMachine fifth = new FifthMachine();
					fifth.playing();
					break;
				case 6:
					SixthPower sixth = new SixthPower();
					sixth.printResult();
					break;
				case 7:
					SeventhPrint seventh = new SeventhPrint();
					break;
				case 8:
					EighthChange eight = new EighthChange();
					eight.printString();
					break;
				case 9:
					NinethUser nineth = new NinethUser();
					nineth.printString();
					break;
				
			}
		}
	}
	void printf(String s){System.out.print(s);} 
}
