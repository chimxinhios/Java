Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int sum = 0;
for(int i = 1; i <= n; i += 2){
 sum += i;
}
System.out.println(sum);