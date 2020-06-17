package lt.bit.java.p920200617.namai;

public class Namai {
        /*
            Lemputes savybes:
            1. lemputes vieta
            2. lemputes pavadinimas
            3. lemputes busena: ijungta/isjungta
         */
    static int lempuciuSkaicius = 2; //turime dvi protingas lemputes
//    PIRMAS BUDAS!!!
//    static String[] vietos = new String[lempuciuSkaicius];
//    static String[] pavadinimai = new String[lempuciuSkaicius];
//    static Status[] busenos = new Status[lempuciuSkaicius];
    //kai esi apsirases metode  kintamuosius, tai jie glaioja tik to metodo viduj, tačiau jei reikia panaudoti
    //juos ir kitame metode, reikia tuos kintamuosius iškelt i class ribas ir prided prie kintamuju "static" žodeli
    // Tai reiškia kad tuos kintamuosius sukurtus ir naudos visoje toje klaseje ir nemes klaidu

// ANTRAS BUDAS!!!
    static Lempute[] lemputes = new Lempute[lempuciuSkaicius];

    public static void main(String[] args) {
//    PIRMAS BUDAS!!!
//        vietos[0] = "Svetaine"; // nuline vieta tai viena lempute(0)
//        pavadinimai[0] = "Prie teliko"; //(0)
//        busenos[0] = Status.OFF; // naujame faile nurodyta lemputes busenos (0)

        //sukonstravom lempute, priskyrem savybes, ir irasem ta lempute i lempučiu masyva
// ANTRAS BUDAS!!!
        Lempute lempute1 = new Lempute(); // Paimame visus kintamuju pavadinimus (vieta busena
                                            // ir t.t. is sukurto naujo failiuko Lempute)
        lempute1.vieta = "Svetaine";
        lempute1.pavadinimas = "Prie teliko";
        lempute1.busena = Status.OFF;
        lemputes[0]= lempute1;

//    PIRMAS BUDAS!!!
//        vietos[1] = "Virtuve";
//        pavadinimai[1] = "Po spintele";
//        busenos[1] = Status.ON;

// ANTRAS BUDAS!!!
        Lempute lempute2= new Lempute();
        lempute2.vieta = "Virtuve";
        lempute2.pavadinimas= "Po spintele";
        lempute2.busena = Status.ON;
        lemputes[1]= lempute2;

        print(0);
        print(1);
        ijungti(0); //jei norima pakeisti takim iš išjungimo i ijungima, rašoam taip ir vel atspausdinama
        // žodelis ijungti veikia kaip funkcija, nes jam yra sukurtas metodas, žiūrėti žemeu apačioj!
        print(0);

        isjungti(0);
        print(0);
    }

    static void print(int indeksas) { //spausdinimas

// PIRMAS BUDAS!!!
//        System.out.println(vietos[indeksas] + " "
//                                + pavadinimai[indeksas]+ " "
//                                + busenos[indeksas]);
// ANTRAS BUDAS!!!
        System.out.println(lemputes[indeksas].vieta + " " +
                            lemputes[indeksas].pavadinimas + " " +
                            lemputes[indeksas].busena);
    }
    static void ijungti(int indeksas) {
// PIRMAS BUDAS!!!
//            busenos[indeksas] = Status.ON;

// ANTRAS BUDAS!!!
        lemputes[indeksas].busena= Status.ON;
    }
    static void isjungti(int indeksas) {
// PIRMAS BUDAS!!!
//        busenos[indeksas] = Status.OFF;

// ANTRAS BUDAS!!!
        lemputes[indeksas].busena = Status.OFF;

    }

}

