package workbook.StepH;

import java.util.Scanner;

public class NinethUser {
	private String input; // 입력받는 문자열(사람들 간은 ### 로 구분, 이름과 성별은 |로 구분)
	private String userList[]; // 사용자 리스트
	private String userInfo[]; // 한 사람의 정보
	
	public NinethUser()
	{
		input();
	}
	
	public void printString()
	{
		get_information();
		System.out.printf("=> 총 %d명이 등록되었습니다.\n", userList.length);
		for(int i=0; i<userList.length; i++)
			System.out.printf("%d %s %s\n", (i+1), userList[i], userInfo[i]);
		
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
	}
	
	void get_information()
	{
		userList = input.split("###"); //리스트 분리 1
		userInfo = new String[userList.length];
		
		for(int i=0; i<userList.length; i++)
		{
			userInfo[i]=userList[i].split("\\|")[1];
			userList[i]=userList[i].split("\\|")[0];
		}
	}
	

}
