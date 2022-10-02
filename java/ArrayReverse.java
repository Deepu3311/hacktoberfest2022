import java.util.Scanner;

public class ReverseArrayEfficentWay {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}

		int left = 0;
		int right = n - 1;
		while (left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
		System.out.println("Reverse of Input Array is :");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + "  ");
		}
		scan.close();
	}

}
