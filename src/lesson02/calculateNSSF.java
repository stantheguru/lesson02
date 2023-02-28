package lesson02;
import java.util.Scanner;

public class calculateNSSF {

	public static void main(String[] args) {
		//Capture user input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Gross Pay (KES): ");
		//Convert entered value to float and call function
		float scannerValue = Float.parseFloat(scanner.nextLine());
		getOldRate(scannerValue);

	}
	
	public static float getOldRate(float grossPay) {	
		//Calculate NSSF
		float nssfAmount = grossPay * 0.05f;
		if(nssfAmount>200) {
			nssfAmount = 200.0f;
		}
		System.out.println("NSSF Amount for Gross Pay KES"+grossPay+" is KES"+ nssfAmount);
		return nssfAmount;
		
	}

}
