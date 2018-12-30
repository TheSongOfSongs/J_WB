package workbook.StepF;

import java.util.Scanner;

public class FloorApartment {
	private int number[][] = new int[5][3]; // 각 집의 거주자 수, 층별, 호수별 중복 리스트 
	private int floor_total[] = new int[5]; // 층별 거주자 합계 리스트 (1층, 2층, 3층, 4층, 5층)
	private int line_total[] = new int[3]; // 호수별 거주자 합계 리스트 (1호라인, 2호라인, 3호라인)
	private int newnum; // 입력받은 숫자
	private int total; // 아파트의 총 거주자 수
	private int ho; // 아파트 호를 나타내는 변수
	
	
	public FloorApartment()
	{
		Scanner s = new Scanner(System.in);
		
		for(int i=0; i<number.length; i++)
		{
			for(int j=0; j<number[i].length; j++)
			{
				ho = 100*(i+1)+j+1;
				System.out.printf( ho + "호에 살고 있는 사람의 숫자를 입력하시오. " );
				newnum = s.nextInt();
				number[i][j] = newnum;
			}
		}
	}
	
	public void printPeople()
	{
		fill_floor();
		System.out.println();
		fill_line();
		System.out.println();
		System.out.printf("이 아파트에 사는 거주자는 모두 %d명 입니다.\n", get_total());
	}
	
	int get_total()
	{
		total = 0;
		for(int i=0; i<number.length; i++)
			for(int j=0; j<number[i].length; j++)
				total += number[i][j];
		return total;
	}
	
	void fill_line()
	{
		for(int i=0; i<number[0].length; i++) 
		{
			for(int j=0; j<number.length; j++)
				line_total[i] += number[j][i];
			System.out.printf((i+1) + "호 라인 사는 거주자는 모두 " + line_total[i] + "명 입니다.\n");
		}
	}
	
	void fill_floor()
	{
		for(int i=0; i<number.length; i++)
		{
			for(int j=0; j<number[i].length; j++)
				floor_total[i] += number[i][j];
			System.out.printf((i+1) + "층에 사는 거주자는 모두 " + floor_total[i] + "명 입니다.\n");
		}
	}
	

}
