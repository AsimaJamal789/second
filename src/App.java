import java.util.Scanner;

public class App {
    // Convert Kilometers in Meters
    public static void main(String[] args) {

        System.out.println("Enter kilometers:");

        Scanner in = new Scanner(System.in);
        float kilometers = in.nextFloat();

        float meters = kilometers / 1000;

        System.out.println(meters + "meters");

    }
}
