package workbook.StepH;

import java.util.Scanner;

public class EighthChange {
	private String input; // 입력받는 문자열
	private String findStr; // 찾을 문자열
	private String replaceStr; // 바꾸고자 하는 문자열
	
	public EighthChange()
	{
		input();
	}
	
	public void printString()
	{
		System.out.printf("=> 총 %d번 바뀌었습니다.\n", count());
		
		input = input.replace(findStr, replaceStr);
		
		System.out.printf("=> %s\n", input);
		
		System.out.printf("\n\n\n");
		input();
	}
	
	void input()
	{
		Scanner s = new Scanner(System.in);
		
		System.out.printf("============================\n");
		System.out.printf("=> 문자열을 입력하세요 (x: 종료) : ");
		
		input = s.nextLine();
		
		if(input.equals("x"))
			System.out.printf("* 종료되었습니다.\n");
		
		else
		{
			System.out.printf("=> 찾을 문자열을 입력하세요 : ");
			findStr = s.nextLine();
			
			System.out.printf("=> 바꿀 문자열을 입력하세요 : ");
			replaceStr = s.nextLine();
		}
	}
	
	int count()
	{
		int counts = 0;
		int index = 0;
		
		while(index != -1)
		{
			index = input.indexOf(findStr, index);
			if(index != -1)
			{
				counts++;
				index++;
			}
		}
		
		return counts;
	}

}
