package week1.day2;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		int[] data = {3,2,11,4,6,7};
		Arrays.sort(data);
		int secondLargestNum = data[data.length-2];
		
		System.out.println("The second largest number in the array is " + secondLargestNum);
		

	}

}
