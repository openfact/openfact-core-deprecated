package org.openfact.services.util;

import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

/**
 * Any class with package org.jboss.resteasy.skeleton.key will use NON_DEFAULT
 * inclusion
 *
 */
@Provider
public class ObjectMapperResolver implements ContextResolver<ObjectMapper> {
	
    protected ObjectMapper mapper = new ObjectMapper();

    public ObjectMapperResolver(boolean indent) {
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        if (indent) {
            mapper.enable(SerializationFeature.INDENT_OUTPUT);
        }

        mapper.registerModule(new JavaTimeModule());
        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        mapper.disable(DeserializationFeature.READ_DATE_TIMESTAMPS_AS_NANOSECONDS); 
    }

    @Override
    public ObjectMapper getContext(Class<?> type) {
        return mapper;
    }

}
