
public class Main {

	static boolean isPalindrom(int number) {
		int temp = number, reverseNumber = 0, lastNumber;
		while (temp != 0) {
			lastNumber = temp % 10;
			reverseNumber = (reverseNumber * 10) + lastNumber;
			temp /= 10;

		}
		if (number == reverseNumber) {
			System.out.println(number+ " Palindrom sayıdır");
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// iki taraftanda okunuşu aynı

		System.out.println(isPalindrom(101));

	}

}
