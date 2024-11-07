package org.example;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;
import java.util.Set;

@Setter
@Getter

public class Banque {
    private int id;
    private String pays;
    private Set<Compte> comptes;
    //constructeur de banque
    public Banque(int id,String pays){
        this.id=id;
        this.pays=pays;
    }
//methode de recherche de client
    public Client RechercheClient(String numclient){
        for(Compte compte:comptes){
            if(Objects.equals(compte.getClients().getNumclient(), numclient)) return compte.getClients();
        }
        return null;
    }
    //methode recherche de compte
    public Compte RechercheCompte(String numcompte) {
        for (Compte compte : comptes) {
            if (Objects.equals(compte.getNumcompte(), numcompte)){ return compte;}
        }
        return null;
    }
}
