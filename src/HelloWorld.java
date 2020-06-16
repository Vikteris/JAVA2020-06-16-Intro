import java.math.BigInteger;

public class HelloWorld {

    public static void main(String[] args) {

        byte b = 0b01001111;
        short s = 0b0111_1001_0001_1000;
        int i = 0xaf | 2 & 0b111;
        long l = s;

        char c = 'A';     // 16bit - arba 2byte

        c = 'Ž';
        char c2 = '\u2655';
        char c3 = '\'';
        char c4 = '\\';

        char c5 = (char) (c4 + 1);

        String text = 5 + 123.45 + " Afrika '" + c2 + "' \n ir \t Europa\\Azija  \"Microsoft\" " +
                (100 + 4); // ... 104
        System.out.println(text);
        System.out.println("123" + 4);

        String textNieko;


        /*

            bitas - 0 arba 1

            0 - 0
            1 - 1
            2 - 10
            3 - 11
            4 - 100
            5 - 101
            6 - 110
            7 - 111
            8 - 1000
            9 - 1001
           10 - 1010
           15 - 1111
           16 - 10000
           ...

           0011 +
           0001
           ----
           0100

           Sesioliktaine sistema
           0, 1, 2, 3, 4, 5, 6, 7, 8, 9, a, b, c, d, e, f

           0..9 = 0..9
           10   = a
           11   = b
           15   = f
           16   = 10
           31   = 1f = 0001 1111
                  a6 = 1010 0110

         */

        float f = 0.0f;
        double d = 123.4;

        System.out.println(d / f);

        boolean boo = true;
        boolean boo2 = !(2 > 3);
        boolean boo3 = boo || (boo2 && 10 < 9);


        System.out.println(boo2);
        System.out.println(boo3);


        System.out.println("Hello World");
        System.out.println("Labutis");
        System.out.println(123);


        //
        //Priskirimai
        //

        //  i1=0x2000->100
        //  i2->0x2008 ->100
        //
        //
        int i1 = 100;
        int i2 = 11;
        i1 = 200;
        System.out.println(i2); // i2=100//


        //
        //  RAM : 0x1ADD -> [10, 20, 30]
        //  i3 -> 0x2000 -> Ax1ADD
        //  i4 ->0x2004 -> 0x1ADD
        //


        int[] i3 = {10, 20, 30};
        int[] i4 = i3;
        i3[0] = 9;

        for (int index = 0; index < i4.length; index++) {
            System.out.print(i4[index] + " ");
        }
        System.out.println();
        //0 1 2
        int[] i5 = new int[3];
        i5[2] = 99;
        for (int index = 0; index < i5.length; index++) {
            System.out.print(i5[index] + " ");
        }
        System.out.println();

        int[][] m1 = {{10, 11, 12},// m1[0]      //int[][] masyvas idetas i masyva. masyvu masyvas
                {22, 23, 24},// m1[1]
                {30, 31}    // m1[2]
        };
        System.out.println("m1 masyvo ilgis yra: " + m1.length);
        for (int eilutesIndex = 0; eilutesIndex < m1.length; eilutesIndex++) {
            //TODO atspausdinti eilute
            int[] eilute = m1[eilutesIndex];
            for (int stulpelioIndex = 0; stulpelioIndex < eilute.length; stulpelioIndex++) {
                System.out.print(eilute[stulpelioIndex] + " ");
            }
            System.out.println();
        }


//        int[] m2 = m1[i];
//        int m12 = m2[2]; //24
//        m12 = m1[1][2]; //24
//        System.out.println(m12);
//
//        int[][] m3 = new int[3][];
//        m3[0] = new int[3];
//        m3[1] = new int[3];
//        m3[2] = new int[2];
//
//        m3[2][1] = 31;


        //
        //
        //CIKLAI
        //
        //
        // for each ciklas
        for (int[] eilute : m1) {
            for (int element : eilute) {
                System.out.println(element + " ");
            }
            System.out.println();
        }

        // ++x - padideja vienetu
        // x++ - padideja vienetu
        // --x - sumažėja vienetu
        // x-- - sumažeja vienetu
        int ind = 10;
        while (--ind > 0) { // 2 >0, 1>0, 0?0 tai ciklas važiuos du kartus
            System.out.println(Math.random());
        }
        System.out.println("---------------------------");

        //langeliu 64. parašyt progrmama kiek reik padet grudu ant sachamtu lentos  IŠ VISO. Reikia kintamojo tuščio
        // ir kintmaojo, kuris kistu skaičiuojant pridedant grudus su lentelem

        // Reikia kintamojo (langelis) kuriama sumuosis

        //reik nurodymo kad pasakytu kiek  praždioj langelis vienas atitinka grudu

        // valydavimas tai reikia kad prie esančios grudu ir
        // langeliu sumos pridedu padvigubinta su šalia esančiu langeliu sumaw

                BigInteger grainAmmount = BigInteger.valueOf(1);
                for (int langelis=1; langelis <= 3; langelis++) {
                    grainAmmount = grainAmmount.multiply(BigInteger.valueOf(2));
                }
                System.out.println("How much grains inventor do have?: " + grainAmmount);


                BigInteger grainAmmountFull = BigInteger.valueOf(1);
                for (int langelis=1; langelis <= 64; langelis++) {
                    grainAmmountFull = grainAmmountFull.multiply(BigInteger.valueOf(2));
                }
                System.out.println("How much grains inventor do have?: " + grainAmmountFull);
//
//
//
//
//                  1-1
//                  2-2
//                    5-16
//        ....

//                n - 2^n;
//                ------------
//                0- 1
//                1- 1 + 2 = 3 = 2^2-1
//                2- 3 + 4= 7 = 2^3-1
//                3 - 7 + 8 = 15 = 2^4-1
//                ....
//                n  = 2^n-1

    }

    }



