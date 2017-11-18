import java.util.ArrayList;

public class Matiere {

    private String nom;
    private Salle salle;

    private ArrayList<Etudiant> listEtudiants = new ArrayList<>();
    private ArrayList<Enseignent> listEnseigant = new ArrayList<>();


    public Matiere(String nom, Salle salle) {
        this.nom = nom;
        this.salle = salle;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Salle getSalle() {
        return salle;
    }

    public void setSalle(Salle salle) {
        this.salle = salle;
    }

    public ArrayList<Etudiant> getListEtudiants() {
        return listEtudiants;
    }

    public void setListEtudiants(ArrayList<Etudiant> listEtudiants) {
        this.listEtudiants = listEtudiants;
    }

    public ArrayList<Enseignent> getListEnseigant() {
        return listEnseigant;
    }

    public void setListEnseigant(ArrayList<Enseignent> listEnseigant) {
        this.listEnseigant = listEnseigant;
    }

    public void addEtudiant(Etudiant etudiant) {
        listEtudiants.add(etudiant);
    }

    public void addEnseignant(Enseignent enseignent) {
        listEnseigant.add(enseignent);
    }

    //calculer la moyenne des notes de la matiere
    public double calculeMoyenneMatiere() {
        double moyenne = 0;
        for (int i = 0; i < listEtudiants.size(); i++) {
            moyenne = listEtudiants.get(i).getNoteUneMatiere(this) + moyenne;
        }
        return (moyenne / listEtudiants.size());
    }

    //affichage de la moyennne de la matiere
    public void affichageMoyenneMatiere() {
        System.out.println("la moyenne de la matiere " + nom + " est : " + calculeMoyenneMatiere());
    }


    @Override
    public String toString() {
        return nom;
    }
}
