import java.util.ArrayList;

public class Etudiant extends Personne {


    private Dates dateEntre;

    private ArrayList<Note> listNotes = new ArrayList<>();
    private ArrayList<Matiere> listMatieres = new ArrayList<>();

    public Etudiant(String nom, String prenom, String numTel, String email, Dates dateEntre) {
        super(nom, prenom, numTel, email);
        this.dateEntre = dateEntre;
    }


    /**
     * Getters ans Setters
     **/

    public Dates getDateEntre() {
        return dateEntre;
    }

    public void setDateEntre(Dates dateEntre) {
        this.dateEntre = dateEntre;
    }

    public ArrayList<Note> getListNotes() {
        return listNotes;
    }

    public void setListNotes(ArrayList<Note> listNotes) {
        this.listNotes = listNotes;
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

    //calculer la moyenne de l'etudiant
    public double calculerMoyenneGeneral() {
        double moyenne = 0;
        for (int i = 0; i < listNotes.size(); i++) {
            moyenne = listNotes.get(i).getNote() + moyenne;
        }
        return (moyenne / listMatieres.size());
    }

    //afficher la moyenne general de l'etudiant
    public void affichageMoyenneGeneral() {
        System.out.println("la moyenne est : " + calculerMoyenneGeneral());
    }

    //get une note d'une matiere donnée
    public float getNoteUneMatiere(Matiere NomMatiere) {
        for (int i = 0; i < listNotes.size(); i++) {
            if (listNotes.get(i).getMatiere().equals(NomMatiere)) {
                return listNotes.get(i).getNote();
            }
        }
        return 0;
    }

    //liste des matiere sans note de l'etudiant
    public void afficherMatiereSansNote() {
        ArrayList<Matiere> matiereSansNote = new ArrayList<>();

        for (int i = 0; i < listMatieres.size(); i++) {

            int indice = 0;
            boolean existe = false;

            while (!existe && indice < listNotes.size()) {
                if (listMatieres.get(i).equals(listNotes.get(indice).getMatiere())) {
                    existe = true;
                } else
                    indice++;
            }

            if (!existe) {
                matiereSansNote.add(listMatieres.get(i));
            }
        }
        if (matiereSansNote.isEmpty())
            System.out.println("l'étudiant " + getNom() + " est noté sur toutes les Matieres");
        else {
            System.out.println("les Matieres sans note de " + getNom());
            for (int i = 0; i < matiereSansNote.size(); i++) {
                System.out.println(matiereSansNote.get(i).getNom());
            }
        }
    }

    //affichage des listNotes et moyenne general
    public void affichageNoteParMatiereEtMoyenne() {
        System.out.println("\nEtudiant " + getNom() + " " + getPrenom());
        for (int i = 0; i < listNotes.size(); i++) {
            System.out.println("la note de la matiere " + listNotes.get(i).getMatiere().getNom() + " est " + listNotes.get(i).getNote());
        }
        afficherMatiereSansNote();
        affichageMoyenneGeneral();
    }

    //ajouter une note
    public void addNote(Note note) {
        listNotes.add(note);
    }

    //ajouter matiere
    public void addMatiere(Matiere matiere) {
        listMatieres.add(matiere);
        matiere.addEtudiant(this);
    }

    @Override
    public String toString() {
        return "Etudiant{" + super.toString() +
                "dateEntre=" + dateEntre +
                "} ";
    }
}
