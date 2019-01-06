package workbook.StepJ;

public class SixthFibonacci {
	
	public void printFibo()
	{
		System.out.printf("1부터 20까지 피보나치 수는 다음과 같습니다.\n");
		for(int i=1; i<=20; i++)
		{
			if(i<10)
				System.out.printf(" %d번째 : %d\n", i, fibonacci(i));
			else
				System.out.printf("%d번째 : %d\n", i, fibonacci(i));
		}
	}

	int fibonacci(int n)
	{
		if(n == 1)
			return 1;
		else if(n == 2)
			return 1;
		else
			return fibonacci(n-1)+fibonacci(n-2);
	}

}
