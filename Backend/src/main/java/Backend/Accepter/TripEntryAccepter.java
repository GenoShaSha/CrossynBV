package Backend.Accepter;

import Backend.Classes.TripEntry;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.util.List;

public class TripEntryAccepter
{
    public TripEntryAccepter(){

    }

    public List<TripEntry> TurnJSONStringToObject(String JSON) throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        TypeReference<List<TripEntry>> listType = new TypeReference<>() {};
        return mapper.readValue(JSON, listType);
    }
}
