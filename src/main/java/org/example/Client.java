package org.example;
import lombok.Setter;
import lombok.Getter;

import java.util.Date;
import java.util.Set;


@Getter
@Setter

public class Client {
    private int numclient ;
    private String nom;
    private String prenom;
    private String adress;
    private int phone;
    private String email;
    private Set<Compte> comptes;

    //constructeur de client
    public Client(int numclient, String nom, String prenom, String adress, String phone, String email){
     this.numclient=numclient;
     this.nom=nom;
     this.prenom=prenom;
     this.adress=adress;
     this.phone= Integer.parseInt(phone);
     this.email=email;
    }
    //methode de l'ajout d'un client
    public void AjoutClient(Compte compte){
        this.comptes.add(compte);
        compte.setClients(this);
    }
    //methode de la creation du compte
    public void CreationCompte(Banque banque){
        Date datecreation = new Date();
        Compte NewCompte= new Compte(numclient,datecreation,datecreation,"DHS",banque,this);
        this.comptes.add(NewCompte);

    }


}
