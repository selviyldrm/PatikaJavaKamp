import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n=1,r=1,nDeger=1,rDeger=1,xDeger=1,x,c;
		Scanner input=new Scanner(System.in);
		System.out.print("1. Sayıyı  giriniz: ");
		n=input.nextInt();

		System.out.print("2. Sayıyı  giriniz: ");
		n=input.nextInt();
		
		x = (n - r );
		
		for (int i = 1; i <= n; i++) {
            nDeger *= i;

        }
        for (int i = 1; i <= r; i++) {
            rDeger *= i;

        }
        for (int i = 1; i <= x; i++) {
            xDeger *= i;

        }
        c = nDeger / (rDeger * xDeger);
        System.out.println("Kombinasyon: "+c);

	}

}
