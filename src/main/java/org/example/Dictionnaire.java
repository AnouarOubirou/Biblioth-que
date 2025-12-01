package org.example;

public class Dictionnaire extends Document {
    protected int nbarticle;
    protected String langue;

    public Dictionnaire() {}
    public Dictionnaire(int numero, String titre, String langue, int nbarticle) {
        super(numero, titre);
        this.langue = langue;
        this.nbarticle = nbarticle;
    }
    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Langue : " + langue);
        System.out.println("Nombre d'articles : " + nbarticle);
    }
}
