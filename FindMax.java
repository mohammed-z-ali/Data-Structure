
public class FindMax {

	static int arr[] = {10,42,453,566,643,132,54,23,64};
	
	static int max() {
		
		int max = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		System.out.println("The maximum element is the " + max());
	}
}
