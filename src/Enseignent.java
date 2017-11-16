import java.util.ArrayList;
import java.util.Comparator;

public class Enseignent {

    private String nom;
    private String prenom;
    private String numTel;
    private String email;
    private int dateFonction;
    private String grade;
    private ArrayList<Matiere> matieres = new ArrayList<>();

    public Enseignent(String nom, String prenom, String numTel, String email, int dateFonction, String grade) {
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

    public int getDateFonction() {
        return dateFonction;
    }

    public void setDateFonction(int dateFonction) {
        this.dateFonction = dateFonction;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public ArrayList<Matiere> getMatieres() {
        return matieres;
    }

    public void setMatieres(ArrayList<Matiere> matieres) {
        this.matieres = matieres;
    }

    @Override
    public String toString() {
        return "Enseignent{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", numTel='" + numTel + '\'' +
                ", email='" + email + '\'' +
                ", dateFonction='" + dateFonction + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }

    public void afficheFiche() {
        System.out.println(this);
    }

    public void affichageMatiereParEnseignant() {
        for (int i = 0; i < matieres.size(); i++) {
            System.out.println("la matiere " + i + matieres.get(i).getNom());

        }
    }



    public void addMatiere(Matiere matiere) {
        matieres.add(matiere);
    }

}
