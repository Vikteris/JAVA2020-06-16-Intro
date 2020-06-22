//package lt.bit.java.p1020200619.MokiniuPazangumas;
//
//
//import java.util.Random;
//
//public class Trimestrai {
//
//    public static void main(String[] args) {
//
//        static int mokininukai = 4;
//        static Mokinys vaikai = new Mokinys[mokininukai];
//        static Random random = new  random; //atsitiktinio skaičiaus generatorius
//
//        mokiniaiDuom();
//        print("Surasyti: ");
//    }
//
//    static void mokiniaiDuom() {
//        Mokinys mokinys1 = new Mokinys();
//        mokinys1.vardas = "Jonas";
//        mokinys1.pavarde = "Jonaitis";
//        mokinys1.klase = 5;
//        mokinys1.trimestras = new int[8, 10, 9, 9, 10, 9];
//        mokiniai[0] = mokinys1;
//
//        Mokinys mokinys2 = new Mokinys();
//        mokinys2.vardas = "Jonas";
//        mokinys2.pavarde = "Jonaitis";
//        mokinys2.klase = 8;
//        mokinys2.trimestras = new int[5, 6, 4, 9, 7, 6];
//        mokiniai[1] = mokinys2;
//
//        Mokinys mokinys3 = new Mokinys();
//        mokinys3.vardas = "Jonas";
//        mokinys3.pavarde = "Jonaitis";
//        mokinys3.klase = 8;
//        mokinys3.trimestras = new int[5, 5, 6, 6, 6, 7];
//        mokiniai[2] = mokinys3;
//
//        Mokinys mokinys4 = new Mokinys();
//        mokinys4.vardas = "Jonas";
//        mokinys4.pavarde = "Jonaitis";
//        mokinys4.klase = 7;
//        mokinys4.trimestras = new int[8, 8, 7, 8, 7, 8];
//        mokiniai[3] = mokinys4;
//
//    }
//    static void sugen0eruotiMokinius () {
//        for (int i = 0; i< mokiniai.length; i++){
//            mokiniai[i] = sugeneruotasMokinys();
//        }
//    }
//    static Mokinys sugeneruotasMokinys () {
//        Mokinys mokinys = new Mokinys();
//
//        mokinys.setKlase(random.nextInt(12)+1 //gražina skaičius nuo nulio iki 11 ir plius 1 nes reikia nuo 1 iki 12. perstumia intervala +1// tas galioja ir kai reikai perslinkti +2 ar +3// )
//        int [] trimestras = new int[10]
//        for(int i = 0; i< trimestras.length; i++){
//            trimestrasp4[i] = random.nextInt(7)+4;
//        }
//        mokinys.setTrimestras(trimestras))
//        mokinys.setVardas (generuotiTeksa())
//        mokinys.setPavarde (generuotiTeksa())
//
//        return mokinys;
//    }
//    static String generuotiTeksa() {
//        int ilgis = random.nextInt(6)+5; //nuo 5 iki 10 raidžiu žodyje 5 nes reikia per 5 vietas paslinkti
//        char pirmaRaide = (char)('A' + random.nextInt(26)); //char yra duomenu tipoas kur galima raide rasyt,
//                                                            //viena simbolio kabutese. 26 yra abeceles raidžiu kiekis
                                                              // integeri paverčia i char. visą ta("A"...) logika paverčia i char
//        String tekstas = ""+ pirmaRaide;
//        for( int i=1; i<ilgis; i++){
//            tekstas +=(char)("a" + random.nextInt(26));
//        }
//        return tekstas;
////        char paskutinesRaides =
//    }
//
//    static void print(int indeksas) {
//        System.out.println(mokiniai[indeksas] + " " +
//                mokiniai[indeksas].vardas + " " +
//                mokiniai[indeksas].pavarde);
//    }
////    static void print(String title) {
////        System.out.println();
////        System.out.println(title);
////        for (int i = 0; i < mokiniai.length; i++) {
////            print(i);
////        }
//    }
//}