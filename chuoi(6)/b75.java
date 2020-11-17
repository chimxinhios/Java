Scanner sc = new Scanner(System.in);
String s = sc.next();
String a = "";
for(int i = s.length() - 1; i>= 0; i--){
    a += s.charAt(i);
}
System.out.print(a);