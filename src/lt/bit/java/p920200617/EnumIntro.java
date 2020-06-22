package lt.bit.java.p920200617;

import lt.bit.java.p920200617.Enums.Color; //🔽
//Gali buti tas failas su informacija ir kitam kataloge ir
// su tuo pačiu pavadinimu, ir ji jei nori naudoti galima paimti ji su komanda

public class EnumIntro { //klase yra kaip vienas objektas, vienaskaita
    public static void main(String[] args) {
        System.out.println("Enum Intro");       //enum yra- tai sukurtas duomenu tipas, kurie turi
                                                // fiksuotas reiksmes . enumai nekintamos reikšmes


        //kintamjojo tipas= pavadinimas+ reiksme
        Color spalva = Color.GREEN;
        System.out.println("spalva=" + spalva);// kitoks nei apamtinis printinimas, jis kvičia .toString komanda
        System.out.println("spalva.name=" + spalva.name());//
        System.out.println("spalva.ordinal="+spalva.ordinal()); //ordinal- koks yra enumo eiles numeris tarp enumo
                                                                // visu reiksmiu

        spalva = Color.RED;
        System.out.println("spalva="+ spalva.name());
        System.out.println("spalva.name=" + spalva.name());
        System.out.println("spalva.ordinal="+spalva.ordinal());// color.java fialiuke yra surašytos spalvos.
                                                                // iš jos ima informacija

        //spalva=null; //gali tureti tokia reiksme neprimytiviems reiksmems
        //String tekstas = null;
        //tekstas = null;
        //System.out.println(tekstas== null ? "null" : tekstas.toString());
        //tekstas = "null";
        //System.out.println(tekstas);
    }
}
