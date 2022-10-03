import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//n için 1*2*3*....*n faktoriyel hesabı
		int n;
		Scanner input=new Scanner(System.in);
		System.out.print("Sayıyı  giriniz: ");
		n=input.nextInt();
		int total=1;
		
		for(int i=1;i<=n;i++) {
			total=total*i;
		}

		System.out.println(n+".  Faktoriyel: "+total);
	}

}
