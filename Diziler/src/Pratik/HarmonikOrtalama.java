package Pratik;

public class HarmonikOrtalama {

	public static void main(String[] args) {
		
		int[] numbers= {1,2,3,4,5};
		int n=numbers.length;
		double harmonik=0;
		
		for(int i = 0; i < n; i++) {
			harmonik += 1.0 / numbers[i];
		}
		
		double total = n / harmonik;
		
		System.out.println("Harmonic Mean : " + total);


	}

}
