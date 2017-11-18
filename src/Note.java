public class Note {

    private float note = 0;
    private Matiere matiere;

    public Note(float note, Matiere matiere) {
        this.note = note;
        this.matiere = matiere;
    }

    public float getNote() {
        return note;
    }

    public void setNote(float note) {
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
