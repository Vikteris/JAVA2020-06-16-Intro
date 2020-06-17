package lt.bit.java.p920200617.Enums;

public enum Color {
    BLACK, RED, YELLOW, GREEN;// jei kuriasi nauja reiksme, niekada negalima rašyti pradžioj
    //o visada i gala, kad jei panaudojai jau esamnas reiksmes, kad nepakeist ju eiles numerio ir nesumaisyt


    @Override
    public String toString() {
        return "kuku";  //galima pakeisti to.String  spalva.name neapkeis teksto,
                        // bet paprasta +spalva to.string teksta pakeičia OVERRIDINAM ta teksta
    }
}
