import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		int a,b,c;
		
		Scanner sayi=new Scanner(System.in);
		
		System.out.println("1. Sayi: ");
		a=sayi.nextInt();
		
		System.out.println("2. Sayi: ");
		b=sayi.nextInt();
		
		System.out.println("3. Sayi: ");
		c=sayi.nextInt();
		
		if(a<b && a<c) {
			if(b<c) {
				System.out.println("a<b<c");
			}
			else {
				System.out.println("a<c<b");
			}
		}
		else if(b<a && b<c) {
			if(a<c) {
				System.out.println("b<a<c");
			}
			else {
				System.out.println("b<c<a");
			}
		}
		else {
			if(a<b) {
				System.out.println("c<a<b");
			}
			else {
				System.out.println("c<b<a");
			}
		}

	}

}
