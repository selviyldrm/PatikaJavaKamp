import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//variable: değişken
        //veri tipi değişkenin türünü belirtir.
	    //isimlendirme:değişken isimleri camelCase yazılır
		//veri tipiyle değe aynı türde olmalıdır
		//primative(ilkel) veri tipleri: default değerdir her zaman bir değere sahiptir.
		//non-primative(ilkel olmayan):"null" olabilir.
		// İlkel olmayan türlerin tümü aynı boyuta sahipken ilkel veri tiplerin boyutu alacağı veri tipine bağlıdır.
		
		//Değişken tanımlama: veri tipi değişkenismi=veri (değer) 
	    //int :tamsayı değeri
		//değişken ismi camelCase yazılır
		 int numberOne=10,numberTwo=4,numberThree;
		 numberOne=5;
		 numberThree=6;
		 System.out.println(numberOne+" "+numberTwo+" "+numberThree);
	
		 //dikdörtgenin alnı ve çevresini hesaplama
		 int kısaKenar=10,uzunKenar=20;
		 int alan=kısaKenar*uzunKenar;
		 int cevre=2*(kısaKenar+uzunKenar);
		 System.out.println("Alan: "+alan);
		 System.out.println("Çevre: "+cevre);
		 
		 //Ondalıklı sayılar :float double
		 float vFloat=3.14f;
		 double vDouble=3.14;
		 System.out.println(vFloat);
	     System.out.println(vDouble);
	     
	     //char: karakter
	     char vChar='b';
	     char vChar2=98;
	     System.out.println(vChar);
	     System.out.println(vChar2);
	     
	     char c1='J';
	     char c2='A';
	     char c3='V';
	     char c4='A';
	     System.out.println(c1+c2+c3+c4);//ASCII KODLARI TOPLAMI
	     System.out.println(""+c1+c2+c3+c4);
	    
	     boolean dogru=true;
	     boolean yanlis=false;
	     System.out.println(dogru);
	     System.out.println(yanlis);
	     
	     //String charlardan oluşan veri kümesidir. metinsel işlemlerin yapıldığı sınıftır.
	     String vStr="Java 101 Patikası";
	     System.out.println(vStr);
	     
	     //Temel Operatörler
	     
	     int a=5 , b=1;
	     //ARİTMETİK OPERATÖRLER
	     System.out.println(a+b);//toplama
	     System.out.println(a-b);//çıkarma
	     System.out.println(a*b);//çarpma
	     System.out.println(a/b);//bölme
	     System.out.println(a%b);//mod alma
	     
	     //ATAMA OPERATÖRLERİ
	    int  c=7;
	    int d=c;
	    c+=d;//c=c+d
	    System.out.println(c); 
	     
	     //Karşılaştırma Operatörleri
	    
	     boolean sonuc= a==b;//eşit mi
	     System.out.println(sonuc);
	     boolean sonuc1= a!=b; //eşit değil mi
	     System.out.println(sonuc1);
	     boolean sonuc2= a>b; //büyük mü
	     System.out.println(sonuc2); 
	     //a<b küçük mü - a<=b küçük eşit mi -a>b büyük eşit mi 
	     
	     //Mantıksal Operatörler
	     //ve= &&  iki koşuldan ikiside sağlanmak zorunda
	     //veya= || bir koşulun sağlanması yeterli
	     
	     int x=5,y=6,z=5;
	     boolean kosul1= x==z;
	     boolean kosul2= x>=y;
	     boolean sonuc3 = kosul1 && kosul2;
	     System.out.println(sonuc3);
	     boolean sonuc4 = kosul1 || kosul2;
	     System.out.println(sonuc4);
	     
	     String str=sonuc4 ? "Doğru" :"Değil";
	     System.out.println(str);
	     int f = 1, g = 2, r=3;
	     r *= f + g;
	     System.out.println(r);
	     byte h = 0; 
	     int m = h++; 
	     System.out.println(m);
	     int l=-12;
	     int n=-5;
	     System.out.println(l%n);
	     
	     //Kullanıcıdan veri alma
	     
	     int p;
	     Scanner input =new Scanner(System.in);
	     System.out.print("p sayisini giriniz: ");
	     p=input.nextInt();
	     System.out.println(p);
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	}

}
