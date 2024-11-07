package org.testexample;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.example.Client;
import org.example.ClientConverterJson;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ClientTest {

    @Test
    public void testToJson() throws JsonProcessingException {
        Client client = new Client(1, "Ennaji", "Samia", " rue1", "0123456789", "samia.ennaji@example.com");
        String json = ClientConverterJson.toJson(client);

        assertNotNull(json);
        assertTrue(json.contains("Ennaji"));
        assertTrue(json.contains("Samia"));
    }

    @Test
    public void testFromJson() throws JsonProcessingException {
        String json = "{\"numClient\":1,\"nom\":\"ennaji\",\"prenom\":\"samia\",\"adresse\":\"rue1\",\"phone\":\"0123456789\",\"email\":\"samia.ennaji@example.com\"}";
        Client client = ClientConverterJson.fromJson(json);

        assertNotNull(client);
        assertEquals("Ennaji", client.getNom());
        assertEquals("Samia", client.getPrenom());
    }
}
