package arrayQA;

public class reverseArray {


	public static void print(int[] arr) {
		for(int e : arr) {
			System.out.print(e+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		 int[] arr = {12,342,222,2,2,3,232,3,3};
		 System.out.println("Previous array - ");
		       print(arr);
		        for (int i = 0; i < arr.length / 2; i++) {
		            int temp = arr[i];
		            arr[i] = arr[arr.length - i - 1];
		            arr[arr.length - i - 1] = temp;
		        }
		        System.out.println("After reverse - ");
		        print(arr);

	}

}
