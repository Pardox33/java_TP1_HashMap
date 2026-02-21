import java.util.Comparator;

public class CompareNom implements Comparator<Fiche> {
  @Override
  public int compare(Fiche f1, Fiche f2) {
    return f1.getNom().compareTo(f2.getNom());
  }

}
