import java.util.Scanner;

public class Method {

/*
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print(sumOfArray(arr));
	}

	public static int sumOfArray(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length;i++){
         sum += arr[i];
		}
		return sum;
	}
*/
/*
	public static void show(int[] arr){
		for(int i = 0; i < arr.length;i++){
			if (arr[i] % 3 == 0 && arr[i] % 5 != 0) {
				System.out.print(arr[i] + " ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		show(arr);
	}
*/
/*
	public static void show(String[] arr){
		for(int i = 0; i< arr.length;i++){
			if(arr[i].length() > 3){
				System.out.print(arr[i] + " ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] arr = new String[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.next();
		}
		show(arr);
	}
*/
/*
		int max = a;
		if(c > max){
			max = c;
		}
		if(b > max){
			max = b;
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		System.out.print(max3(a, b, c));
	}
*/
/*
	public static double circumference(double r){
		return 2 * r * 3.14;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		System.out.print(circumference(r));
	}
*/
/*
	public static int factorial(int n) {
	    if (n == 1) return 1;
	    return n * factorial(n-1);
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(factorial(n));
	}
*/
/*
	public static int sumOfArray(int[] arr, int n) {
		if (n == 1) return arr[0];
		return arr[n - 1] + sumOfArray(arr, n - 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print(sumOfArray(arr, n));
	}
*/




}