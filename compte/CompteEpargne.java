package compte;
import java.time.LocalDate;


public class CompteEpargne extends Compte {
    private Double taux;
    public CompteEpargne(String numCompte, LocalDate dateCreated, Double balance,Double taux) {
        super( numCompte,  dateCreated,  balance);
        this.taux = taux;
    }

    public double getTaux() {
        return taux;
    }
    
}