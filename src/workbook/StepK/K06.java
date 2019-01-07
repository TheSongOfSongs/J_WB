package workbook.StepK;

import java.util.Scanner;

public class K06 {
	private int user_num;
	
	public K06()
	{
		Scanner s = new Scanner(System.in);
		
		System.out.printf("등록할 학생의 명수는?  ");
		user_num = s.nextInt();
		
		UserInfo user[] = new UserInfo[user_num];
		
		for(int i=0; i<user_num; i++)
		{
			user[i] = new UserInfo();
			System.out.printf("%d번 ", (i+1));
			user[i].input();
		}
		
		System.out.printf("=======================================\n");
		System.out.printf("등록된 학생 목록은 다음과 같습니다.\n");
		System.out.printf("=======================================\n");
		System.out.printf("번호\t아이디\t비밀번호\n");
		
		for(int i =0; i<user_num; i++)
			user[i].print(i);
	}

}