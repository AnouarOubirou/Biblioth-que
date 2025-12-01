package org.example;

public class Document {
    protected int numero;
    protected String titre;

    public Document() {}
    public Document(int numero, String titre) {
        this.numero = numero;
        this.titre = titre;
    }

    public int getNumero() {
        return numero;
    }
    public String getTitre() {
        return titre;
    }

    public void afficher() {
        System.out.println("Numero : " + numero);
        System.out.println("Titre : " + titre);
    }
}
