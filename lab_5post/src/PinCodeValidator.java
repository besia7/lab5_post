import java.util.Scanner;

public class PinCodeValidator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int attempts = 5;
        boolean pinCodeMatched = false;

        for (int i = 1; i <= attempts; i++) {
            System.out.println("Enter the PIN code that you received:");
            String receivedPin = sc.nextLine();
            System.out.println("Enter the PIN code you entered:");
            String enteredPin = sc.nextLine();

            if (receivedPin.equals(enteredPin)) {
                pinCodeMatched = true;
                System.out.println("CORRECT");
                break;
            } else {
                System.out.println("INCORRECT " + i);
            }
        }

        if (!pinCodeMatched) {
            System.out.println("Error");
        }
    }
}

