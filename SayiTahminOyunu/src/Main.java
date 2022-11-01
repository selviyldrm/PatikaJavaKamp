import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Random random=new Random();
		int number=random.nextInt(100);
		
		Scanner input=new Scanner(System.in);
		
		int right=0;
		int selected;
		int[] wrong=new int[5];
		System.out.println(number);
		boolean isWin=false;
		
		while(right< 5) {
			System.out.print("Lütfen tahmininizi giriniz : ");
			selected=input.nextInt();
			if(selected<0 || selected>99) {
				System.out.println("lütfen 0-99 arasında bir sayı giriniz");
				continue;
			}
			
			if(selected==number) {
				System.out.println("Tebrikler.doğru tahmin ! Tahmin ettiğiniz sayı: "+number);
			    isWin=true;
			}
			else {
				
				System.out.println("Hatalı bir sayı girdiniz.");
				if(selected>number) {
					System.out.println(selected+ " sayısı gizli sayıdan büyüktür");
				}else {
					System.out.println(selected+" sayısı gizli sayıdan küçüktür");
				}
				wrong[right++]=selected;
				System.out.println("Kalan Hakkı : "+(5 - right));
			}
			
		}
		if(!isWin) {
			System.out.println("Kaybettiniz!!!");
			System.out.println("Tahminleriniz : "+Arrays.toString(wrong));
		}
	}

}
