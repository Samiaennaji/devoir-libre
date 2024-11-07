package org.example;
import lombok.Getter;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Getter
public class Transaction {
    private final TransactionType T;
    private final Date timestump;
    private final String reference;
    private Set<Compte> comptes;

   //constructeur de transaction
    public Transaction(TransactionType T,Compte compte1,Compte compte2){
      //  this.T=T;
        this.reference=UUID.randomUUID().toString();
        this.timestump=new Date();
        this.comptes=new HashSet<>();
        this.comptes.add(compte1);
        this.comptes.add(compte2);
    }
}
