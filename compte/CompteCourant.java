package compte;
import java.time.LocalDate;
public class CompteCourant extends Compte {
    private Double decouvert;

    public  CompteCourant(String numCompte, LocalDate dateCreated, Double balance,Double decouvert) {
        super(numCompte, dateCreated, balance);
        this.decouvert = decouvert;
    }

    public Double getDecouvert(){
        return decouvert;
    }
}