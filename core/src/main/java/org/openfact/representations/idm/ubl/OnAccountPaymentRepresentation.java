package org.openfact.representations.idm.ubl;

import java.util.ArrayList;
import java.util.List;

import org.openfact.representations.idm.ubl.type.QuantityType;
import org.openfact.representations.idm.ubl.type.TextType;

/**
 * A scheduled prepayment (on-account payment) for a estimated utility
 * consumption
 * 
 * @author Erik
 * @version 2.1
 * @created 07-Set.-2016 9:16:14 a. m.
 */
public class OnAccountPaymentRepresentation {

    /**
     * The estimated consumed quantity covered by the payment.
     */
    private QuantityType estimatedConsumedQuantity;
    /**
     * Free-form text conveying information that is not contained explicitly in
     * other structures.
     */
    private TextType note;
    private List<PaymentTermsRepresentation> paymentTermses = new ArrayList<>();

}
