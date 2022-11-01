import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		int[] numbers= {10, 20, 20, 10, 10, 20, 5, 20};
		Arrays.sort(numbers);
		
		int sayac=1;
		for(int i=1;i<numbers.length;i++) {
			if(numbers[i]==numbers[i-1]) {
				sayac++;
			}else {
                sayac=1;
               
            }
			System.out.println(numbers[i-1]+" sayısı "+ sayac+"kere tekrar etti");
		}
		
	}

}
