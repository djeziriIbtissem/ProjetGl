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

    /**
     * Getters ans Setters
     **/


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


    /**
     * Methode
     **/

    //affiche les matiere de l'enseignant
    public void affichageMatiereEnseignant() {

        System.out.println("\n" + getNom() + " enseigne : ");
        for (int i = 0; i < listMatieres.size(); i++) {
            System.out.println("-la matiere " + listMatieres.get(i).getNom());
        }
    }

    //ajouter matiere a l'enseignant pour
    public void addMatiere(Matiere matiere) {
        listMatieres.add(matiere);
        matiere.addEnseignant(this);
    }

    @Override
    public String toString() {
        return "Enseignent{" + super.toString() +
                "dateFonction=" + dateFonction +
                ", grade=" + grade +
                ", listMatieres=" + listMatieres +
                "} ";
    }
}
