package workbook.StepC;

import java.util.Scanner;

public class second_water {
	private double input_degree;
	
	public second_water(){input();}
	
	public void printDegree() {
		if(input_degree<0)
			System.out.printf("잘못입력하셨습니다.\n");
		else if(input_degree<25)
			System.out.printf("냉수입니다.\n");
		else if(input_degree<40)
			System.out.printf("미온수입니다.\n");
		else if(input_degree<80)
			System.out.printf("온수입니다.\n");
		else
			System.out.printf("끓는 물입니다.\n");
	}	
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("물의 온도를 입력하세요 \n");
		this.input_degree = s.nextDouble();
	}		
}