package org.example;
import lombok.Setter;
import lombok.Getter;
import lombok.AllArgsConstructor;
@Getter
@Setter
@AllArgsConstructor
public class Client {
    private String numclient ;
    private String nom;
    private String prenom;
    private String adress;
    private int phone;
    private String email;
}
