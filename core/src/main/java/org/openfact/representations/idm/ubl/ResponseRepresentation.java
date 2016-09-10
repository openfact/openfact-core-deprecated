package org.openfact.representations.idm.ubl;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.openfact.representations.idm.ubl.type.CodeType;
import org.openfact.representations.idm.ubl.type.IdentifierType;
import org.openfact.representations.idm.ubl.type.TextType;

/**
 * A class to describe an application-level response to a document.
 * 
 * @author Erik
 * @version 2.0
 * @created 07-Set.-2016 9:17:32 a. m.
 */
public class ResponseRepresentation {

    /**
     * Text describing this response.
     */
    private TextType description;
    /**
     * The date upon which this response is valid.
     */
    private LocalDate effectiveDate;
    /**
     * The time at which this response is valid.
     */
    private LocalTime effectiveTime;
    /**
     * An identifier for the section (or line) of the document to which this
     * response applies.
     */
    private IdentifierType referenceID;
    /**
     * A code signifying the type of response.
     */
    private CodeType responseCode;
    private List<StatusRepresentation> statuses = new ArrayList<>();

}
