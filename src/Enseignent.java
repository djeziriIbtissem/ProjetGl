import java.util.ArrayList;

public class Enseignent {

    private String nom;
    private String prenom;
    private String numTel;
    private String email;
    private Dates dateFonction;
    private GradeEnseignant grade;

    private ArrayList<Matiere> listMatieres = new ArrayList<>();

    public Enseignent(String nom, String prenom, String numTel, String email, Dates dateFonction, GradeEnseignant grade) {
        this.nom = nom;
        this.prenom = prenom;
        this.numTel = numTel;
        this.email = email;
        this.dateFonction = dateFonction;
        this.grade = grade;
    }

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

    public Dates getDateFonction() {
        return dateFonction;
    }

    public void setDateFonction(Dates dateFonction) {
        this.dateFonction = dateFonction;
    }

    public GradeEnseignant getGrade() {
        return grade;
    }

    public void setGrade(GradeEnseignant grade) {
        this.grade = grade;
    }

    public ArrayList<Matiere> getListMatieres() {
        return listMatieres;
    }

    public void setListMatieres(ArrayList<Matiere> listMatieres) {
        this.listMatieres = listMatieres;
    }


    //affichage de la fiche d'un enseignant
    public void afficheFiche() {
        System.out.println(this);
    }

    //affiche les matiere de l'enseignant
    public void affichageMatiereParEnseignant() {

        System.out.println("\n" + nom + " enseigne : ");
        for (int i = 0; i < listMatieres.size(); i++) {
            System.out.println("-la matiere " + listMatieres.get(i).getNom());
        }
    }


    public void addMatiere(Matiere matiere) {
        listMatieres.add(matiere);
        matiere.addEnseignant(this);
    }


    @Override
    public String toString() {
        return "Enseignent{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", numTel='" + numTel + '\'' +
                ", email='" + email + '\'' +
                ", dateFonction=" + dateFonction +
                ", grade='" + grade + '\'' +
                ", listMatieres=" + listMatieres +
                '}';
    }
}
