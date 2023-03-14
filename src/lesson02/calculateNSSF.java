package lesson02;
import java.util.Scanner;  //import

public class calculateNSSF {

	public static void main(String[] args) {
		String name = "Stanley";
		//Capture user input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Gross Pay (KES): ");
		//Convert entered value to float and call function
		float scannerValue = Float.parseFloat(scanner.nextLine());
		
		//first execution
		getRate(scannerValue);
		
		//Object of NHIF Class
		calculateNHIF nhif = new calculateNHIF();
		//second
		nhif.getNHIF(scannerValue);

	}
	
	//method
	public static float getRate(float grossPay) {	
		//Calculate NSSF Old Rate
		float nssfAmountOld = grossPay * 0.05f;
		if(nssfAmountOld>200) {
			nssfAmountOld = 200.0f;
		}
		//Calculate NSSF New Rate
		float nssfAmountNew = grossPay * 0.06f;
		
		System.out.println("Old Rate NSSF Amount for Gross Pay KES"+grossPay+" is KES"+ nssfAmountOld);
		System.out.println("New Rate NSSF Amount for Gross Pay KES"+grossPay+" is KES"+ nssfAmountNew);
		return nssfAmountOld;
		
	}

}
