import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	  String userName,password,sifreKontrol,newPassword;	
      Scanner giris=new Scanner(System.in);
      System.out.print("Kullanıcı adınız: ");
      userName=giris.nextLine();
      System.out.print("Şifreniz: ");
      password=giris.nextLine();
      
      if( userName.equals("patika") && password.equals("java123")){
    	  System.out.println("Giriş Yaptınız");
      }
      else {
    	  System.out.println("Bilgileriniz yanlış yeni şifre belirlemek istermisiniz?");
    	  sifreKontrol=giris.nextLine();
    	  if( sifreKontrol.equals("no")){
              System.out.println(" giris sonlandirildi ");}

          else if (sifreKontrol.equals("yes")) {
              System.out.println(" yeni sifrenizi yazin ");
              newPassword=giris.nextLine();

              if( newPassword.equals("java123")|| newPassword.equals(password)){
                  System.out.println(" Hatali giris tekrar dene ");
              }
              else{
                  System.out.println(" sifrenizi basariyla yenilendi ");

              }

          }
          else{
              System.out.println(" hatali secim sectiniz ");

          }
      }
	}

}
