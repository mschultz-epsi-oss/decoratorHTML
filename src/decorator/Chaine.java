package decorator;

/**
 * Created by melvin on 14/06/17.
 */
public class Chaine {
    private String texte;

    public Chaine() {}

    public Chaine(String t) {
        texte = t;
    }

    public String imprime() {
        return texte;
    }
}
