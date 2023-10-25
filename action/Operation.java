import java.util.*;
public abstract class Operation  {
    private Double numOperation;
    private Date dateOperation;
    private Double montant;

     public Operation(Double numOperation, Date dateOperation, Double montant){
      this.numOperation = numOperation;
      this.dateOperation = dateOperation;
      this.montant = montant;
   }

   public Double getNumOperation() {
      return numOperation;
   }

    public Date getDateOperation() {
      return dateOperation;
   }

    public Double getMontant() {
      return montant;
   }

}