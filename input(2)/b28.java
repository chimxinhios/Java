Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
a = a + b;
b = a - b;
a = a - b;
System.out.println("after swapping, a = " + a + ", b = " + b);