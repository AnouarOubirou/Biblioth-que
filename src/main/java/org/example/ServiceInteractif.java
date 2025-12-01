package org.example;

import java.util.Scanner;

public class ServiceInteractif {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ServiceCrud crud = new ServiceCrud(50);

        int choix;

        do {
            System.out.println("-------- MENU BIBLIOTHEQUE --------");
            System.out.println("1- Ajouter un Document");
            System.out.println("2- Modifier un Document");
            System.out.println("3- Supprimer un Document");
            System.out.println("4- Rechercher un Document");
            System.out.println("5- Afficher tous les Documents");
            System.out.println("0- Quitter");
            System.out.print("Choix : ");
            choix = sc.nextInt();

            switch (choix) {

                case 1:
                    System.out.println("---- Ajouter Document ----");
                    System.out.println("1- Livre");
                    System.out.println("2- Dictionnaire");
                    System.out.print("Choix : ");
                    int typeDoc = sc.nextInt();

                    if (typeDoc == 1) {
                        System.out.print("Numéro : ");
                        int numL = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Titre : ");
                        String titreL = sc.nextLine();
                        System.out.print("Auteur : ");
                        String auteur = sc.nextLine();
                        System.out.print("Nombre de pages : ");
                        int pages = sc.nextInt();

                        crud.ajouter(new Livre(numL, titreL, pages, auteur));
                    }
                    else if (typeDoc == 2) {
                        System.out.print("Numéro : ");
                        int numD = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Titre : ");
                        String titreD = sc.nextLine();
                        System.out.print("Langue : ");
                        String langue = sc.nextLine();
                        System.out.print("Nombre d'articles : ");
                        int art = sc.nextInt();

                        crud.ajouter(new Dictionnaire(numD, titreD, langue, art));
                    }
                    else {
                        System.out.println("Choix invalide !");
                    }
                    break;

                case 2:
                    System.out.print("Numéro du document à modifier : ");
                    int numMod = sc.nextInt();
                    Document doc = crud.rechercher(numMod);

                    if (doc == null) {
                        System.out.println("Document introuvable !");
                        break;
                    }

                    sc.nextLine();
                    System.out.print("Nouveau titre : ");
                    String newTitre = sc.nextLine();
                    doc.titre = newTitre;

                    crud.modifier(doc);
                    break;

                case 3:
                    System.out.print("Numéro du document à supprimer : ");
                    int numSup = sc.nextInt();
                    crud.supprimer(numSup);
                    break;

                case 4:
                    System.out.print("Numéro : ");
                    int numR = sc.nextInt();
                    Document d = crud.rechercher(numR);

                    if (d != null)
                        System.out.println(d);
                    else
                        System.out.println("Document non trouvé !");
                    break;

                case 5:
                    crud.afficherTout();
                    break;

                case 0:
                    System.out.println("Fin du programme...");
                    break;

                default:
                    System.out.println("Choix invalide.");
            }

        } while (choix != 0);

        sc.close();
    }
}
