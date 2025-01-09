import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class MainBonus {
    public static void main(String[] args) {
        ArrayList <Ingredient> recette = new ArrayList<>();

        //créer un nouvel ingrédient
        Ingredient jambon = new Ingredient("Jambon",4,"tranches") ;
        recette.add(jambon) ;
        Ingredient emmental = new Ingredient("Emmental",8,"tranches") ;
        recette.add(emmental) ;

        //Afficher l'ensemble des ingredients
        System.out.println("\n---------Afficehr l'enssemble des ingredients---------");
        for(Ingredient i : recette) {
          System.out.println(i.afficher()) ;
        }
        //Afficher un seul ingredient à la position
        System.out.println("-------Afficher un ingredient-------------");
        System.out.println("Le 2ème ingrédient : "+recette.get(1).afficher()) ;
        System.out.println("\n------------Remplacer un ingredient----------------------");
        //remplacer un ingredient de notre liste
        System.out.println("Ingrédient initial : "+recette.get(1).afficher()) ;
        Ingredient ail = new Ingredient("Ail",1,"gousse") ;
        recette.add(ail) ;
        recette.set(1,ail);
        System.out.println("Nouvel ingredient : "+recette.get(1).afficher()) ;

        //Supprimer un ingredient de notre Arraylist
        System.out.println("\n--------Supprimer un ingredient-------------------");
        System.out.println("Supprimer l'ail  ");
        recette.remove(ail) ;
        boolean supprimer = recette.remove(ail) ;
        System.out.println("Ail supprimé : "+supprimer);
        int numIngredient = 0 ;
        for(Ingredient i : recette) {
            numIngredient++ ;
            System.out.println("Ingredient "+numIngredient +" : ");
            System.out.println(i.afficher()) ;
        }
        System.out.println("\n-------------Modifier la quantite-------------------");
        //Modifier la quantité
       System.out.println("Quantité initial : "+jambon.getQuantite()) ;
       int qteJambon = jambon.setQuantite(2) ;
        System.out.println("Nouvelle quantité : "+qteJambon);

    }
}
