package lt.bit.java2Mindaugas.p1420200629;


/*Intro
1.Procedūrinis -funkcijos
2. OOP- objektai, savybiu ir susijusiu metodu/funkciju suma.
3. FUctional/funkcinis- functions as first class citizens, immutable ds.
 */


public class Main {
//jeigu yra  daug perpanaudojamu kodu, pvz "labas🔽 ir vietoj to kad tris kartu vaikųčiot pakeiste, yra geriau susikurti
// metoda ir iškelt ta logika i sukurta metoda ir ja tada kviestis toj vietoj kur reikia(printHello())."

    //Procedurinis metodas-suskaldynas funkcios i daug funkciju, kur perpanaudoji reiklaingas funkcijoje
    // METODO DEKLARACIJA(kaip jisai veiks)
    public static void printHello() {

        System.out.println("\n"); //\n reišųkia new line
        System.out.println("Labas");
        System.out.println("\n");
    }

    public static void main(String[] args) {

        //ir tada kviečiamias ta logika

        printHello();//metodo kvietimas(iškviečia kai norime pasinaudoti)

        //...logika

        printHello();

        //...logika

       printHello();

       // Lets create the first object                          konstruktoriaus pakvietimas⬇
        Student/*<--tipas, kuri objektas turi*/ student1 /* <---- kintamojo vardas*/ = new Student();
//        Student student2  = new Student("Jonas", 20);

            // . -dot operator
        System.out.println("student1 age: " + student1.getAge());// cia kai informacija privati, todel reikia naudoti geterius seterius
        student1.setAge(150);
        System.out.println("student1 age: " + student1.getAge());
    }
}
// javoje savybes yra privačioes, o metodai kurie leidžia tas savybes pasiekti, yra public
class Student {
    private String name;
    private int age;
// default konstruktorius- suteikiamas automatiškai

    //getter ir setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 120) {
            this.age = age;
        }else {
            System.out.println("Invalid age provided, defaulting to 0");
        }

    }
}
