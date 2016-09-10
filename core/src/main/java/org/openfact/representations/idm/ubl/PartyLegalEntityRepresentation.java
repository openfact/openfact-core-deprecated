package org.openfact.representations.idm.ubl;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.openfact.representations.idm.ubl.type.CodeType;
import org.openfact.representations.idm.ubl.type.IdentifierType;
import org.openfact.representations.idm.ubl.type.NameType;
import org.openfact.representations.idm.ubl.type.TextType;

/**
 * A class to describe a party as a legal entity.
 * 
 * @author Erik
 * @version 2.0
 * @created 07-Set.-2016 9:16:28 a. m.
 */
public class PartyLegalEntityRepresentation {

    /**
     * An identifier for the party as registered within a company registration
     * scheme.
     */
    private IdentifierType companyID;
    /**
     * The company legal status, expressed as a text.
     */
    private TextType companyLegalForm;
    /**
     * A code signifying the party's legal status.
     */
    private CodeType companyLegalFormCode;
    /**
     * A code signifying the party's liquidation status.
     */
    private CodeType companyLiquidationStatusCode;
    /**
     * The number of shares in the capital stock of a corporation.
     */
    private BigDecimal corporateStockAmount;
    /**
     * An indicator that all shares of corporate stock have been paid by
     * shareholders (true) or not (false).
     */
    private boolean fullyPaidSharesIndicator;
    /**
     * The registration date of the CompanyID.
     */
    private LocalDate registrationDate;
    /**
     * The date upon which a registration expires (e.g., registration for an
     * import/export license).
     */
    private LocalDate registrationExpirationDate;
    /**
     * The name of the party as registered with the relevant legal authority.
     */
    private NameType registrationName;
    /**
     * An indicator that the company is owned and controlled by one person
     * (true) or not (false).
     */
    private boolean soleProprietorshipIndicator;
    private AddressRepresentation registrationAddress;
    private List<CorporateRegistrationSchemeRepresentation> corporateRegistrationSchemes = new ArrayList<>();
    private PartyRepresentation headOfficeParty;
    private List<ShareholderPartyRepresentation> shareholderParties = new ArrayList<>();

}
