package lesson02;
import java.util.*;

public class calculateNHIF {

	public static float getNHIF(float grossPay) {
		float NHIFAmount = 0.0f;
		
		LinkedHashMap<Float, Float> NHIFRates = new LinkedHashMap<Float, Float>();
		NHIFRates.put(6000.0f, 150.0f);
		NHIFRates.put(8000.0f, 200.0f);
		NHIFRates.put(12000.0f, 300.0f);
		NHIFRates.put(15000.0f, 400.0f);
		
		for(float upperValue: NHIFRates.keySet()) {
			if(grossPay < upperValue) {
				NHIFAmount = NHIFRates.get(upperValue);
			}
		}
		System.out.println("NHIF Amount for Gross Pay KES"+grossPay+" is KES"+ NHIFAmount);

		return NHIFAmount;
	}
	
}
