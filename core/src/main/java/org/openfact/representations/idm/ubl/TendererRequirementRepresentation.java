package org.openfact.representations.idm.ubl;

import org.openfact.representations.idm.ubl.type.CodeType;
import org.openfact.representations.idm.ubl.type.NameType;
import org.openfact.representations.idm.ubl.type.TextType;

/**
 * A class to describe an action or statement required of an economic operator
 * participating in a tendering process.
 * 
 * @author Erik
 * @version 2.1
 * @created 07-Set.-2016 9:18:26 a. m.
 */
public class TendererRequirementRepresentation {

    /**
     * Text describing this requirement.
     */
    private TextType description;
    /**
     * The legal reference of the exclusion criterion.
     */
    private TextType legalReference;
    /**
     * A name of this tenderer requirement.
     */
    private NameType name;
    /**
     * A code signifying this requirement.
     */
    private CodeType tendererRequirementTypeCode;
    private EvidenceRepresentation suggestedEvidence;

}
