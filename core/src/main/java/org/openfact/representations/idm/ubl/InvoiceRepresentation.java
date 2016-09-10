package org.openfact.representations.idm.ubl;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.openfact.representations.idm.ubl.type.CodeType;
import org.openfact.representations.idm.ubl.type.CurrencyCodeType;
import org.openfact.representations.idm.ubl.type.IdentifierType;
import org.openfact.representations.idm.ubl.type.TextType;

/**
 * A document used to request payment.
 * 
 * @author Erik
 * @version 2.0
 * @created 07-Set.-2016 9:20:49 a. m.
 */
public class InvoiceRepresentation {

    /**
     * The buyer's accounting code, applied to the InvoiceRepresentation as a
     * whole, expressed as text.
     */
    private TextType accountingCost;
    /**
     * The buyer's accounting code, applied to the InvoiceRepresentation as a
     * whole.
     */
    private CodeType accountingCostCode;
    /**
     * A reference provided by the buyer used for internal routing of the
     * document.
     */
    private TextType buyerReference;
    /**
     * Indicates whether this document is a copy (true) or not (false).
     */
    private boolean copyIndicator;
    /**
     * Identifies a user-defined customization of UBL for a specific use.
     */
    private IdentifierType customizationID;
    /**
     * A code signifying the default currency for this document.
     */
    private CurrencyCodeType codeTypeDocumentCurrencyCode;
    /**
     * The date on which InvoiceRepresentation is due.
     */
    private LocalDate dueDate;
    /**
     * An identifier for this document, assigned by the sender.
     */
    private IdentifierType ID;
    /**
     * A code signifying the type of the Invoice.
     */
    private CodeType invoiceTypeCode;
    /**
     * The date, assigned by the sender, on which this document was issued.
     */
    private LocalDate issueDate;
    /**
     * The time, assigned by the sender, at which this document was issued.
     */
    private LocalTime issueTime;
    /**
     * The number of lines in the document.
     */
    private BigDecimal lineCountNumeric;
    /**
     * Free-form text pertinent to this document, conveying information that is
     * not contained explicitly in other structures.
     */
    private TextType note;
    /**
     * A code signifying the alternative currency used for payment in the
     * Invoice.
     */
    private CurrencyCodeType codeTypePaymentAlternativeCurrencyCode;
    /**
     * A code signifying the currency used for payment in the Invoice.
     */
    private CurrencyCodeType codeTypePaymentCurrencyCode;
    /**
     * A code signifying the currency used for prices in the Invoice.
     */
    private CurrencyCodeType codeTypePricingCurrencyCode;
    /**
     * Identifies an instance of executing a profile, to associate all
     * transactions in a collaboration.
     */
    private IdentifierType profileExecutionID;
    /**
     * Identifies a user-defined profile of the customization of UBL being used.
     */
    private IdentifierType profileID;
    /**
     * A code signifying the currency used for tax amounts in the Invoice.
     */
    private CurrencyCodeType codeTypeTaxCurrencyCode;
    /**
     * The date of the Invoice, used to indicate the point at which tax becomes
     * applicable.
     */
    private LocalDate taxPointDate;
    /**
     * Identifies the earliest version of the UBL 2 schema for this document
     * type that defines all of the elements that might be encountered in the
     * current instance.
     */
    private IdentifierType UBLVersionID;
    /**
     * A universally unique identifier for an instance of this document.
     */
    private IdentifierType UUID;
    private List<AllowanceChargeRepresentation> allowanceCharges = new ArrayList<>();
    private List<BillingReferenceRepresentation> billingReferences = new ArrayList<>();
    private CustomerPartyRepresentation accountingCustomerParty;
    private CustomerPartyRepresentation buyerCustomerParty;
    private List<DeliveryRepresentation> deliveries = new ArrayList<>();
    private List<DeliveryTermsRepresentation> deliveriesTerms = new ArrayList<>();
    private DocumentReferenceRepresentation statementDocumentReference;
    private DocumentReferenceRepresentation receiptDocumentReference;
    private DocumentReferenceRepresentation despatchDocumentReference;
    private DocumentReferenceRepresentation originatorDocumentReference;
    private DocumentReferenceRepresentation contractDocumentReference;
    private DocumentReferenceRepresentation additionalDocumentReference;
    private ExchangeRateRepresentation taxExchangeRate;
    private ExchangeRateRepresentation pricingExchangeRate;
    private ExchangeRateRepresentation paymentExchangeRate;
    private ExchangeRateRepresentation paymentAlternativeExchangeRate;
    private List<InvoiceLineRepresentation> invoiceLines = new ArrayList<>();
    private MonetaryTotalRepresentation legalMonetaryTotal;
    private List<OrderReferenceRepresentation> orderReferences = new ArrayList<>();
    private PartyRepresentation taxRepresentativeParty;
    private PartyRepresentation payeeParty;
    private PaymentRepresentation prepaidPayment;
    private List<PaymentMeansRepresentation> paymentMeanses = new ArrayList<>();
    private List<PaymentTermsRepresentation> paymentTermses = new ArrayList<>();
    private PeriodRepresentation invoicePeriod;
    private List<ProjectReferenceRepresentation> projectReferences = new ArrayList<>();
    private List<SignatureRepresentation> signatures = new ArrayList<>();
    private SupplierPartyRepresentation accountingSupplierParty;
    private SupplierPartyRepresentation sellerSupplierParty;
    private List<TaxTotalRepresentation> withholdingTaxTotal = new ArrayList<>();
    private List<TaxTotalRepresentation> taxTotals = new ArrayList<>();

}
