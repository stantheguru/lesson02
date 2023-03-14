package lesson02;
import java.util.*;

public class calculateNHIF {

	public static float getNHIF(float grossPay) {
		float NHIFAmount = 0.0f;
		
		if(grossPay<=6000.0f) {
			NHIFAmount = 150.0f;
			
		//AND OR
		// IF -- WHILE -- FOR -- DO WHILE
		}else if(grossPay>6000.0f && grossPay<=8000.0f) {
			NHIFAmount = 300.0f;
		}else {
			NHIFAmount = 1700.0f;
		}
		
		//for loop
		for(int i = 1;i<=10;i++) {
			System.out.println(i);
		}
		
		/*	
		LinkedHashMap<Float, Float> NHIFRates = new LinkedHashMap<Float, Float>();
		NHIFRates.put(6000.0f, 150.0f);
		NHIFRates.put(8000.0f, 300.0f);
		NHIFRates.put(12000.0f, 400.0f);
		NHIFRates.put(15000.0f, 500.0f);
		NHIFRates.put(20000.0f, 600.0f);
		NHIFRates.put(25000.0f, 750.0f);
		NHIFRates.put(30000.0f, 850.0f);
		NHIFRates.put(35000.0f, 900.0f);
		NHIFRates.put(40000.0f, 950.0f);
		NHIFRates.put(45000.0f, 1000.0f);
		NHIFRates.put(50000.0f, 1100.0f);
		NHIFRates.put(60000.0f, 1200.0f);
		NHIFRates.put(70000.0f, 1300.0f);
		NHIFRates.put(80000.0f, 1400.0f);
		NHIFRates.put(90000.0f, 1500.0f);
		NHIFRates.put(100000.0f, 1600.0f);
		NHIFRates.put(1000000.0f, 1700.0f);
		
		
		Set<Float> keys = NHIFRates.keySet();
		for(float upperValue: NHIFRates.keySet()) {
			if(grossPay < upperValue) {
				List<Float> listKeys = new ArrayList<Float>(keys);
				
				int index = listKeys.indexOf(upperValue);
				float amount  = listKeys.get(index-1);
				System.out.println(upperValue);
				NHIFAmount = NHIFRates.get(amount);
				break;
			}
		}
		*/
		System.out.println("NHIF Amount for Gross Pay KES"+grossPay+" is KES"+ NHIFAmount);

		return NHIFAmount;
	}
	
}
