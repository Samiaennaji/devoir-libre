package org.example;
import lombok.Setter;
import lombok.Getter;
import lombok.AllArgsConstructor;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class Compte {
    private String nomcompte;
    private Date datecreation;
    private Date dateupdate;
    private String device;
}
