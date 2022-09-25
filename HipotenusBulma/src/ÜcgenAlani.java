import java.util.Scanner;

public class ÜcgenAlani {

	public static void main(String[] args) {
		
		double a,b,c,alan,cevre;
		
		Scanner input=new Scanner(System.in);
		System.out.println("a kenarı: ");
		a=input.nextDouble();

		System.out.println("b kenarı: ");
		b=input.nextDouble();

		System.out.println("c kenarı: ");
		c=input.nextDouble();

		cevre=a+b+c;
		System.out.println("Çevre: "+cevre);
		
		alan=Math.sqrt((cevre/2)*(cevre/2-a)*(cevre/2-b)*(cevre/2-c));
		System.out.println("Alan: "+alan);
	}

}
