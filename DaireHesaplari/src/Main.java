import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int r;
		double pi=3.14,a;
		Scanner i=new Scanner(System.in);
		System.out.println("Yarıçapı giriniz: ");
		r=i.nextInt();
		System.out.println("Merkez açının ölçüsünü giriniz: ");
		a=i.nextDouble();
		
		double alan=pi*r*r;
		double cevre=2*pi*r;
		double dilimalani=(pi*(r*r)*a)/360;
		
		System.out.println("Daire Alanı: "+alan);
		System.out.println("Dairenin Çevresi: "+cevre);
		System.out.println("Dilim Alanı:"+dilimalani);
	}

}
