import java.util.ArrayList;

public class Enseignent extends Personne {


    private Dates dateFonction;
    private GradeEnseignant grade;

    private ArrayList<Matiere> listMatieres = new ArrayList<>();

    public Enseignent(String nom, String prenom, String numTel, String email, Dates dateFonction, GradeEnseignant grade) {
        super(nom, prenom, numTel, email);
        this.dateFonction = dateFonction;
        this.grade = grade;
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

        System.out.println("\n" + getNom() + " enseigne : ");
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
                "nom='" + getNom() + '\'' +
                ", prenom='" + getPrenom() + '\'' +
                ", numTel='" + getNumTel() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", dateFonction=" + dateFonction +
                ", grade='" + grade + '\'' +
                ", listMatieres=" + listMatieres +
                '}';
    }
}
