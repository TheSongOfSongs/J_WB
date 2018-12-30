package workbook.StepD;

import java.util.Scanner;

public class StepDManager {
	public StepDManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. 1부터 숫자 더하기 \n");
			printf("2. 가장 큰 수와 작은 수 구하기\n");
			printf("3. 총합계와 평균 구하기\n");
			printf("4. 미성년자 숫자 세기\n");
			printf("5. 직사각형 형태 개수 세기\n");
			printf("6. 아파트 평형 계산 및 종류 판정\n");
			printf("7. 1차 메소드의 좌표 구하기\n");
			printf("8. 2차 메소드의 좌표 구하\n");
			printf("9. 원하는 구구단의 단 출력하기\n");
			printf("10. 배타적 배수 출력하기\n");
			printf("=>원하는 메뉴는?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
				case 1: 
					AddFromOne afo = new AddFromOne();
					afo.printFirst();
					break;
				case 2: 
					FindMaxMin fmm = new FindMaxMin();
					fmm.printMaxmin();
					break;
				case 3:
					TotalSum ts = new TotalSum();
					ts.printThird();
					break;
				case 4:
					countChildren cc = new countChildren();
					cc.printFourth();
					break;
				case 5:
					countRect cr = new countRect();
					cr.printFifth();
					break;
				case 6:
					countApartment ca = new countApartment();
					ca.printArea();
					break;
				case 7:
					whereXY xy = new whereXY();
					xy.printXY();
					break;
				case 8:
					WhereXY2 xys= new WhereXY2();
					xys.printXY();
					break;
				case 9:
					Multiplication multi = new Multiplication();
					multi.printDan();
					break;
				case 10:
					MultipleNumber multinum = new MultipleNumber();
					multinum.printMulti();
					break;
					
			}
		}
		
	}
	void printf(String s){System.out.print(s);} 
}