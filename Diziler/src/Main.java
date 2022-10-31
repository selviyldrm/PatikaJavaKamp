
public class Main {

//	public static void printArray(double[] array) 
//	{
//	   for (int i = 0; i < array.length; i++) 
//	   {
//	      System.out.print(array[i] + " ");
//	   }
//	}

	public static void main(String[] args) {

        //Dizi Tanımlamaları 
		// double[] myList;
		// double myList[];
	//	double[] myList = new double[10]; // max 10 elemanlı dizi
		
//		double[] myList= {1.2 , 2.3 , 3.4 , 4.5};
//		
//		for(int i=0;i<myList.length;i++) {
//			System.out.println(myList[i]+ " ");
//		}
//		printArray(myList);
//	
		
		int cars[], count=3;
		cars = new int[count];
		for(int i=0; i<cars.length; i++)
		    cars[i] = (i+1)*2;
		for(int j=0; j<cars.length; j++)
		    System.out.print(cars[j] + ",");
	}

}
