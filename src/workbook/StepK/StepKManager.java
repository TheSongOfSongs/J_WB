package workbook.StepK;

import java.util.Scanner;

public class StepKManager {
	public StepKManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. 메뉴판 저장(1)\n");
			printf("2. 메뉴판 저장(2)\n");
			printf("3. 좌표 저장(1)\n");
			printf("4. 좌표 저장(2)\n");
			printf("5. 사용자 목록 저장(1)\n");
			printf("6. 사용자 목록 저장(2)\n");
			printf("7. 학생 점수 결과 저장\n");
			printf("=>원하는 메뉴는?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
				case 1: 				
					K01 first = new K01();
					break;
				case 2: 				
					K02 second = new K02();
					break;
				case 3: 				
					K03 third = new K03();
					break;
				case 4: 				
					K04 fourth = new K04();
					break;
				case 5:
					K05 fifth = new K05();
					break;
				case 6:
					K06 sixth = new K06();
					break;
				case 7:
					K07 seventh = new K07();
					break;
			}
		}
	}
	void printf(String s){System.out.print(s);} 
}
