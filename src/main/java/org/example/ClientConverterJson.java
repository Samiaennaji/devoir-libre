package org.example;
import com.fasterxml.jackson.core.JsonProcessingException;
public class ClientConverterJson {
    public static String toJson(Client client) throws JsonProcessingException {
        return JsonConverter.getMapper().writeValueAsString(client);
    }

    public static Client fromJson(String json) throws JsonProcessingException {
        return JsonConverter.getMapper().readValue(json, Client.class);
    }
}
