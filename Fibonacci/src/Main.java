import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int n1 = 0, n2 = 1, n3;
		Scanner input = new Scanner(System.in);
		System.out.print("Basamak Sayısını girin :");
		int sayi = input.nextInt();

		for (int i = 1; i <= sayi; i++) {
			n3 = n1 + n2;
			System.out.println(n1 + "+" + n2 + "=" + n3);
			n1 = n2;
			n2 = n3;
		}
	}
}