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