package org.example;
import lombok.Getter;
import java.util.Date;
import java.util.Set;
import java.util.UUID;

@Getter
public class Transaction {
    private final TransactionType T;
    private final Date timestump;
    private final String reference;
    private Set<Compte> comptes;

    public Transaction(TransactionType T,Date timestu){
        this.T=T;
        this.reference=UUID.randomUUID().toString();
        this.timestump=timestu;

    }
}
