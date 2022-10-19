import java.util.Scanner;

public class Main {
	  static void desen(int sayi, int sonuc, int sonSayi) {
	        if(sonSayi <= 0) {
	            System.out.print(sonuc + " ");
	            sonuc += 5;
	            if(sonuc == sayi) {
	                System.out.print(sonuc + " ");
	                return;
	            }
	        }else if(sonSayi > 0) {
	            System.out.print(sonuc + " ");
	            sonuc -= 5;
	            if (sonuc <= 0) {
	                sonSayi = sonuc;
	            }
	        }
	        desen(sayi,sonuc,sonSayi);
	    }

	    public static void main(String[] args) {
	        int number, result, tempNumber;
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Bir Sayı giriniz : ");
	        number = sc.nextInt();

	        result = number;
	        tempNumber = number;

	        if(number == 0) {
	            System.out.println("0  kullanılamaz.");
	        }else {
	            desen(number,result,tempNumber);
	        }
	    }
	}