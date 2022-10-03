import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,total=0;
		Scanner input=new Scanner(System.in);
		
		do {
			System.out.print("Sayı giriniz: ");
			n=input.nextInt();
			if(n % 2==1) {
				total+=n;
			}
		}while(n>0);
		
       System.out.println("Total: "+total);
	}

}
