import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int n1,n2,select;
		Scanner i=new Scanner(System.in);
		System.out.print("1. sayıyı giriniz:");
		n1=i.nextInt();
		System.out.print("2. sayıyı giriniz:");
		n2=i.nextInt();
		
		System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
		System.out.println("Seçiniz: ");
		select=i.nextInt();
		
		switch(select) {
		case 1:
			System.out.println("Toplam: "+(n1+n2));
			break;
		case 2:
			System.out.println("Çıkarma: "+(n1-n2));
			break;
		case 3:
			System.out.println("Çarpım: "+(n1*n2));
			break;
		case 4:
			if(n2!=0) {
				System.out.println("Bölüm: "+(n1/n2));
				}
			else {
				System.out.println("Bir sayı 0'a bölünemez");
			}
			break;
			default:
				System.out.println("Geçersiz işlem...Tekrar deneyiniz...");
				break;
		}
	}

}
