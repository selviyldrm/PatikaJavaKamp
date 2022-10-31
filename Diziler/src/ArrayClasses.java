import java.util.Arrays;

public class ArrayClasses {

	public static void main(String[] args) {

		int[] list = { 1, 2, 3, 4 };
		double[] list2 = { 5, 42, 33, 48, 54, 75,89,87 };

//		HelperArray help=new HelperArray();
//		help.print(list);
//		System.out.println();
//		help.print(list2);
		// Arrays.fill(list, 10);
		// Arrays.fill(list2, 2,6, 10.0);
//		Arrays.binarySearch(list2, 42.0);
//		Arrays.sort(list2);
//		System.out.println(Arrays.toString(list));
//		System.out.println(Arrays.toString(list2));

		Arrays.sort(list2);
		System.out.println(Arrays.binarySearch(list2, 54));
		
		double[] copyArray = Arrays.copyOf(list2, 3);
		System.out.println(Arrays.toString(copyArray));
		
		double[] copyOfRangeArray = Arrays.copyOfRange(list2, 0,5);
        System.out.println(Arrays.toString(copyOfRangeArray));
        
        int[] list1 = {1, 2, 3};
        int[] listt2 = {1, 2, 3};
        int[] list3 = {1, 2, 10};
        
        System.out.println(Arrays.equals(list1, listt2));
        System.out.println(Arrays.equals(listt2, list3));
	}

}
