package iut.bad;

public class humain {
    protected String nom;
    protected String prenom;
    protected int age;

    public humain(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }
    
    @Override
    public String toString() {
        return nom + " " + prenom + " (" + age + " ans)";
    }

    public void details() {
        System.out.println(this.toString());
    }
    
    public void manger() {
        System.out.println(nom + " mange.");
    }

    public void boire() {
        System.out.println(nom + " boit.");
    }


}
