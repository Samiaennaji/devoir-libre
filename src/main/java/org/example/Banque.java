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
}
