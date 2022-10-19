package recursiveUsHesaplama;

import java.util.Scanner;

public class Main {
	static int UsAlma(int taban,int us ) {
		if(us==0) {
			return 1;
		}
		else if(taban==0) {
			return 0;
		}
		
		return UsAlma(taban, us - 1) * taban;
	}

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Tabanı giriniz: ");
		int a=scan.nextInt();
		System.out.print("Üst giriniz: ");
		int b=scan.nextInt();
		System.out.println("Sonuç : "+ UsAlma(a, b));
	}

}
