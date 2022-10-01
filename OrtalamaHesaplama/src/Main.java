import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int k, sayac=0;
        double toplam=0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Bir pozitif tam sayı giriniz: ");
		k = input.nextInt();

	 for(int i=0;i<=k;i++) {
		 
		 if(i%3==0 && i%4==0) {
			 toplam+=i;
			 sayac++;
		 }
	 }
	 double ortalama= toplam/sayac;
	 System.out.println("Ortalama: "+ortalama);
		
	}
}