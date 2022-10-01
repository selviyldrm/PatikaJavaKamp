
public class WhileDongusu {

	public static void main(String[] args) {
		
		int i=1;
		int k;
		System.out.println("Program başladı");
		while(i<=5) {
			System.out.println(i);
			k=1;
			while(k<=10) {
				System.out.print(k+",");
				k++;
			}
			System.out.println();
			i++; //arttırma olmazsa sonsuz döngüye girer
		}

		System.out.println("Program bitti");
	}

}
