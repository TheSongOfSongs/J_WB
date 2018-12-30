package workbook.StepF;

import java.util.Scanner;

public class PeopleApartment {
	private int number[][] = new int[5][3]; // 각 집의 거주자 수, 층별, 호수별 중복 리스트 
	private int newnum; // 입력받은 숫자
	private int total; // 아파트의 총 거주자 수
	private int ho; // 아파트 호를 나타내는 변수
	
	public PeopleApartment()
	{
		Scanner s = new Scanner(System.in);
		
		for(int i=0; i<number.length; i++)
			for(int j=0; j<number[i].length; j++)
			{
				System.out.printf( get_ho(i, j) + "호에 살고 있는 사람의 숫자를 입력하시오. " );
				newnum = s.nextInt();
				number[i][j] = newnum;
			}
	}
	
	public void printPeople()
	{
		System.out.printf("이 아파트에 사는 거주자는 모두 %d명 입니다.\n", get_total());
	}
	
	int get_total()
	{
		for(int i=0; i<number.length; i++)
			for(int j=0; j<number[i].length; j++)
				total += number[i][j];
		
		return total;
	}
	
	int get_ho(int i, int j)
	{
		ho = 100*(i+1)+(j+1);
		return ho;
	}

}
