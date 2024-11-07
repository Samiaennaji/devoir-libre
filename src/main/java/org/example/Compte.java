package org.example;
import lombok.Setter;
import lombok.Getter;
import lombok.AllArgsConstructor;

import java.util.Date;
import java.util.Set;

@Getter
@Setter
public class Compte {
    private String numcompte;
    private Date datecreation;
    private Date dateupdate;
    private String devise;
    private Banque banques;
    private Client clients;
    private Set<Transaction> transactions;

    public Compte (){

    }

}
