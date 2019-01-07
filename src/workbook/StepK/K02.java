package workbook.StepK;

import java.util.Scanner;

public class K02 {
	private int number;
	
	public K02()
	{
		Scanner s = new Scanner(System.in);
		System.out.printf("등록하실 메뉴의 개수를 입력하세요 : ");
		number = s.nextInt();
		
		MenuPan user[] = new MenuPan[number];
		
		for(int i=0; i<number; i++)
		{
			user[i] = new MenuPan();
			System.out.printf((i+1)+"번 ");
			user[i].input();
		}
			
		System.out.printf("=======================================\n");
		System.out.printf("메뉴번호\t메뉴이름\t원산지\t1인분가격\n");
		
		for(int i=0; i<number; i++)
		{
			user[i].output();
		}
	}

}