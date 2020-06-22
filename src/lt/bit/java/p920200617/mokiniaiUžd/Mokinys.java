//package lt.bit.java.p920200617.mokiniaiUžd;
//
//import java.util.*;
//
//public class Mokinys {
//
//    static int mokiniuSkaicius = 5;// kuria pointeriai i kiek reikšmiu, šiuo atveju mokiniai, 5 reikšmes/mokiniia total
//    static MokiniaiInf[] mokiniai = new MokiniaiInf[mokiniuSkaicius];
//
//    public static void main(String[] args) {
//        ivestiPradiniusDuomenis();
//        print("Pradiniai duomenys:");
//
//        pagalKlase();
//        print("Sulygiuota pagal klase:");
//
//        pagalVarda();
//        print("Lygiuot pagal varda:");
//
//        pagalKlasePavardeVarda();
//        print("Lygiuot pagal klase, pavarde ir varda");
//
//        pagalVardaPavardeKlase();
//        print("Lygiuot pagal varda, pavarde ir klase");
//
//
//
//        print("Demo spausdinimas: " + Arrays.toString(mokiniai));
//
//        }
//
//
//
////    public  String pilnasVardas(){
////        return (this.vardas == bull? + " " : this vardas) +" "+
////                (this.pavarde== null? : this.pavarde);
////    }
//
//    static void ivestiPradiniusDuomenis() {
//        MokiniaiInf mokinys1 = new MokiniaiInf(); // konstruktorius kviečiam su new, nurodom klase ir pn, defaultinis konstruktoerius buna new...() <- cia defaultinis
//        mokinys1.setKlase(1);
//        mokinys1.setVardas() = "Jonas";
//        mokinys1.setPavarde(); = "Jonaitis";
//        mokinys1.setTrimestras = new int[8, 10, 9, 9, 10, 9];
//        mokiniai[0] = mokinys1;
//
//        MokiniaiInf mokinys2 = new MokiniaiInf();
//        mokinys2.klase = 2;
//        mokinys2.vardas = "Ona";
//        mokinys2.pavarde = "Onaite";
//        mokiniai[1] = mokinys2;
//
//        MokiniaiInf mokinys3 = new MokiniaiInf();
//        mokinys3.klase = 1;
//        mokinys3.vardas = "Petras";
//        mokinys3.pavarde = "Jonaitis";
//        mokiniai[2] = mokinys3;
//
//        MokiniaiInf mokinys4 = new MokiniaiInf();
//        mokinys4.klase = 1;
//        mokinys4.vardas = "Jurga";
//        mokinys4.pavarde = "Jurgaite";
//        mokiniai[3] = mokinys4;
//
//        MokiniaiInf mokinys5 = new MokiniaiInf();
//        mokinys5.klase = 2;
//        mokinys5.vardas = "Antanas";
//        mokinys5.pavarde = "Antanaitis";
//        mokiniai[4] = mokinys5;
//    }
//
//    static void print(int indeksas) {
//        System.out.println(mokiniai[indeksas].getKlase() + " " +
//                mokiniai[indeksas].getVardas() + " " +
//                mokiniai[indeksas].getPavarde());
//        //
//        mokiniai[indeksas].pilnasVardas();
//
//    }
//
//    static void print(String title) {
//        System.out.println();
//        System.out.println(title);
//        for (int i = 0; i < mokiniai.length; i++) {
//            print(i);
//        }
//    }
//
//
//
//    /*
//     indeksas: 0  1  2 3 4 5
//     korta:    4  8  5 7 1 2
//     0:        1* 8  5 7 4 2
//     1:        1  2* 8 7 5 4
//     0. Turime is kortu nuo 0 iki 5 isrinkti maziausia ir padeti ja i 0 (!) pozicija
//     1. Turime is kortu nuo 1 iki 5 isrinkti maziausia ir padeti ja i 1 pozicija
//     ...
//     n. Turime is kortu nuo n iki 5 isrinkti maziausia ir padeti ja i n pozicija
//     */
//
//    }
//    static void sukeiciamMokinius(int i, int j) {
//        MokiniaiInf mokinys = mokiniai[i];
//        mokiniai[i] = mokiniai[j];
//        mokiniai[j] = mokinys;
//    }
//
//    static void pagalKlase() {
//        for (int zingsnis = 0; zingsnis < mokiniai.length - 1; zingsnis++) {
//
//            for (int i = zingsnis; i < mokiniai.length; i++) {
//
//                if (mokiniai[i].klase < mokiniai[zingsnis].klase) {
//                    // mokiniai[i] <-> mokiniai[zingsnis]
//                    sukeiciamMokinius(i, zingsnis);
//                }
//            }
//        }
//    }
//
//    static void pagalVarda() {
//        for (int zingsnis = 0; zingsnis < mokiniai.length - 1; zingsnis++) {
//
//            for (int i = zingsnis; i < mokiniai.length; i++) {
//
//                if (mokiniai[i].vardas.compareTo(mokiniai[zingsnis].vardas) < 0) {
//                    // mokiniai[i] <-> mokiniai[zingsnis]
//                    sukeiciamMokinius(i, zingsnis);
//                }
//            }
//        }
//     }
//
//    static void pagalKlasePavardeVarda() {
//        for (int zingsnis = 0; zingsnis < mokiniai.length - 1; zingsnis++) {
//
//            for (int i = zingsnis; i < mokiniai.length; i++) {
//
//                if (mokiniai[i].klase < mokiniai[zingsnis].klase) {
//                    sukeiciamMokinius(i, zingsnis);
//
//                } else if (mokiniai[i].klase == mokiniai[zingsnis].klase) {
//                    if (mokiniai[i].pavarde.compareTo(mokiniai[zingsnis].pavarde) < 0) {
//                        sukeiciamMokinius(i, zingsnis);
//
//                    } else if (mokiniai[i].pavarde.compareTo(mokiniai[zingsnis].pavarde) == 0) {
//                        if (mokiniai[i].vardas.compareTo(mokiniai[zingsnis].vardas) < 0) {
//                            sukeiciamMokinius(i, zingsnis);
//                        }
//                    }
//                }
//            }
//        }
//    }
//
//    static void pagalVardaPavardeKlase() {
//        Arrays.sort(mokiniai, (m1, m2) -> {
//            int pagalVarda = m1.vardas.compareTo(m2.vardas);
//            if (pagalVarda != 0) return pagalVarda;
//
//            int pagalPavarde = m1.pavarde.compareTo(m2.pavarde);
//            if (pagalPavarde != 0) return pagalPavarde;
//
//            return Integer.compare(m1.klase, m2.klase);
//        });
//    }
//}