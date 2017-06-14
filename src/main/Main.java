package main;

import decorator.B;
import decorator.Chaine;
import decorator.I;

public class Main {

    public static void main(String[] args) {
	    Chaine c = new Chaine("TEXTE");
        System.out.println(c.imprime());
        c = new B(c);
        System.out.println(c.imprime());
        c = new I(c);
        System.out.println(c.imprime());
    }
}
