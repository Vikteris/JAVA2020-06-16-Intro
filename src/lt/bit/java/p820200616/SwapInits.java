package lt.bit.java.p820200616;

import java.util.Arrays;
public class SwapInits {

    public static void main(String args[]) {
        int [] numberLine = {2, -3, 4, -1, 5};
        int firstNumber = 1;
        int fourth = 4;
        int [] myArr = {2, -3, 4, -1, 5};
        int line = myArr[firstNumber];

        myArr[firstNumber] = myArr[fourth];
        myArr[fourth] = line;

        System.out.println(Arrays.toString(numberLine));
        System.out.println(Arrays.toString(myArr));
    }

}
