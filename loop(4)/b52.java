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