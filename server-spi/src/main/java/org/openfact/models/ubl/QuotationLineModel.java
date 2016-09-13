package org.openfact.models.ubl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.openfact.models.ubl.type.*;

/**
 * A class to define a line in a Quotation.
 * 
 * @author Erik
 * @version 2.0
 * @created 07-Set.-2016 9:17:16 a. m.
 */
public class QuotationLineModel {

    /**
     * An identifier for this quotation line.
     */
    private IdentifierModel ID;
    /**
     * The total amount for this quotation line, including allowance charges but
     * net of taxes.
     */
    private BigDecimal lineExtensionAmount;
    /**
     * Free-form text conveying information that is not contained explicitly in
     * other structures.
     */
    private TextModel note;
    /**
     * The quantity of the item quoted.
     */
    private QuantityModel quantity;
    /**
     * An identifier for the line in the Request for QuotationModel to which
     * this line is a response.
     */
    private IdentifierModel requestForQuotationLineID;
    /**
     * The total tax amount for this quotation line.
     */
    private BigDecimal totalTaxAmount;
    private List<DocumentReferenceModel> documentReferences = new ArrayList<>();
    private List<LineItemModel> lineItems = new ArrayList<>();
    private List<LineItemModel> sellerProposedSubstituteLineItem = new ArrayList<>();
    private List<LineItemModel> alternativeLineItem = new ArrayList<>();
    private LineReferenceModel requestLineReference;

}