public class Ingredient {
    private String nom_ingredient;
    private int quantite;
    private String unite ;

    public Ingredient(String nom_ingredient, int quantite , String unite) {
        this.nom_ingredient = nom_ingredient;
        this.quantite = quantite;
        this.unite = unite;
    }
    public String afficher() {
        return this.nom_ingredient + " : " + this.quantite + " " + this.unite;
    }
    public String getNom(){
        return this.nom_ingredient;
    }
    public int getQuantite(){
        return this.quantite;
    }
        public String getUnite(){
        return this.unite;
    }
    public int setQuantite(int quantite){
        this.quantite = quantite;
        return this.quantite;
    }
}
