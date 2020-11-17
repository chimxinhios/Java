Scanner scanner = new Scanner(System.in);
int x = scanner.nextInt();
int y = scanner.nextInt();
if(x > 0){
    if(y > 0){
        System.out.println("This point lies in the First quadrant");
    } else {
        System.out.println("This point lies in the Fourth quadrant");
    }
} else {
    if (y < 0){
        System.out.println("This point lies in the Third quadrant");
    } else {
        System.out.println("This point lies in the Second quadrant");
    }
}