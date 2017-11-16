import java.util.ArrayList;

public class Etudiant {

    private String nom;
    private String prenom;
    private String numTel;
    private String email;
    private String dateEntre;

    private ArrayList<Note> notes = new ArrayList<>();
    private ArrayList<Matiere> matieres = new ArrayList<>();

    public Etudiant(String nom, String prenom, String numTel, String email, String dateEntre) {
        this.nom = nom;
        this.prenom = prenom;
        this.numTel = numTel;
        this.email = email;
        this.dateEntre = dateEntre;
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

    public String getDateEntre() {
        return dateEntre;
    }

    public void setDateEntre(String dateEntre) {
        this.dateEntre = dateEntre;
    }

    public ArrayList<Note> getNotes() {
        return notes;
    }

    public void setNotes(ArrayList<Note> notes) {
        this.notes = notes;
    }

    public ArrayList<Matiere> getMatieres() {
        return matieres;
    }

    public void setMatieres(ArrayList<Matiere> matieres) {
        this.matieres = matieres;
    }

    @Override
    public String toString() {
        return "Etudiant{" +

                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", numTel='" + numTel + '\'' +
                ", email='" + email + '\'' +
                ", dateEntre='" + dateEntre + '\'' +
                '}';
    }

    public void afficheFicheEtudiant() {
        System.out.println(this);
    }


    public void calculerMoyenneGeneral() {
        double moyenne = 0;
        for (int i = 0; i < notes.size(); i++) {

            moyenne = notes.get(i).getNote() + moyenne;


        }
        moyenne = moyenne / matieres.size();
        System.out.println("la moyenne est" + " " + moyenne);
    }

    public double getMoyenneGeneral() {
        double moyenne = 0;
        for (int i = 0; i < notes.size(); i++) {

            moyenne = notes.get(i).getNote() + moyenne;


        }
        return moyenne / matieres.size();

    }


    public int getnoteMatiere(Matiere NomMatiere) {

        for (int i = 0; i < notes.size(); i++) {

            if (notes.get(i).getMatiere().getNom().equals(NomMatiere.getNom())) {
                return notes.get(i).getNote();
            }


        }
        return 0;
    }

    public void afficherMatiereSansNote() {

        ArrayList<String> matiereSansNote = new ArrayList<>();
        boolean existe = false;

        for (int i = 0; i < matieres.size(); i++) {

            for (int j = 0; j < notes.size(); j++) {

                if (matieres.get(i).getNom().equals(notes.get(j).getMatiere().getNom())) {
                    existe = true;
                    break;
                }
            }

            if (!existe) {
                matiereSansNote.add(matieres.get(i).getNom());
            }

        }


        if (matiereSansNote.isEmpty())
            System.out.println("l'étudiant est noté sur toutes les matieres");
        else {
            System.out.println("les matieres non noté sont");
            for (int i = 0; i < matiereSansNote.size(); i++) {
                System.out.println(matiereSansNote.get(i));

            }
        }


    }

    public void affichageNoteParMatiereEtMoyenne() {
        for (int i = 0; i < notes.size(); i++) {
            System.out.println("la note de la matiere" + notes.get(i).getMatiere().getNom() + " est " + notes.get(i).getNote());

        }
        calculerMoyenneGeneral();

    }

    public void addNote(Note note) {
        notes.add(note);
    }

    public void addMatiere(Matiere matiere) {
        matieres.add(matiere);
    }

}
