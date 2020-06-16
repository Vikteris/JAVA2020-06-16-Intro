package lt.bit.java.p820200616;

import java.util.Scanner;
public class PerfectNumbers {

    public static Scanner sc;

    public static void main(String[] args) {
//        int i, Number, Minimum, Maximum, Sum = 0;
//        sc = new Scanner(System.in);
//
//        System.out.println("Please Enter the Minimum Value: ");
//        Minimum = sc.nextInt();
//
//        System.out.println("Please Enter the Maximum Value: ");
//        Maximum = sc.nextInt();
//
//        for (Number = Minimum; Number <= Maximum; Number++) {
//            for (i = 1, Sum = 0; i < Number; i++) {
//                if (Number % i == 0) {
//                    Sum = Sum + i;
//                }
//            }
//            if (Sum == Number) {
//                System.out.format("%d \t", Number);
//            }
//        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("rasykite skaiciu: ");
        int maxSkaicius = scanner.nextInt();

        System.out.println("Ieskome tobulu skaciu nedidesniu uz " +maxSkaicius);

//        long start = System.currentTimeMillis();

        int testingNumber = 1;
        while(testingNumber <= maxSkaicius){
            if (doNumberPerfect(testingNumber)) {
                System.out.println("Radau!!"+ testingNumber);
            }
            testingNumber ++; //testingNumber +=1; testingNumber  = testingNumber +1
        }
//        long stop = System.currentTimeMillis();
//        System.out.println("VYykdymo trukme: "+ (stop - start) + "ms");
          /*
           n - n * n
           10 = 10 * 10 >100
           padiidnus 10 laikas padideja 100 kartu
           */

    }
    private static boolean doNumberPerfect(int testingNumber ) {
        int suma =1;
        int riba = (int) Math.sqrt(testingNumber);
        for (int i=2; i<=riba; i++){
            if (testingNumber % i==0){
                suma+=(i + testingNumber / i);
            }
        }
        if (suma==testingNumber) return true;
        else return false;

    }
}