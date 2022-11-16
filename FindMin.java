public class FindMin {

	static int arr[] = {10,42,453,566,643,132,54,23,64};
	
	static int min() {
		
		int min = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
	
	public static void main(String[] args) {
		System.out.println("The maximum element is the " + min());
	}
}