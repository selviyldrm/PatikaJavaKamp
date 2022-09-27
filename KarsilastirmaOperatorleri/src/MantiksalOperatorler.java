
public class MantiksalOperatorler {

	public static void main(String[] args) {
		
		int a=10,b=20,c=5;
		
		boolean kosul1=(a<b);
		boolean kosul2=(a>c);
        boolean sonuc= kosul1 && kosul2;
        boolean sonuc2= kosul1 || kosul2;
    	
        System.out.println(sonuc);
        System.out.println(sonuc2);
        
        
        int not=50;
        System.out.println(not>45 ? "Geçti" :"Kaldı");
        boolean e = true, f = false;
        System.out.println((e && f) || (e || f));
	}

}
