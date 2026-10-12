package basics;
iimport java.util.Scanner;

class Age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");
        int age = sc.nextInt();

        if (age < 18) {
            System.out.println("Not eligible for anything");
        } else if (age >18) {
            System.out.println("Can vote and drive");
        } else if (age<25) {
            System.out.println("Can vote, drive and marry");
        } else {
            System.out.println("can do anything");
        }
    }
}