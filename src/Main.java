import java.util.Scanner;
public class Main{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String message;

        System.out.print("Type a message: ");
        message = scanner.nextLine();

        original(message);
        upperCase(message);
        lowerCase(message);

        scanner.close();
    }
    static void original(String message){
        System.out.println("Original: " + message);
    }

    static void upperCase(String message){
        System.out.println("Uppercase: " + message.toUpperCase());
    }
    static void lowerCase(String message) {
        System.out.println("Lowercase: " + message.toLowerCase());
    }
}