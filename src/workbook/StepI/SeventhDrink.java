package workbook.StepI;

import java.util.Scanner;

public class SeventhDrink {
	private int drink;
	private String onemore;
	private int price[] = {700, 300, 1000, 500, 600};
	private int total = 0;
	
	public void printOrder()
	{
		Scanner s = new Scanner(System.in);
		int i=0;
		while(true)
		{
			i++;
			total += price[SelectCan()-1];
			
			System.out.printf("더 필요하십니까?(Y/N) ");
			onemore = s.next();
			
			if(onemore.equalsIgnoreCase("N"))
				break;
		}
		System.out.printf("%d개의 음료를 선택하여 총 %d원입니다.\n", i, total);
	}
	
	int SelectCan()
	{
		Scanner s = new Scanner(System.in);
		
		System.out.printf("1.콜라(700원) 2.원두커피(300원) 3.레몬주스(1000원) 4.홍차(500원) 5.코코아(600원)\n메뉴를 선택해주세요 : ");
		drink = s.nextInt();
		
		return drink;
	}

}
