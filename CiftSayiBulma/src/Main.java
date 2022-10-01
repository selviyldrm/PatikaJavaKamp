import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int k;
		
		Scanner sayi=new Scanner(System.in);
		System.out.print("Sayıyı giriniz: ");
		k=sayi.nextInt();
		
		for(int i=1;i<k;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}

}
