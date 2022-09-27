
public class EnKucukSayi {

	public static void main(String[] args) {

		int a = 10, b = 10, c = 10;

		if (a < b && a < c) {
			System.out.println("a en küçük sayıdır.");
		} else if (b < a && b < c) {
			System.out.println("b en küçük sayıdır.");
		} else if (c < a && c < b) {
			System.out.println("c en küçük sayıdır.");
		} else {
			System.out.println("Sayılar birbirine eşittir");
		}
		int var1 = 5;
		int var2 = 6;
		if ((var2 = 1) == var1)
		    System.out.print(var2);
		else
		    System.out.print(++var2);
	}

}
