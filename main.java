import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Annuaire annuaire = new Annuaire();

        while (true) {

            System.out.print("Commande (+nom, ?nom, !, .) : ");
            String commande = sc.nextLine();

            if (commande.equals(".")) {
                break;
            }

            if (commande.startsWith("+")) {
                String nom = commande.substring(1);

                System.out.print("Numero : ");
                int num = sc.nextInt();
                sc.nextLine();

                System.out.print("Adresse : ");
                String adr = sc.nextLine();

                annuaire.ajouter(new Fiche(nom, num, adr));
            }

            else if (commande.startsWith("?")) {
                String nom = commande.substring(1);
                Fiche f = annuaire.rechercher(nom);

                if (f != null)
                    System.out.println(f);
                else
                    System.out.println("Introuvable !");
            }

            else if (commande.equals("!")) {
                annuaire.afficher();
            }
        }

        sc.close();
    }
}