package org.testexample;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.example.*;
import org.junit.jupiter.api.Test;

import java.util.Date;


import static org.junit.jupiter.api.Assertions.*;
public class TransactionTest {
    @Test
    public void testToJson() throws JsonProcessingException {
        Client client = new Client(1, "Ennaji", "Samia", "rue1", "0123456789", "samia.ennaji@example.com");
        Banque banque = new Banque(1, "Maroc");
        Compte compte1 = new Compte(1, new Date(),new  Date(), "MAD", banque, client);
        Compte compte2 = new Compte(2, new Date(),new  Date(), "MAD", banque, client);

        Transaction transaction = new Transaction(compte1,compte2);
        String json = TransactionConverterJson.toJson(transaction);

        assertNotNull(json);
        assertTrue(json.contains("REF123"));
    }

    @Test
    public void testFromJson() throws JsonProcessingException {
        String json = "{\"reference\":\"REF123\",\"timestamp\":\"2024-11-07 12:00:00\",\"comptes\":[{\"numCompte\":1,\"devise\":\"MAD\"}]}";
        Transaction transaction = TransactionConverterJson.fromJson(json);

        assertNotNull(transaction);
        assertEquals("REF123", transaction.getReference());
        assertNotNull(transaction.getTimestump());
    }
}
