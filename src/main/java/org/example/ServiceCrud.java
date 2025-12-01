package org.example;

public class ServiceCrud {
    Document[] T;
    int N;
    int i;
    public ServiceCrud(int N) {
        this.T = new Document[N];
        this.i = 0;
        this.N = N;
    }
    public void ajouter(Document d) {
        if (i < N) {
            T[i] = d;
            i++;
            System.out.println("Document ajouté avec succès.");
        } else {
            System.out.println("La bibliothèque est pleine !");
        }
    }
    public void modifier(Document d) {
        for (int j = 0; j < i; j++) {
            if (T[j].numero == d.numero) {
                T[j] = d;
                System.out.println("Document modifié avec succès.");
                return;
            }
        }
        System.out.println("Document introuvable !");
    }
    public void supprimer(int numero) {
        int index = -1;

        for (int j = 0; j < i; j++) {
            if (T[j].numero == numero) {
                index = j;
                break;
            }
        }
        if (index != -1) {
            for (int j = index; j < i - 1; j++) {
                T[j] = T[j + 1];
            }
            i--;
            System.out.println("Document supprimé !");
        } else {
            System.out.println("Document non trouvé !");
        }
    }
    public Document rechercher(int numero) {
        for (int j = 0; j < i; j++) {
            if (T[j].numero == numero) {
                return T[j];
            }
        }
        return null;
    }
    public void afficherTout() {
        if (i == 0) {
            System.out.println("Aucun document dans la bibliothèque.");
            return;
        }
        for (int j = 0; j < i; j++) {
            T[j].afficher();
            System.out.println("-----------------------");
        }
    }
}
