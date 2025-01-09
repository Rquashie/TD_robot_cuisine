import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Veuillez saisir un ingredient : ");
        String nom_ingredient = sc.next();
        System.out.println("Veuillez saisir la quantite : ");
        int quantite = sc.nextInt();
        System.out.println("Veuillez saisir l'unité' : ");
        String unite = sc.next();

        Ingredient monIngredient = new Ingredient(nom_ingredient,quantite,unite) ;

        //Afficher la quantite
        int maQte = monIngredient.getQuantite() ;
        System.out.println("Quantité : "+maQte);

        //Afficher le nom de l'ingredient
        String nom = monIngredient.getNom();
        System.out.println("Nom de l'ingredient : "+nom);

        //Affiche l'unite de l'ingredient
        String unite_ingredient = monIngredient.getUnite();
        System.out.println("Unité : "+unite_ingredient);

        //Afficher l'ingredient en entier
        String ingredient_complet = monIngredient.afficher();
        System.out.println(ingredient_complet);

        //Saisir une nouvelle quantite
        System.out.println("Veuillez saisir une nouvelle quantite : ");
        int nouvelleQte = sc.nextInt();
        int qteModifie = monIngredient.setQuantite(nouvelleQte);
        System.out.println("Nouvelle quantité :" +qteModifie);

        //Re afficher l'ingredient
        ingredient_complet = monIngredient.afficher();
        System.out.println(ingredient_complet); //Quantite a changé
    }
}





