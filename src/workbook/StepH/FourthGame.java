package workbook.StepH;

import java.util.Scanner;
import java.util.Random;

public class FourthGame {
	private int com_finger; // 컴퓨터가 낸 가위(1), 바위(2), 보(3)
	private int my_finger; //사용자가 낸 가위(1), 바위(2), 보(3)
	private int score[] = {0, 0, 0}; //결과 횟수 리스트 [[컴퓨터의 승, 무, 패]
	private String game[] = {"가위", "바위", "보"};
	
	public FourthGame()
	{
		input();
	}
	
	public void printScore()
	{
		System.out.printf("컴퓨터 : 이긴 횟수는 %d, 진 횟수는 %d, 빈 횟수는 %d입니다.\n", score[0], score[2], score[1]);
	}
	
	void input()
	{
		Scanner s = new Scanner(System.in);
		Random generator = new Random();
		
		while(true)
		{
			System.out.printf("가위(1), 바위(2), 보(3)를 입력하세요. ");
			my_finger = s.nextInt();
			
			if(my_finger == 0)
				break;
			
			com_finger = generator.nextInt(3)+1;
			System.out.printf("컴퓨터가 낸 것은 "+game[com_finger-1]+"입니다. -------> ");
			winner();
		}
	}
	
	void winner()
	{
		if(com_finger == my_finger)
		{
			System.out.printf("비김!\n");
			score[1] ++;
		}
		else if(com_finger == 1 && my_finger == 3)
		{
			System.out.printf("컴퓨터 승!\n");
			score[0]++;
		}
		else if(com_finger == 2 && my_finger == 1)
		{
			System.out.printf("컴퓨터 승!\n");
			score[0]++;
		}
		else if(com_finger == 3 && my_finger == 2)
		{
			System.out.printf("컴퓨터 승!\n");
			score[0]++;
		}
		else
		{
			System.out.printf("사용자 승!\n");
			score[2]++;
		}
	
		
	}
	
}
