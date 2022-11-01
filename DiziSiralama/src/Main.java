import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		System.out.print("Dizinin boyutunu giriniz: ");
		int n=scan.nextInt();
		
		int[] numbers = new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("dizinin "+(i+1)+".elemanı :");
			int arrIndex=scan.nextInt();
			numbers[i]=arrIndex;
		}

		Arrays.sort(numbers);
		System.out.println("Dizi sıralama: "+Arrays.toString(numbers));
	}

}
