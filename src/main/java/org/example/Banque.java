package org.example;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Setter
@Getter

public class Banque {
    private String id;
    private String pays;
    private Set<Compte> comptes;
    //constructeur de banque
    public Banque(String id,String pays){
        this.id=id;
        this.pays=pays;
    }
//methode de recherche de client
    public Client RechercheClient(String numclient){
        for(Compte compte:comptes){
            if(compte.getClients().getNumclient().equals(numclient)) return compte.getClients();
        }
        return null;
    }
    //methode recherche de compte
    public Compte RechercheCompte(String numcompte) {
        for (Compte compte : comptes) {
            if (compte.getNumcompte().equals(numcompte)) return compte;
        }
        return null;
    }
}
