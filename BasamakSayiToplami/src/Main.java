import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int basamak,basamakTop=0;
		
		 Scanner scan= new Scanner(System.in);

	        System.out.println("Lütfen bir sayı giriniz: ");
	        int num = scan.nextInt();
		
	        while (num!=0){

	            basamak=num%10;
	            basamakTop+=basamak;
	            num/=10;}

	        System.out.println(basamakTop);

	}

}
