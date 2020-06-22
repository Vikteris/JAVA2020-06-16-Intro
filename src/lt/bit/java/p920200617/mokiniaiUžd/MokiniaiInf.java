package lt.bit.java.p920200617.mokiniaiUžd;


public class MokiniaiInf {
    private String vardas;
    private String pavarde;
    private int klase;
    //pirvate int... (5 4 8 12 1 )
 // geteris seteris yra naudojama kaip padaromi clases kintamijei "private"
    public String getVardas() {
        return vardas;
    } // gauna reikšmes , paleidžiam, kai spausdintam reikšmes, skaitome.

    public void setVardas(String vardas) {
        this.vardas = vardas;
    } // priskiria reikšmes ,sukuria, kur prieksirams reikšmes , setinama vardas, kalse pavarde

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        //TODO oruidetu oarujubna ar pavarde ir tokia ir tokia
        this.pavarde = pavarde;
    }

    public int getKlase() {
        return klase;
    }

    public void setKlase(int klase) {
        this.klase = klase;
    }//.this nudoro kaip kinamojo reikšme,

    @Override
    public String toString() {
        return klase + " " + vardas + " " + pavarde;
    }
}

//  .this žodelis- klases kintamasis, klases vardas/ kintmaojo reikšme.

// get, .set naudojamas kai nori gaut indformacxija jei klases informacija kuri padaryta "private", panaudoti jos nesugadinant

//[vz. publick int[] getpavarde() {
//  return trimestras;
// };
