package org.example;
import lombok.Getter;
import java.util.Date;
import java.util.Set;

@Getter
public class Transaction {
    private final TransactionType T;
    private final Date timestump;
    private final String reference;
    private Set<Compte> comptes;

    public Transaction(TransactionType T,Date timestu,String ref){
        this.T=T;
        this.reference=ref;
        this.timestump=timestu;

    }
}
