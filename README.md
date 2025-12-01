📚 Exercice 2 – Système de Bibliothèque en Java (Héritage + CRUD)

Cet exercice comporte une application complète de gestion de documents (livres, dictionnaires) en utilisant l’héritage, le polymorphisme et un service CRUD.

✔️ Architecture des classes
1. Classe mère : Document

Attributs : numéro, titre

Méthode afficher() générique

2. Classe Livre (hérite de Document)

Attributs : auteur, nombre de pages

Redéfinition de afficher()

3. Classe Dictionnaire (hérite de Document)

Attributs : langue, nombre d’articles

Redéfinition de afficher()

✔️ Service de gestion : ServiceCrud

Fonctionnalités :

Ajouter un document

Modifier

Supprimer

Rechercher

Afficher tout

Stockage interne :
Document[] T

✔️ Interface interactive : ServiceInteractif

Menu complet permettant :

Ajouter document
---Ajouter dictionnaire
---Ajouter livre

Modifier document

Supprimer document

Rechercher document

Afficher tout

Quitter
