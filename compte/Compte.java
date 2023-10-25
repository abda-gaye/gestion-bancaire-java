package compte;

import java.time.LocalDate;
public abstract class Compte {
   private String numCompte;
   private LocalDate dateCreated;
   private Double balance;

   public Compte(String numCompte, LocalDate dateCreated, Double balance){
      this.numCompte = numCompte;
      this.dateCreated = dateCreated;
      this.balance = balance;
   }
   
   public String getNumCompte() {
      return numCompte;
   }
   public LocalDate getDateCreated() {
      return dateCreated;
   }
   public Double getBalance() {
      return balance;
   }
   

   public void setNumCompte(String numCompte) {
      this.numCompte = numCompte;
   }

   public void setDateCreated(LocalDate dateCreated) 
   {
      this.dateCreated = dateCreated;
   }

   public void setBalance(Double balance)
   {
      this.balance = balance;
   }
   

}
