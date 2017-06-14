package decorator;

/**
 * Created by melvin on 14/06/17.
 */
public class B extends Balise {
    public B(Chaine c) {
        super(c);
    }

    @Override
    public String imprime() {
        return "<B>" + super.imprime() + "</B>";
    }
}
