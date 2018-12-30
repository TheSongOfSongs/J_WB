package workbook.StepA;

import java.util.Scanner;

public class GigaToOther {
	private int gigabytes;
	private int megabytes;
	private int kilobytes;
	private long bytes;
	
	public GigaToOther()
	{ input(); }
	
	void input()
	{
		Scanner s = new Scanner(System.in);
		System.out.printf("파일 용량을 기가바이 단위로 입력하세요.");
		this.gigabytes = s.nextInt();
	}
	
	public void printOther()
	{
		System.out.println("입력하신 파일 용량은");
		System.out.println(" "+get_mega()+" 메가바이트,");
		System.out.println(" "+get_kilo()+" 킬로바이트,");
		System.out.println(" "+get_bytes()+" 바이트입니다");
	}
	
	int get_mega()
	{
		megabytes = gigabytes*1024;
		return this.megabytes;
	}
	
	int get_kilo()
	{
		kilobytes = megabytes*1024;
		return this.kilobytes;
	}
	
	long get_bytes()
	{
		bytes = kilobytes*1024L;
		return this.bytes;
	}
	

}
