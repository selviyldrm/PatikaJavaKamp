
public class Ornek2 {
	static int sum(int a,int  b) {
		return a+b;
	}
	
	static void sum2(int c,int d) {
		int result=c+d;
		System.out.println(result);
	}

	 static void show()
	    {
	        System.out.println("Show metodu..");
	        return;
	    }
	public static void main(String[] args) {

		System.out.println(sum(12,34));

		int result= sum(3,4)+sum(5,6);
		System.out.println(result);
		
		sum2(7,8);
		show();
	}

}
