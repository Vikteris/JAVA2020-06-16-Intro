package lt.bit.java.p820200616;

import java.util.Arrays;

public class MasyvoMinMaxReiksme {

    public static void main(String[] args) {
        int[] skaiciai = {2, -3, 4, -1, 5};

        System.out.println(Arrays.toString(skaiciai));

        int maziausias = skaiciai[0];
        int didziausias = skaiciai[0];

        int minI = 0;
        int maxI = 0;

        for (int i = 0; i < skaiciai.length; i++) {
            if (skaiciai[i] < maziausias) {
                maziausias = skaiciai[i];
                minI = i;
            }
            if (skaiciai[i] > didziausias) {
                didziausias = skaiciai[i];
                maxI = i;
            }
        }
        int reiksme = skaiciai[maxI];
        skaiciai[maxI] = skaiciai[minI];
        skaiciai[minI] = reiksme;

        System.out.println(Arrays.toString(skaiciai));
        System.out.println("Maziausias skaicius: " + maziausias);
        System.out.println("Didziausias skaicius: " + didziausias);

    }
}

//public class lt.bit.java.p820200616.SwapInits {
//
//    public static void main(String args[]) {
//        int [] numberLine = {2, -3, 4, -1, 5};
//        int firstNumber = 1;
//        int fourth = 4;
//        int [] myArr = {2, -3, 4, -1, 5};
//        int line = myArr[firstNumber];
//
//        myArr[firstNumber] = myArr[fourth];
//        myArr[fourth] = line;
//
//        System.out.println(Arrays.toString(numberLine));
//        System.out.println(Arrays.toString(myArr));
//    }
//
//}