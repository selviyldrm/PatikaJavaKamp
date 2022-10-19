import java.util.Scanner;

public class Main {

	static void asal(int sayi,int i) {
		if(i==sayi) {
			System.out.println(sayi + " asal sayıdır.");
			return;
		}
		else if (sayi%i == 0) {
            System.out.print(sayi + " asal sayı değildir.");
            return;
        }

        asal(sayi, i + 1);

	}
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Bir sayı giriniz: ");
        int sayi=scan.nextInt();
        asal(sayi,2);
	}

}
