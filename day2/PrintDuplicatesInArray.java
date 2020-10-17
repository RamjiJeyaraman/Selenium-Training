package week1.day2;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		int len = arr.length;
		
		System.out.println("Duplicate Numbers in this array : ");
		
		for (int i = 0; i < len; i++) {
			int count = 0;
			
			for (int j = 0; j < len; j++) {
				
			if (arr[i] == arr[j]) {
				count = count +1;
			} else {
				continue;
			}
		}
			
		if (count > 1 ) {
			System.out.println( arr[i]);
		}

	}

}
}
