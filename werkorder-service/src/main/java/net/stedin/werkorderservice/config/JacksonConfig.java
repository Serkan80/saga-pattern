package net.stedin.werkorderservice.config;

import java.time.ZoneId;
import java.util.TimeZone;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Singleton;
import javax.ws.rs.Produces;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.util.StdDateFormat;

/**
 * JacksonConfig
 */
@ApplicationScoped
public class JacksonConfig {

    @Singleton
    @Produces
    public ObjectMapper objectMapper() {
        ObjectMapper mapper = new ObjectMapper();
        Jav
        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        mapper.setDateFormat(new StdDateFormat().withTimeZone(TimeZone.getTimeZone(ZoneId.of("Europe/Amsterdam")))
                .withColonInTimeZone(true));
        return mapper;
    }
}