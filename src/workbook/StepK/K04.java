package workbook.StepK;

import java.util.Scanner;

public class K04 {
	private int location[] = {0, 0, 0, 0};
	private int number;
	
	public K04()
	{
		Scanner s = new Scanner(System.in);
		
		System.out.printf("몇 개의 좌표를 입력하겠습니까? ");
		number = s.nextInt();
		
		Point num[] = new Point[number];
		
		for(int i=0; i<number; i++)
		{
			num[i] = new Point();
			num[i].input(i);
		}
	
		System.out.printf("=======================================\n");
		
		for(int i=0; i<number; i++)
			location[num[i].output(i)-1]++;
		
		for(int i=0; i<location.length; i++)
			System.out.printf("%d사분면의 좌표는 모두 %d개입니다.\n", (i+1), location[i]);


	}

}
