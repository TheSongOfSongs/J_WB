package workbook.StepE;

import java.util.Scanner;

public class StepEManager {
	public StepEManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. 정사각형 출력\n");
			printf("2. 직각삼각형 출력\n");
			printf("3. 이등변삼각형 넓이계산\n");
			printf("4. 구구단 출력\n");
			printf("5. 구구단 열의 개수에 맞추어 출력\n");
			printf("6. 이차원 숫자 출력\n");
			printf("=>원하는 메뉴는?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
				case 1: 				
					SharpRect first = new SharpRect();
					first.printRect();
					break;
				case 2: 				
					StarTriang second = new StarTriang();
					second.printTriang();
					break;
				case 3:
					StarTriangle third = new StarTriangle();
					third.printTriangle();
					break;
				case 4:
					PrintMultiple fourth = new PrintMultiple();
					fourth.printMulti();
					break;
				case 5:
					OrderedMulti fifth = new OrderedMulti();
					fifth.printOrdered();
					break;
				case 6:
					RowNColumn sixth = new RowNColumn();
					sixth.printRNC();
					break;
			}
		}
		
	}
	void printf(String s){System.out.print(s);} 
}