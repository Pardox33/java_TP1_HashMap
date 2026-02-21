import java.util.Map;
import java.util.TreeMap;

public class Annuaire {

    private Map<String, Fiche> table;

    public Annuaire() {
        table = new TreeMap<>();
    }

    public void ajouter(Fiche f) {
        table.put(f.getNom(), f);
    }

    public Fiche rechercher(String nom) {
        return table.get(nom);
    }

    public void afficher() {
        for (Fiche f : table.values()) {
            System.out.println(f);
        }
    }
}
