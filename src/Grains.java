import java.util.Scanner;

public class Grains {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long mainNr = 2;

        System.out.print("Please enter number of squares: ");
        long squares = scanner.nextInt();

        long result = (long) Math.pow(mainNr, squares - 1);
        System.out.println( squares + " has " + result + " grains of rice.");
    }
}
//18446744073709551616

