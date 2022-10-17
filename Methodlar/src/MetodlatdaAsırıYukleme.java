
public class MetodlatdaAsırıYukleme {

	static void print() {
		System.out.println("Parametresiz methot");
	}

	static void print(int a) {
		System.out.println("Parametreler: "+a);
	}
	static void print(double a) {
		System.out.println("Parametreler: "+a);
	}
	static int print(int a,int b) {
		return a+b;
	}
	static int print(int a,int b,int c) {
		return a+b+c;
	}
	
	
	public static void main(String[] args) {
		
		print();
		print(7);
		print(12.0);
        System.out.println(print(8,9));
        System.out.println(print(8,9,10));
	}

}
