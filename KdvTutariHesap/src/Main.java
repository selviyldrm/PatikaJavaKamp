import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		double tutar,kdvOran=0.18,kdvOran2=0.8,kdvTutar,kdvliTutar;
		
		Scanner input=new Scanner(System.in);
		System.out.println("Ücret tutarını giriniz: ");
        tutar=input.nextDouble();
		
        kdvTutar=(tutar>0 && tutar<1000) ? tutar*kdvOran : tutar*kdvOran2;
        kdvliTutar=tutar+kdvTutar;
        
        System.out.println("Kdv'siz Tutar: "+tutar);
        System.out.println("Kdv Oranı: "+kdvOran);
        System.out.println("Kdv Tutarı: "+kdvTutar);
        System.out.println("Kdv'li Tutar: "+kdvliTutar);
	}

}
