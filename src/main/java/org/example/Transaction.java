package org.example;
import lombok.Setter;
import lombok.Getter;
import lombok.AllArgsConstructor;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class Transaction {
    private final TransactionType T;
    private final Date timestump;
    private final String reference;
}
