package org.openfact.representations.idm.ubl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.openfact.representations.idm.ubl.type.CodeType;
import org.openfact.representations.idm.ubl.type.IdentifierType;

/**
 * A class to describe a payment mandate.
 * 
 * @author Erik
 * @version 2.1
 * @created 07-Set.-2016 9:16:37 a. m.
 */
public class PaymentMandateRepresentation {

    /**
     * An identifier for this payment mandate.
     */
    private IdentifierType ID;
    /**
     * A code signifying the type of this payment mandate.
     */
    private CodeType mandateTypeCode;
    /**
     * The maximum amount to be paid within a single instruction.
     */
    private BigDecimal maximumPaidAmount;
    /**
     * The number of maximum payment instructions allowed within the validity
     * period.
     */
    private BigDecimal maximumPaymentInstructionsNumeric;
    /**
     * An identifier for a signature applied by a signatory party.
     */
    private IdentifierType signatureID;
    private List<ClauseRepresentation> clauses = new ArrayList<>();
    private FinancialAccountRepresentation payerFinancialAccount;
    private PartyRepresentation payerParty;
    private PeriodRepresentation validityPeriod;
    private PeriodRepresentation paymentReversalPeriod;

}
