import java.util.Scanner;

import workbook.StepA.StepAManager;
import workbook.StepB.StepBManager;
import workbook.StepC.StepCManager;
import workbook.StepD.StepDManager;
import workbook.StepE.StepEManager;
import workbook.StepF.StepFManager;

public class WBManager {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("원하는 Step은?");
		String step = s.next();
		
		if(step.equalsIgnoreCase("A")) 
			new StepAManager();
		else if(step.equalsIgnoreCase("B"))
			new StepBManager();
		else if(step.equalsIgnoreCase("C"))
			new StepCManager();
		else if(step.equalsIgnoreCase("D"))
			new StepDManager();
		else if(step.equalsIgnoreCase("E"))
			new StepEManager();
		else if(step.equalsIgnoreCase("F"))
			new StepFManager();
		System.out.printf("종료되었습니다.\n");
	}	
}