package org.example;

public class Livre extends Document{
    protected int nbpages;
    protected String auteur;
    public Livre(){}
    public Livre(int numero, String titre, int nbpages, String auteur) {
        super(numero, titre);
        this.nbpages = nbpages;
        this.auteur = auteur;
    }
    public void afficher() {
        super.afficher();
        System.out.println("auteur : " + auteur);
        System.out.println("le nombre de pages est : " + nbpages);
    }
}
