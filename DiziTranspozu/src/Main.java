
public class Main {

	public static void main(String[] args) {

		int[][] matris = { { 1, 2, 3 }, { 4, 5, 6 } };
		int[][] transpoz = new int[3][2];
		
		System.out.println("Matris: ");
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(matris[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				transpoz[j][i]=matris[i][j];
			}
			}
			System.out.println("Transpoz : ");
			
			for(int i=0;i<3;i++) {
				for(int j=0;j<2;j++) {
					System.out.print(transpoz[i][j]+" ");
				}
				System.out.println();
			}
		
	}

}
