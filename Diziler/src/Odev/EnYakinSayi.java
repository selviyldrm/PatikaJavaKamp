package Odev;

import java.util.Arrays;
import java.util.Scanner;

public class EnYakinSayi {

	public static void main(String[] args) {

		int[] list = { 15, 12, 788, 1, -1, -778, 2, 0 };
		Arrays.sort(list);
		System.out.println(Arrays.toString(list));

		System.out.println("Girilen Sayı : ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		for (int i = 0; i < list.length; i++) {

			if (x < list[i]) {
				System.out.println("Girilen sayıdan küçük en yakın sayı : " + list[i - 1]);
				System.out.println("Girilen sayıdan büyük en yakın sayı : " + list[i]);
				break;
			}
		}
	}

}
