
public class Main {

	public static void main(String[] args) {
		int A = 10;
		int B = 20;
		int C = 10;
		int D = 40 ;
		
		//==(eşittir operatörü)
		System.out.println(A==B);
		System.out.println(A==C);
        System.out.println(C==D);
        
        System.out.println("-------------------");
        //!=(Eşit değil mi operatörü)
        System.out.println(A!=D);
        System.out.println(A!=C);
        System.out.println(C!=B);
        
        System.out.println("-------------------");
     // > Büyüktür Operatörü

        System.out.println(A > D);
        System.out.println(D > C);
        System.out.println(C > B);

        System.out.println("-------------------");
  // >= Büyük-Eşittir Operatörü

        System.out.println(A >= D);
        System.out.println(A >= C);
        System.out.println(C >= B);

        System.out.println("-------------------");
  // <  Küçüktür Operatörü

        System.out.println(A < D);
        System.out.println(D < C);
        System.out.println(C < B);

        System.out.println("-------------------");
    // <= Küçük-Eşittir Operatörü

        System.out.println(A <= D);
        System.out.println(A <= C);
        System.out.println(C <= B);
	}

}
