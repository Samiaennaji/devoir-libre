package org.example;
import lombok.Setter;
import lombok.Getter;

import java.util.Date;
import java.util.Set;

@Getter
@Setter
public class Compte {
    private int numcompte;
    private Date datecreation;
    private Date dateupdate;
    private String devise;
    private Banque banques;
    private Client clients;
    private Set<Transaction> transactions;

    //constructeur du compte
    public Compte(int numcompte, Date datecreation, Date date, String dhs, Banque banque, Client client){
        this.numcompte=numcompte;
        this.datecreation=new Date();
        this.dateupdate=new Date();
        this.devise=dhs;
        this.banques=banque;
        this.clients=client;
    }


}
