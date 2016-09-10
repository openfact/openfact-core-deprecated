package org.openfact.representations.idm.ubl;

import java.util.ArrayList;
import java.util.List;

import org.openfact.representations.idm.ubl.type.CodeType;
import org.openfact.representations.idm.ubl.type.IdentifierType;
import org.openfact.representations.idm.ubl.type.TextType;

/**
 * A class to describe directions for preparing a tender.
 * 
 * @author Erik
 * @version 2.1
 * @created 07-Set.-2016 9:18:16 a. m.
 */
public class TenderPreparationRepresentation {

    /**
     * Text describing the tender envelope.
     */
    private TextType description;
    /**
     * An identifier for the open tender associated with this tender
     * preparation.
     */
    private IdentifierType openTenderID;
    /**
     * An identifier for the tender envelope to be used with the tender.
     */
    private IdentifierType tenderEnvelopeID;
    /**
     * A code signifying the type of tender envelope (economical or objective
     * criteria versus technical or subjective criteria).
     */
    private CodeType tenderEnvelopeTypeCode;
    private List<ProcurementProjectLotRepresentation> procurementProjectLots = new ArrayList<>();
    private TenderRequirementRepresentation documentTenderRequirement;

}
