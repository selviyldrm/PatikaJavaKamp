import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int n,k;
		Scanner sayi=new Scanner(System.in);
		System.out.print("Üssü alıncak sayıyı giriniz: ");
        n=sayi.nextInt();
        System.out.print("Üs sayıyı giriniz: ");
        k=sayi.nextInt();
        
        int total=1;
        
        int i=1;
        while(i<=k) {
        	total*=n;
        	i++;
        }
        System.out.println("Sonuç: " + total);
	}

}
