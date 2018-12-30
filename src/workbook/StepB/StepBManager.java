package workbook.StepB;

import java.util.Scanner;

public class StepBManager {
	public StepBManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. 미성년자 \n");
			printf("2. 온도변환\n");
			printf("3. 직사각형 넓이계산\n");
			printf("4. 아파트 평형 계산\n");
			printf("5. 날짜계산\n");
			printf("6. 점수계산\n");
			printf("7. 파일 용량 계산\n");
			printf("8. 다양한 조건 판정\n");
			printf("9. 비만 판정\n");
			printf("=>원하는 메뉴는?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
				case 1: 				
					YearToAge yta = new YearToAge();
					yta.printAge();
					break;
				case 2:
					CelsiusToFahrenheit ctf = new CelsiusToFahrenheit();
					ctf.printFahrenheit();	
					break;
				case 3:
					CalculateArea ca = new CalculateArea();
					ca.printArea();
					break;
				case 4:
					ApartmentAreas aa = new ApartmentAreas();
					aa.printArea();
					break;
				case 5:
					DaysToSeconds dts = new DaysToSeconds();
					dts.printSeconds();
					break;
				case 6:
					YourScores ysi = new YourScores();
					ysi.printTotal();
					break;
				case 7:
					FileTransfer gto = new FileTransfer();
					gto.printOther();
					break;
				case 8:
					PrintNumbers pn = new PrintNumbers();
					pn.printNums();
					break;
				case 9:
					CheckBMI bmi = new CheckBMI();
					bmi.checkyours();
			}
		}
		
	}
	void printf(String s){System.out.print(s);} 
}