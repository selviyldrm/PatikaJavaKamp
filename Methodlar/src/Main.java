
public class Main {
	static void helloWorld() {
		System.out.println("Hello World");
	}

	static int power(int base,int exp) {
		int result=1;
		for(int i=1;i<=exp;i++) {
			result*=base;
		}
		return result;
	}

    static int run(int x) {
        x = 10;
        return x;
    }
	
    
	public static void main(String[] args) {
		int x = 25;
        System.out.println(run(5));
		
		helloWorld();
		System.out.println(power(2,3));
		System.out.println(power(6,2));

		/*
		  int base=2,exp=3, result=1;
		
		for(int i=1;i<=exp;i++) {
			result*=base;
		}
		System.out.println(result);
		
		 base=5;
		 exp=2; 
		 result=1;
			for(int i=1;i<=exp;i++) {
				result*=base;
			}
			System.out.println(result);*/
	}

}
