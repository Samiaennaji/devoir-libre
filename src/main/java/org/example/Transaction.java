package org.example;
import lombok.Getter;

import java.util.*;

@Getter
public class Transaction {
    private final TransactionType T;
    private final Date timestump;
    private final String reference;
    private List<Compte> comptes;

   //constructeur de transaction
    public Transaction(Compte compte1,Compte compte2){
      //  this.T=T;
        this.reference=UUID.randomUUID().toString();
        this.timestump=new Date();
        this.comptes=new ArrayList<>();
        this.comptes.add(compte1);
        this.comptes.add(compte2);

        if(compte1.getBanques().equals(compte2.getBanques())) T=TransactionType.VIREST;
        else if (compte1.getBanques().getId().equals(compte2.getBanques().getId())) T=TransactionType.VIRIN;
        else if (compte1.getBanques().getPays().equals(compte2.getBanques().getPays())) T=TransactionType.VIRMULTA;
        else T=TransactionType.VIRCHA;
    }
}
