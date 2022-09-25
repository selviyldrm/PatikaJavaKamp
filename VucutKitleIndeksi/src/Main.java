import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double boy,kilo, vki;
		
		Scanner i=new Scanner(System.in);
		System.out.println("Boyu giriniz: ");
		boy=i.nextDouble();
		System.out.println("Kilo giriniz: ");
		kilo=i.nextDouble();
		
		vki=kilo/(boy*boy);
		System.out.println("Vücüt Kitle Endeksi: "+vki);
		
	}

}
