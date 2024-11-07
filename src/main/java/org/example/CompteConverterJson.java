package org.example;
import com.fasterxml.jackson.core.JsonProcessingException;
public class CompteConverterJson {
    public static String toJson(Compte compte) throws JsonProcessingException {
        return JsonConverter.getMapper().writeValueAsString(compte);
    }

    public static Compte fromJson(String json) throws JsonProcessingException {
        return JsonConverter.getMapper().readValue(json, Compte.class);
    }
}
