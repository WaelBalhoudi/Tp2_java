public class Livere {

    private String titre;
    private String auteur;
    private int id;
    private double prix;
    public  static int cte;

    public Livere(String titre, String auteur, int id, double prix) {
        this.titre = titre;
        this.auteur = auteur;
        this.id = id;
        this.prix = prix;
        cte ++;
    }

    public Livere() {
        cte++;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void toSring(){
        System.out.println("le tire est"+titre);
        System.out.println("le auteur est"+auteur);
        System.out.println("le id est"+id);
        System.out.println("le prix est"+prix);
    }
}
