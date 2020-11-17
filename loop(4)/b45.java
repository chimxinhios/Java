Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
int sum = 0;
if(a<b ){
    for(int i = a; i <= b;i++){
        sum += i;
    }
} else if ( b < a){
for(int i =b; i <= a;i++ ){
sum += i;
}
}
System.out.println(sum);