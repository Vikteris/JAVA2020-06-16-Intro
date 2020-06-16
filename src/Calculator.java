import java.util.Objects;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args){
        System.out.println("Calculator");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number");
        int pirmas = scanner.nextInt();

        System.out.print("Enter second number");
        int antras = scanner.nextInt();

        System.out.print("Iveskite operacija (+ - * / %): ");
        String operacija = scanner.next();

        int rezultatas = Calculator.calc(operacija, pirmas, antras);

        System.out.print(pirmas + " " + operacija + " " + antras + " = " + rezultatas);
    }
    //čia galiu kurti naujus kitus savo metodus/ funkcijas

    //kai classeje yra pagrindinis metodas,ir  darant kita, kuriamae bus itraukiama informacija
    // is ankstesniuju metodu/fukciju, užtenka parašyti tik static
    static int calc(String operaci, int p1, int p2) {
        int rezultatas = 0;

        if (Objects.equals(operaci, "+")) {
            rezultatas = p1 + p2;
        } else if (Objects.equals(operaci, "-")) {
            rezultatas = p1 - p2;
        } else if (Objects.equals(operaci, "*")) {
            rezultatas = p1 * p2;
        } else if (Objects.equals(operaci, "/")) {
            rezultatas  = p1 / p2;
        }else if (Objects.equals(operaci, "%")) {
            rezultatas  = p1 % p2;
        }
         return rezultatas;
    }

}

//Scanneris turi skirtingus metodus. ju daug
//