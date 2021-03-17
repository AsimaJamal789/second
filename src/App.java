import java.util.Scanner;

public class App {
    // Convert Kilometers in Meters
    public static void main(String[] args) {

        System.out.println("Enter kilometers:");

        Scanner con = new Scanner(System.in);
        float kilometers = con.nextFloat();

        float meters = kilometers / 1000;

        System.out.println(meters + "meters");

    }
}
