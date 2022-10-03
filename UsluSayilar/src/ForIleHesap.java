import java.util.Scanner;

public class ForIleHesap {

	public static void main(String[] args) {
		int n,k;
		Scanner sayi=new Scanner(System.in);
		System.out.print("Üssü alıncak sayıyı giriniz: ");
        n=sayi.nextInt();
        System.out.print("Üs sayıyı giriniz: ");
        k=sayi.nextInt();
        
        int total=1;
        
        for(int i=1;i<=k;i++) {
        	total*=n;
        }
        System.out.println("Sonuç: " + total);
	}

}
