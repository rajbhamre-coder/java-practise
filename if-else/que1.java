
public class que1 {
    public static void main(String[] args) {
        int num = 14;   // change this number as needed
        int steps = 0;

        while (num > 0) {
            steps++;
            if (num % 2 == 0) {
                System.out.println("Step " + steps + ") " + num + " is even; divide by 2 and obtain " + (num / 2) + ".");
                num /= 2;
            } else {
                System.out.println("Step " + steps + ") " + num + " is odd; subtract 1 and obtain " + (num - 1) + ".");
                num -= 1;
            }
        }

        System.out.println("Total steps: " + steps);
    }
}