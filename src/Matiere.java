import java.util.ArrayList;

public class Matiere {

    private String nom;
    private Salle salle;
    private ArrayList<Etudiant> etudiants = new ArrayList<>();


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

    public ArrayList<Etudiant> getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(ArrayList<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }

    @Override
    public String toString() {
        return "Matiere{" +
                "nom='" + nom + '\'' +
                ", salle=" + salle +
                '}';
    }


    public double calculeMoyenneMatiere() {
        double moyenne = 0;
        for (int i = 0; i < etudiants.size(); i++) {

            moyenne = etudiants.get(i).getnoteMatiere(this) + moyenne;

        }

        return moyenne / etudiants.size();

    }

    public void affichageMoyenneMatiere(){
        System.out.println("la moyenne de la matiere" + nom + "est" + calculeMoyenneMatiere());

    }

    public void addEtudiant(Etudiant etudiant){

        etudiants.add(etudiant);
    }

}
