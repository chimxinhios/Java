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