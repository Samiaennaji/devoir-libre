package org.testexample;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.example.Banque;
import org.example.BanqueConverterJson;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class BanqueTest {
    @Test
    public void testToJson() throws JsonProcessingException {
        Banque banque = new Banque(1, "Maroc");
        String json = BanqueConverterJson.toJson(banque);

        assertNotNull(json);
        assertTrue(json.contains("Maroc"));
    }

    @Test
    public void testFromJson() throws JsonProcessingException {
        String json = "{\"id\":1,\"pays\":\"Maroc\"}";
        Banque banque = BanqueConverterJson.fromJson(json);

        assertNotNull(banque);
        assertEquals(1, banque.getId());
        assertEquals("Maroc", banque.getPays());
    }
}
