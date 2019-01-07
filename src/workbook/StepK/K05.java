/******** including class UserInfo **********/

package workbook.StepK;

import java.util.Scanner;

public class K05 {
	
	public K05(){
		UserInfo user = new UserInfo();
		
		user.input();
		System.out.printf("=======================================\n");
		System.out.printf("등록된 학생 목록은 다음과 같습니다.\n");
		System.out.printf("=======================================\n");
		System.out.printf("번호\t아이디\t비밀번호\n");
		user.print(0);
	}

}

class UserInfo
{
	String userID;
	String password;
	
	void input()
	{
		Scanner s = new Scanner(System.in);	
		
		System.out.printf("학생의 아이디, 비밀번호를 입력하시오 --> ");
		userID = s.next();
		password = s.next();
	}
	
	void print(int index)
	{
		System.out.printf((1+index)+"\t"+userID+"\t"+password+"\n");
	}
	
}
