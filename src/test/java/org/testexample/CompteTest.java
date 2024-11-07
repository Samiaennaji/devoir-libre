package org.testexample;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.example.Banque;
import org.example.Client;
import org.example.Compte;
import org.example.CompteConverterJson;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
public class CompteTest {
    @Test
    public void testToJson() throws JsonProcessingException {
        Client client = new Client(1, "", "Jean", "123 rue Exemple", "0123456789", "jean.dupont@example.com");
        Banque banque = new Banque(1, "Maroc");
        Compte compte = new Compte(1, new Date(),new Date(), "MAD", banque, client);

        String json = CompteConverterJson.toJson(compte);

        assertNotNull(json);
        assertTrue(json.contains("MAD"));
        assertTrue(json.contains("numCompte"));
    }

    @Test
    public void testFromJson() throws JsonProcessingException {
        String json = "{\"numCompte\":1,\"devise\":\"MAD\",\"client\":{\"numClient\":1,\"nom\":\"Dupont\"},\"banque\":{\"idBanque\":1,\"pays\":\"Maroc\"}}";
        Compte compte = CompteConverterJson.fromJson(json);

        assertNotNull(compte);
        assertEquals("MAD", compte.getDevise());
        assertEquals(1, compte.getNumcompte());
    }
}
