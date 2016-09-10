package org.openfact.representations.idm.ubl;

import org.openfact.representations.idm.ubl.type.IdentifierType;
import org.openfact.representations.idm.ubl.type.NameType;
import org.openfact.representations.idm.ubl.type.TextType;

/**
 * A class to describe a contactable person or department in an organization.
 * 
 * @author Erik
 * @version 2.0
 * @created 07-Set.-2016 9:13:58 a. m.
 */
public class ContactRepresentation {

    /**
     * The primary email address of this contact.
     */
    private TextType electronicMail;
    /**
     * An identifier for this contact.
     */
    private IdentifierType ID;
    /**
     * The name of this contact. It is recommended that this be used for a
     * functional name and not a personal name.
     */
    private NameType name;
    /**
     * Free-form text conveying information that is not contained explicitly in
     * other structures; in particular, a textual description of the
     * circumstances under which this contact can be used (e.g., "emergency" or
     * "after hours").
     */
    private TextType note;
    /**
     * The primary fax number of this contact.
     */
    private TextType telefax;
    /**
     * The primary telephone number of this contact.
     */
    private TextType telephone;
    private CommunicationRepresentation otherCommunication;

}
