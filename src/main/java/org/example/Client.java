package org.example;
import lombok.Setter;
import lombok.Getter;
import lombok.AllArgsConstructor;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;


@Getter
@Setter

public class Client {
    private String numclient ;
    private String nom;
    private String prenom;
    private String adress;
    private int phone;
    private String email;
    private Set<Compte> comptes;

    public Client(String numclient,String nom,String prenom,String adress,int phone,String email){
     this.numclient=UUID.randomUUID().toString();
     this.nom=nom;
     this.prenom=prenom;
     this.adress=adress;
     this.phone=phone;
     this.email=email;
    }

    public void AjoutClient(Compte compte){
        this.comptes.add(compte);
        compte.setClients(this);
    }
    public void CreationCompte(Banque banque){
        Date datecreation = new Date();
        String numcompte = UUID.randomUUID().toString();
        Compte NewCompte= new Compte(numcompte,datecreation,datecreation,"DHS",banque,this);
        this.comptes.add(NewCompte);

    }


}
