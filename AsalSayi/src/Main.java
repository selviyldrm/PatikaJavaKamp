
public class Main {

	public static void main(String[] args) {
		
		int sayac;
		
		for(int i=1;i<100;i++) {
			sayac=0;
			for(int j = 1; j < i; j++) {
				if(i % j == 0)sayac++;
			}
			if(sayac == 1) System.out.print(i+" ");
		}

	}

}
