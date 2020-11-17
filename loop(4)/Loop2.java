import java.util.Scanner;

public class Loop2 {
	public static void main(String[] args) {
/*
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n <= 100) {
			if(n%2 == 0){
				System.out.print(n + " ");
				
			}
			n++;
		}
*/
/*
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int uocso = 0;
		int i = 1;
		while(i <= n){
         if( n % i == 0){
			 uocso++;
		 } 
		 i++;
		}
		System.out.println(uocso);
*/
/*
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = 1;
		while(b > 0){
			c *= a;
			b--;
		}
		System.out.println(c);
*/
/*
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a > b){
			a = a + b;
			b = a - b;
			a = a - b;
		}
		while(a < b){
			if( a % 3 == 0 && a % 5 == 0){
				System.out.print(a + " ");
			}
			a++;
		}
*/
/*
		for (int i = 1; i <= 100; i++) {
			if(i > 50){
				break;
			}
			System.out.print(i + " ");
		}
*/
/*
		for (int i = 1; i <= 100; i++) {
			if(i % 2 == 0){
				continue;
			}
			System.out.print(i + " ");
		}
*/
/*
		int i = 1;
		do {
			System.out.print(i + " ");
			i++;
		} while (i <= 5);
*/
/*
	    int i = 1;
	    do {
	     if( i < 10 ){
			 i = 10;
		 }
		 System.out.print(i + " ");
		 i += 10;
	    } while (i <= 1000);
*/


	}
}
