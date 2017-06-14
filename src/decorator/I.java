package decorator;

/**
 * Created by melvin on 14/06/17.
 */
public class I extends Balise {
    public I(Chaine c) {
        super(c);
    }

    @Override
    public String imprime() {
        return "<I>" + super.imprime() + "</I>";
    }
}
