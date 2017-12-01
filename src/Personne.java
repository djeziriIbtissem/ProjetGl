public class Personne {

    private String nom;
    private String prenom;
    private String numTel;
    private String email;


    public Personne(String nom, String prenom, String numTel, String email) {
        this.nom = nom;
        this.prenom = prenom;
        this.numTel = numTel;
        this.email = email;
    }


    /**
     * Getters ans Setters
     **/

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNumTel() {
        return numTel;
    }

    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    /**
     * Methode
     **/

    //affichage de la fiche d'une personne
    public void afficherFiche() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", numTel='" + numTel + '\'' +
                ", email='" + email + '\'';
    }
}
