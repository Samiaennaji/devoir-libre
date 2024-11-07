package org.example;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

import java.util.Set;

@Setter
@Getter
@AllArgsConstructor

public class Banque {
    private String id;
    private String pays;
    private Set<Compte> comptes;

    public Client Recherche(String numclient){
        for(Compte compte:comptes){
            if(compte.getClients().getNumclient().equals(numclient)) return compte.getClients();
        }
    }
}
