package workbook.StepF;

import java.util.Scanner;

public class CheckBMI {
	private int height, weight; // 입력받은 신장(cm), 체중(kg)
	private int bmilist[][] = new int[10][3]; // 10명에 대한 신장, 체중, 비만도수치를 담고 있는 리스트
	private int count; // 비만인 사람의 숫자
		
	public CheckBMI()
	{
		Scanner s = new Scanner(System.in);
		for(int i=0; i<bmilist.length; i++)
		{
			System.out.printf("%d번째 사람의 신장(cm)과 체중(kg)을 입력하시오. ",(i+1));
			height = s.nextInt();
			weight = s.nextInt();
			
			fillBlank(i);
		}
	}
	
	public void printCount()
	{
		System.out.printf("\n총 %d명의 사람이 비만입니다.\n", returnCount());
	}
	
	void fillBlank(int i)
	{
		bmilist[i][0] = height;
		bmilist[i][1] = weight;
		bmilist[i][2] = (int)(weight/(height*height*0.01*0.01));
	}
	
	int returnCount()
	{
		for(int i=0; i<bmilist.length; i++)
		{
			if(bmilist[i][2]>=25)
			{
				System.out.printf("%d번째 사람은 비만입니다.\n", (i+1));
				count++;
			}
		}
		return count;
	}
}
