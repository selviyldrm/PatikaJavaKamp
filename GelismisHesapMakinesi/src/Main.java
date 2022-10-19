import java.util.Scanner;

public class Main {

	static int topla(int a, int b) {
		int result = a + b;
		System.out.println("Toplam : " + result);
		return result;
	}

	static int cıkar(int a, int b) {
		int result = a - b;
		System.out.println("Sonuç : " + result);
		return result;
	}

	static int carpma(int a, int b) {
		int result = a * b;
		System.out.println("Çarpım : " + result);
		return result;
	}

	static int bolme(int a, int b) {
		if (b == 0) {
			return 0;
		}
		int result = a / b;
		System.out.println("Bölüm : " + result);
		return result;
	}

	static int ustAlma(int a, int b) {
		int result = 1;
		for (int i = 1; i <= b; i++) {
			result *= a;
		}
		return result;
	}

	static int mod(int a, int b) {
		return a % b;
	}

	static void dikdortgenHesap(int a, int b) {
		System.out.println("Çevresi: " + (2 * (a + b)));
		System.out.println("Alanı: " + (a * b));
	}

	static void Faktoriyel(int a) {
		int result=1;
		for(int i=1;i<=a;i++) {
			result*=i;
		}
		System.out.println("sonuc: "+ result);
	}
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int select;

		String menu = "1-Toplama İşlemi" + "2- Çıkarma İşlemi" + "3-Çarpma İşlemi" + "4-Bölme İşlemi"
				+ "5-Üslü Sayı Hesaplama" + "6-Mod Alma" + "7-Dikdörtgen Alan Ve Çevre Hesabı" + "8-Çıkış Yap";

		while (true) {
			System.out.println(menu);
			System.out.print("Bir işlem seçiniz :");
			select = scan.nextInt();

			if (select == 0) {
				break;
			}

			System.out.print("İlk Sayı: ");
			int a = scan.nextInt();
			System.out.print("İkinci Sayı: ");
			int b = scan.nextInt();

			switch (select) {
			case 1:
				topla(a, b);
				break;
			case 2:
				cıkar(a, b);
				break;

			case 3:
				carpma(a, b);
				break;
			case 4:
				if (bolme(a, b) == 0) {
					System.out.println("İkinci Sayı 0'dan farklı olmalı");
				}
				bolme(a, b);
				break;
			case 5:
				System.out.println(ustAlma(a, b));
				break;
			case 6:
				System.out.println(mod(a, b));
				break;
			case 7:
				dikdortgenHesap(a, b);
				break;
			case 8:
				Faktoriyel(a);
			default:
				System.out.println("Geçersiz bir işlem girdiniz!");
			}
		}
		System.out.println("Güle güle!");
	}

}
