package arrayQA;

public class sort012s {

	public static void swap(int[] arr,int a, int b) {
		int temp =arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	
	public static void print(int[] arr) {
		for(int e : arr) {
			System.out.print(e+" ");
		}
	}
	public static void main(String[] args) {
		int[] arr = {0,1,1,0,2,2,1,0};
		int n = arr.length;
		
		int low = 0,mid=0;
		int high = n-1;
		while(mid<=high) {
			if(arr[mid]==0) {
				swap(arr,low,mid);
				low++;
				mid++;
			}else if(arr[mid]==1) {
				mid++;
			}else {
				swap(arr,mid,high);
				high--;
			}
		}
		print(arr);
	}

}
