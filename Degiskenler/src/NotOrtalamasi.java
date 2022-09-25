import java.util.Scanner;

public class NotOrtalamasi {

	public static void main(String[] args) {
		// değişkenleri oluştur
		int mat, fizik, kimya, turkce, tarih, muzik;

		// Scanner sınıfı tanımlandı
		Scanner input = new Scanner(System.in);
		// kullanıcıdan değerleri al
		System.out.println("Matematik notunuz: ");
		mat = input.nextInt();
		System.out.println("Fizik notunuz: ");
		fizik = input.nextInt();
		System.out.println("Kimya notunuz: ");
		kimya = input.nextInt();
		System.out.println("Türkçe notunuz: ");
		turkce = input.nextInt();
		System.out.println("Tarih notunuz: ");
		tarih = input.nextInt();
		System.out.println("Müzik notunuz: ");
		muzik = input.nextInt();

		double ortalama=(mat+fizik+kimya+turkce+tarih+muzik)/6.0;
		System.out.println("Ortalamanız: "+ortalama);
		
		String ort=ortalama>60 ? "Sınıfı Geçti":"Sınıfta Kaldı";
		System.out.println(ort);
	}

}
