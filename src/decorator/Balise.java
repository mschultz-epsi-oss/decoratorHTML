package decorator;

/**
 * Created by melvin on 14/06/17.
 */
public class Balise extends Chaine {
    private Chaine texteDecore;

    public Balise(Chaine c) {
        texteDecore = c;
    }

    @Override
    public String imprime() {
        return texteDecore.imprime();
    }
}
