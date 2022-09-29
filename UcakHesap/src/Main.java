import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Gidilecek mesafeyi giriniz: ");
		double mesafe=input.nextDouble();
		
		System.out.print("Yaşınızı giriniz: ");
        int yas=input.nextInt();
        
        System.out.print("Tek yön için 1'e \n Gidiş-Dönüş için 2'ye basınız: ");
        byte secim=input.nextByte();
        
        double ucret=mesafe*0.1;
        
        switch(secim) {
        
        case 1 :
        	if(yas<=12) {
        		System.out.println("Toplam Tutar: "+(ucret-ucret/2));
        	}
        	else if(yas>12 && yas<24) {
        		System.out.println("Toplam Tutar: "+(ucret-ucret*0.1));
        	}
        	else if(yas>65) {
        		System.out.println("Toplam Tutar: "+(ucret-ucret*0.3));
        	}
        	else {
        		 System.out.println("Toplam ücret: "+ucret);
        	}
        	break;
        	
        case 2:
            if(yas<12){
                System.out.print("Toplam tutar:"+ (ucret/2 -((ucret/2)*0.2)) );
            }else if(12<yas && yas<24){
                System.out.print("Toplam tutar:"+((ucret-ucret*0.1)-((ucret-ucret*0.1)*0.2)));
            }else if(yas>65){
                System.out.print("Toplam tutar:"+((ucret-ucret*0.3)-((ucret-ucret*0.3))*0.2));
            }else{
                System.out.println("Toplam tutar"+ (ucret-(ucret*0.2)));
            }
            break;
        }
        }
        
	}

