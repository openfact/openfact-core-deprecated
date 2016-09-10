package org.openfact.representations.idm.ubl;

import java.util.ArrayList;
import java.util.List;

import org.openfact.representations.idm.ubl.type.CodeType;
import org.openfact.representations.idm.ubl.type.IdentifierType;
import org.openfact.representations.idm.ubl.type.NameType;
import org.openfact.representations.idm.ubl.type.TextType;

/**
 * A class to describe a taxation scheme applying to a party.
 * 
 * @author Erik
 * @version 2.0
 * @created 07-Set.-2016 9:16:31 a. m.
 */
public class PartyTaxSchemeRepresentation {

    /**
     * An identifier for the party assigned for tax purposes by the taxation
     * authority.
     */
    private IdentifierType companyID;
    /**
     * A reason for the party's exemption from tax, expressed as text.
     */
    private TextType exemptionReason;
    /**
     * A reason for the party's exemption from tax, expressed as a code.
     */
    private CodeType exemptionReasonCode;
    /**
     * The name of the party as registered with the relevant fiscal authority.
     */
    private NameType registrationName;
    /**
     * A code signifying the tax level applicable to the party within this
     * taxation scheme.
     */
    private CodeType taxLevelCode;
    private AddressRepresentation registrationAddress;
    private List<TaxSchemeRepresentation> taxSchemes = new ArrayList<>();

}
