package Pratik;

public class OrtalamaBulma {

	public static void main(String[] args) {
		
		int[] list={ 10,4,8,8,6,24};
		double sum=0.0;
		
		
		for(int i=0;i<list.length;i++) {
			sum+=list[i];
		}

		double average=sum/list.length;
		System.out.println(average);
	}

}
