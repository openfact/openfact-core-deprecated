package org.openfact.representations.idm.ubl;

import java.util.ArrayList;
import java.util.List;

import org.openfact.representations.idm.ubl.type.IdentifierType;
import org.openfact.representations.idm.ubl.type.TextType;

/**
 * A class to describe an endorsement of a document.
 * 
 * @author Erik
 * @version 2.0
 * @created 07-Set.-2016 9:14:45 a. m.
 */
public class EndorsementRepresentation {

    /**
     * The status of this endorsement.
     */
    private TextType approvalStatus;
    /**
     * An identifier for this endorsement.
     */
    private IdentifierType documentID;
    /**
     * remarks provided by the endorsing party.
     */
    private TextType remarks;
    private List<EndorserPartyRepresentation> endorserParties = new ArrayList<>();
    private List<SignatureRepresentation> signatures = new ArrayList<>();

}
