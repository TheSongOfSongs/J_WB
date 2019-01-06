package workbook.StepJ;

import java.util.Scanner;

public class StepJManager {
	public StepJManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. 나이 계산 및 연령대 판정\n");
			printf("2. 심사점수 계산\n");
			printf("3. 물의 온도 구간\n");
			printf("4. 연중 날짜 계산\n");
			printf("5. 주차 관리 시스템\n");
			printf("6. 피보나치 수열\n");
			printf("7. 2의 제곱수 구하기\n");
			printf("8. Ackermann 수 구하기\n");
			printf("9. pow() 메소드 만들기\n");
			printf("10. 황금 비율 찾기\n");
			printf("=>원하는 메뉴는?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
				case 1: 				
					FirstAge first = new FirstAge();
					first.printGroup();
					break;
				case 2: 				
					SecondScore second = new SecondScore();
					second.printAverage();
					break;
				case 3: 				
					ThirdWater third = new ThirdWater();
					third.printDegree();
					break;
				case 4: 				
					FourthDate fourth = new FourthDate();
					fourth.printDate();
					break;
				case 5: 				
					FifthParking fifth = new FifthParking();
					fifth.printSystem();
					break;
				case 6: 				
					SixthFibonacci sixth = new SixthFibonacci();
					sixth.printFibo();
					break;
				case 7: 				
					SeventhPower seventh = new SeventhPower();
					break;
				case 8: 				
					EighthAckermann eighth = new EighthAckermann();
					eighth.printFunction();
					break;
				case 9: 				
					NinethPow nineth = new NinethPow();
					nineth.printPow();
					break;
				case 10: 				
					TenthGolden tenth = new TenthGolden();
					break;
			}
		}
	}
	void printf(String s){System.out.print(s);} 
}
