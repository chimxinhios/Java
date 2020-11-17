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