package org.example;
import lombok.Setter;
import lombok.Getter;
import lombok.AllArgsConstructor;

import java.util.Date;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
public class Compte {
    private String nomcompte;
    private Date datecreation;
    private Date dateupdate;
    private String device;
    private Banque banques;
    private Client clients;
    private Set<Transaction> transactions;

}
