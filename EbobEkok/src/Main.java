import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.print("1. sayıyı giriniz: ");
		int n1=input.nextInt();
		System.out.print("2. sayıyı giriniz: ");
		int n2=input.nextInt();
		int ebob=1;
		
		//EKOK
		
		for(int i=1;i<=(n1*n2);i++) {
			if(i%n1==0 && i%n2==0) {
				System.out.println(i);
				break;
			}
		}
		
		
		/* for(int i=1;i<=n1;i++) {
			if(n1%i==0 && n2%i==0) {
				System.out.println(i);
				ebob=i;
			}
		}
		System.out.println("-------------------");
		//System.out.println(ebob);
		for(int k=n1;k>=1;k-- ) {
			if(n1%k==0 && n2%k==0) {
				ebob=k;
				System.out.println(ebob);
				break;
			}
		}*/
	}

}
