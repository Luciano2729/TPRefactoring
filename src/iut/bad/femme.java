package iut.bad;

public class femme extends humain {
    public femme(String nom, String prenom, int age) {
        super(nom, prenom, age);
    }
    
    public static void main(String[] args) {
    homme h = new homme("Dupont", "Jean", 25);
    femme f = new femme("Martin", "Sophie", 23);

    h.details(); // affiche les infos de l’homme
    f.details(); // affiche les infos de la femme

    h.manger();  // "Jean mange."
    f.boire();   // "Sophie boit."

    f.ami(h, 365);    // "Sophie est ami avec Jean"
}

}

