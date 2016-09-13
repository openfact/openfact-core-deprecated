package org.openfact.models.ubl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.openfact.models.ubl.type.*;

/**
 * A class to describe a line item.
 * 
 * @author Erik
 * @version 2.0
 * @created 07-Set.-2016 9:15:55 a. m.
 */
public class LineItemModel {

    /**
     * The buyer's accounting cost centre for this line item, expressed as text.
     */
    private TextModel accountingCost;
    /**
     * The buyer's accounting cost centre for this line item, expressed as a
     * code.
     */
    private CodeModel accountingCostCode;
    /**
     * An indicator that back order is allowed (true) or not (false).
     */
    private boolean backOrderAllowedIndicator;
    /**
     * An identifier for this line item, assigned by the buyer.
     */
    private IdentifierModel ID;
    /**
     * A code signifying the inspection requirements for the item associated
     * with this line item.
     */
    private CodeModel inspectionMethodCode;
    /**
     * The total amount for this line item, including allowance charges but net
     * of taxes.
     */
    private BigDecimal lineExtensionAmount;
    /**
     * A code signifying the status of this line item with respect to its
     * original state.
     */
    private LineStatusCodeModel lineStatusCode;
    /**
     * The maximum back order quantity of the item associated with this line
     * (where back order is allowed).
     */
    private QuantityModel maximumBackorderQuantity;
    /**
     * The maximum quantity of the item associated with this line.
     */
    private QuantityModel maximumQuantity;
    /**
     * The minimum back order quantity of the item associated with this line
     * (where back order is allowed).
     */
    private QuantityModel minimumBackorderQuantity;
    /**
     * The minimum quantity of the item associated with this line.
     */
    private QuantityModel minimumQuantity;
    /**
     * Free-form text conveying information that is not contained explicitly in
     * other structures.
     */
    private TextModel note;
    /**
     * An indicator that a partial delivery is allowed (true) or not (false).
     */
    private boolean partialDeliveryIndicator;
    /**
     * The quantity of items associated with this line item.
     */
    private QuantityModel quantity;
    /**
     * An identifier for this line item, assigned by the seller.
     */
    private IdentifierModel salesOrderID;
    /**
     * The total tax amount for this line item.
     */
    private BigDecimal totalTaxAmount;
    /**
     * A universally unique identifier for this line item.
     */
    private IdentifierModel UUID;
    /**
     * Text describing a warranty (provided by WarrantyParty) for the good or
     * service described in this line item.
     */
    private TextModel warrantyInformation;
    private List<AllowanceChargeModel> allowanceCharges = new ArrayList<>();
    private List<DeliveryModel> deliveries = new ArrayList<>();
    private List<DeliveryTermsModel> deliveriesTerms = new ArrayList<>();
    private List<ItemModel> items = new ArrayList<>();
    private LineItemModel subLineItem;
    private List<LineReferenceModel> lineReferences = new ArrayList<>();
    private PartyModel originatorParty;
    private PartyModel warrantyParty;
    private PeriodModel warrantyValidityPeriod;
    private List<OrderedShipmentModel> orderedShipments = new ArrayList<>();
    private List<PriceModel> prices = new ArrayList<>();
    private PriceExtensionModel itemPriceExtension;
    private List<PricingReferenceModel> pricingReferences = new ArrayList<>();
    private List<TaxTotalModel> taxTotals = new ArrayList<>();

}