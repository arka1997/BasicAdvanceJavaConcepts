package stringsDemo;

import java.util.Scanner;

public class DuplicateElementa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size");
		int len = sc.nextInt();
		int[] arr = new int[len];
		System.out.println("enter the elements");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
//		2 3 2 4 5 6 7 6  223456677
		DuplicateElementa a1 = new DuplicateElementa();
		arr = a1.sortArr(arr);
		int temp[] = new int[len];
		int j=0;
		for(int i=1;i<arr.length-1;i++) {
			if(arr[i] != arr[i+1]) {
				temp[j++] = arr[i];//storing only the unique values in another array
			}
		}
		//storing the last element in the last index of temp array.the last elemnt would be printed, because the second last elemnt will be checked with the last one, if both are same, then sexond last is ignored, and loop increments by 1, but condition ends. so after getting out of the loop just print the last elemnt, as its duplicates value were ignored previously
		temp[j++] = arr[len-1];
		for(int k=0;k<j;k++) {
			System.out.println(temp[k]);
		}
	}
	public int[] sortArr(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
}

//MY LOGIC
//public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	System.out.println("enter array size");
//	int len = sc.nextInt();
//	int[] arr = new int[len];
//	System.out.println("enter the elements");
//	for(int i=0;i<arr.length;i++) {
//		arr[i] = sc.nextInt();
//	}
////	2 3 2 4 5 6 7 6  22345667
//	DuplicateElementa a1 = new DuplicateElementa();
//	arr = a1.sortArr(arr);
//	int temp[] = arr;
//	for(int i=1;i<arr.length-1;i++) {
//		if(arr[i] != arr[i+1]) {
//			System.out.println(arr[i]);
//		}
//	}
//	if(temp[arr.length-1] != temp[arr.length-2]) {
//		System.out.println(temp[arr.length-1]);
//	}
//}
