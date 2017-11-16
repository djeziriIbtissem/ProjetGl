import java.util.ArrayList;

public class Ecole {

    private String nomEcole;
    private String siteInternet;
    private ArrayList <Departement>departements=new ArrayList<>();

    public Ecole(String siteInternet , String nomEcole) {
        this.siteInternet = siteInternet;
        this.nomEcole=nomEcole;
    }

    public String getSiteInternet() {
        return siteInternet;
    }

    public void setSiteInternet(String siteInternet) {
        this.siteInternet = siteInternet;
    }

    public ArrayList<Departement> getDepartements() {
        return departements;
    }

    public void setDepartements(ArrayList<Departement> departements) {
        this.departements = departements;
    }

    public String getNomEcole() {
        return nomEcole;
    }

    public void setNomEcole(String nomEcole) {
        this.nomEcole = nomEcole;
    }

    @Override
    public String toString() {
        return "Ecole{" +
                "nomEcole='" + nomEcole + '\'' +
                ", siteInternet='" + siteInternet + '\'' +
                '}';
    }

    public void affichageDepartement(){
        for (int i = 0; i <departements.size() ; i++) {
            System.out.println(departements.get(i).getNomDepartement());
        }

    }


    public void addDepartement(Departement departement){
        departements.add(departement);

    }
}
