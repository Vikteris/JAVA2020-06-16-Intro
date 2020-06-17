package lt.bit.java.p920200617.mokiniaiUžd;

import com.sun.xml.internal.bind.v2.TODO;
import lt.bit.java.p920200617.namai.Lempute;

public class Mokinys {


    static int mokiniuSkaicius = 5;
    static Mokiniaiinf[] mokiniai = new Mokiniaiinf[mokiniuSkaicius];


    public static void main(String[] args) {

        Mokiniaiinf mokinys1 = new Mokiniaiinf();

        mokinys1.vardas = "Jonas";
        mokinys1.pavarde = "Jonaitis";
        mokinys1.klase = 1;
        mokiniai[0] = mokinys1;

        Mokiniaiinf mokinys2 = new Mokiniaiinf();

        mokinys2.vardas = "Ona";
        mokinys2.pavarde = "Onaite";
        mokinys2.klase = 2;
        mokiniai[1] = mokinys2;

        Mokiniaiinf mokinys3 = new Mokiniaiinf();

        mokinys3.vardas = "Petras";
        mokinys3.pavarde = "Jonaitis";
        mokinys3.klase = 1;
        mokiniai[2] = mokinys3;

        Mokiniaiinf mokinys4 = new Mokiniaiinf();

        mokinys4.vardas = "Jurgita";
        mokinys4.pavarde = "Jurgaite";
        mokinys4.klase = 1;
        mokiniai[3] = mokinys4;

        Mokiniaiinf mokinys5 = new Mokiniaiinf();

        mokinys5.vardas = "Antanas";
        mokinys5.pavarde = "Antanaitis";
        mokinys5.klase = 2;
        mokiniai[4] = mokinys5;

        print(0);
        print(1);
        print(2);
        print(3);
        print(4);
    }
    //Rušiavimas
    // element sukeitimas
    //TODO liko surikiuoti palei klases, palei pavardes, ir palie vardus
    //Puse darbo lyg ir padariau. bandžiau su ciklu išgaudyt, bet kažka ne taip padarydavau


    static void print(int index) { //Spausdinimas
        System.out.println(mokiniai[index].vardas + " " +
                mokiniai[index].pavarde + " " +
                mokiniai[index].klase);
    }
}