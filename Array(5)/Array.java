import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		for(int i = 0; i < 10; i++){
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i < 10; i++){
			System.out.print(arr[i] + " ");
		}
		*/
/*
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		int[] a = new int[n];
		int max = 0;
		for(int i = 0; i < n;i++){
			a[i] = sc.nextInt();
			if(a[i] > max){
				max = a[i];
			}
		}
		System.out.println(max);
*/
/*
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int sum = 0;
		for(int i = 0;i < n;i++){
			arr[i] = sc.nextInt();
			if(i == 0 || i == n-1){
				sum += arr[i];
			}
		}
		System.out.println(sum);
*/
/*
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i = 0;i < n;i++) {
			if(arr[i] % 2 == 0) {
				System.out.print(arr[i] + " ");
			}
		}
*/
/*
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		
	int count = 0;
		for(int i=0;i<n;i++) {
			if(arr[i] == k) {
				count++;
			}
		}
		System.out.print(count);
*/
/*
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int ans = 0;
		for (int i = 0; i < n; i++) {
			if(arr[i] % 2 != 0 && arr[i] > 0) {
				ans += arr[i];
			}
		}
		System.out.print(ans);
*/
/*
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			if (arr[i] >= 0 && arr[i] <= 10) {
				System.out.print(arr[i] + " ");
			}
		}
*/
// 66 ......
/*
		Scanner sc = new Scanner(System.in);
				int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

	    for (int i = 0; i < n; i++) {
	        for (int j = i + 1; j < n; j++) {
	            if (arr[i] > arr[j]) {
	               
	                int t = arr[i];
	                arr[i] = arr[j];
	                arr[j] = t;
	            }
	        }
	    }
	    
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
*/
/*
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
        int sum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
				sum += arr[i][j];
			}
		}
System.out.print(sum);
*/
/*
		Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		int sum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (arr[i][j] % 5 == 0) {
					sum += arr[i][j];
				}
			}
		}
		System.out.print(sum);
*/
/*
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		System.out.print(s1.indexOf(s2));
*/
/*
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		for(char c = '0'; c <= '9';c++) {
			s = s.replace(c + "", "");
		}
		System.out.println(s);
*/
/*
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String a = "";
		for(int i = s.length() - 1; i>= 0; i--){
			a += s.charAt(i);
		}
		System.out.print(a);
*/
// thiếu 72-74.

	}
}