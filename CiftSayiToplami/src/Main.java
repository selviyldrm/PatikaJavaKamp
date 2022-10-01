import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.

		int number,toplam=0;
		
		Scanner a=new Scanner(System.in);
	
		do {
	        System.out.print("Sayıyı giriniz: ");	
	        number=a.nextInt();
	        if(number % 4 ==0) {
	        	toplam +=number;
	        }
		}while(number % 2 == 0);
		
		System.out.println("Toplam: "+toplam);
	}

	
}
