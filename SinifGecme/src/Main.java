import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
       int mat,fizik,turkce,kimya,muzik;
       double ortalama;
       
       Scanner s=new Scanner(System.in);
       
       System.out.print("Matematik sonucunuz: ");
       mat=s.nextInt();
       
       System.out.print("Fizik sonucunuz: ");
       fizik=s.nextInt();
       
       System.out.print("Türkçe sonucunuz: ");
       turkce=s.nextInt();
       
       System.out.print("Kimya sonucunuz: ");
       kimya=s.nextInt();
      
       System.out.print("Müzik sonucunuz: ");
       muzik=s.nextInt();
       
       if(mat<0 || mat>100) {
    	   mat=0;
       }
       if(fizik<0 || fizik>100) {
    	   fizik=0;
       }
       if(turkce<0 || turkce>100) {
    	   turkce=0;
       }
       if(kimya<0 || kimya>100) {
    	   kimya=0;
       }
       if(muzik<0 || muzik>100) {
    	   muzik=0;
       }
       ortalama=(mat + fizik + turkce + kimya + muzik)/5;
       
       if(ortalama>=55) {
    	   System.out.println("Sınıfı Geçtiniz");
       }
       else {
    	   System.out.println("Sınıfta Kaldınız...");
       }
       
	}

}
