package arrayQA;

public class bubblesort {

	
	public static void print(int[] arr) {
		for(int e : arr) {
			System.out.print(e+" ");
		}
	}
	public static void main(String[] args) {
		int[] arr =  {22,34,223,34,45,23};
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
	}
		print(arr);

}
}
