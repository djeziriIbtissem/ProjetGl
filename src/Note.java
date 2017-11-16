public class Note {

    private int note;
    private Matiere matiere;

    public Note(int note, Matiere matiere) {
        this.note = note;
        this.matiere = matiere;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public Matiere getMatiere() {
        return matiere;
    }

    public void setMatiere(Matiere matiere) {
        this.matiere = matiere;
    }

    @Override
    public String toString() {
        return "Note{" +
                "note=" + note +
                ", matiere=" + matiere +
                '}';
    }
}
