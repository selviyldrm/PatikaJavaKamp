
public class Ornek2 {

	public static void main(String[] args) {
		
		int [][] matris=new int[3][4];
		int number=1;
		for(int i=0;i<matris.length;i++) {
			//matris[i]
			for(int j=0;j<matris[i].length;j++) {
				matris[i][j]=number++;
			}
		}
		
		for(int i=0;i<matris.length;i++) {
			for(int j=0;j<matris[i].length;j++) {
				System.out.println(matris[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
