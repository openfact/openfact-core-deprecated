package representation;
import java.util.List; 
import java.util.ArrayList; 
import org.openfact.models.jpa.entities.ublType.*;


/**
 * A document used to order goods and services.
 * @author Erik
 * @version 2.0
 * @created 07-Set.-2016 9:20:53 a. m.
 */
public class OrderRepresentation{

	/**
	 * The buyer's accounting cost centre, applied to the OrderRepresentation as a whole, expressed
	 * as text.
	 */
	private TextType accountingCost;
	/**
	 * The buyer's accounting code, applied to the OrderRepresentation as a whole.
	 */
	private CodeType accountingCostCode;
	/**
	 * Indicates whether this document is a copy (true) or not (false).
	 */
	private IndicatorType copyIndicator;
	/**
	 * A supplementary reference for the Order.
	 */
	private TextType customerReference;
	/**
	 * Identifies a user-defined customization of UBL for a specific use.
	 */
	private IdentifierType customizationID;
	/**
	 * A code signifying the default currency for this document.
	 */
	private CurrencyCodeType codeTypeDocumentCurrencyCode;
	/**
	 * An identifier for this document, assigned by the sender.
	 */
	private IdentifierType ID;
	/**
	 * The date, assigned by the sender, on which this document was issued.
	 */
	private DateType issueDate;
	/**
	 * The time, assigned by the sender, at which this document was issued.
	 */
	private TimeType issueTime;
	/**
	 * The number of orderLines in the document.
	 */
	private NumericType lineCountNumeric;
	/**
	 * Free-form text pertinent to this document, conveying information that is not
	 * contained explicitly in other structures.
	 */
	private TextType note;
	/**
	 * A code signifying the type of Order.
	 */
	private CodeType orderTypeCode;
	/**
	 * A code signifying the currency used for all prices in the Order.
	 */
	private CurrencyCodeType codeTypePricingCurrencyCode;
	/**
	 * Identifies an instance of executing a profile, to associate all transactions in
	 * a collaboration.
	 */
	private IdentifierType profileExecutionID;
	/**
	 * Identifies a user-defined profile of the customization of UBL being used.
	 */
	private IdentifierType profileID;
	/**
	 * A code signifying the currency requested for amount totals in Invoices related
	 * to this Order.
	 */
	private CurrencyCodeType codeTypeRequestedInvoiceCurrencyCode;
	/**
	 * An identifier for the Order, assigned by the seller.
	 */
	private IdentifierType salesOrderID;
	/**
	 * A code signifying the currency requested for tax amounts in Invoices related to
	 * this Order.
	 */
	private CurrencyCodeType codeTypeTaxCurrencyCode;
	/**
	 * Identifies the earliest version of the UBL 2 schema for this document type that
	 * defines all of the elements that might be encountered in the current instance.
	 */
	private IdentifierType UBLVersionID;
	/**
	 * A universally unique identifier for an instance of this document.
	 */
	private IdentifierType UUID;
	private List<AllowanceChargeRepresentation> allowanceCharges = new ArrayList<>();
	private List<CatalogueReferenceRepresentation> catalogueReferences = new ArrayList<>();
	private List<ContractRepresentation> contracts = new ArrayList<>();
	private CountryRepresentation destinationCountry;
	private CustomerPartyRepresentation originatorCustomerParty;
	private CustomerPartyRepresentation accountingCustomerParty;
	private CustomerPartyRepresentation buyerCustomerParty;
	private List<DeliveryRepresentation> deliveries = new ArrayList<>();
	private List<DeliveryTermsRepresentation> deliveriesTerms = new ArrayList<>();
	private DocumentReferenceRepresentation orderDocumentReference;
	private DocumentReferenceRepresentation additionalDocumentReference;
	private DocumentReferenceRepresentation originatorDocumentReference;
	private DocumentReferenceRepresentation quotationDocumentReference;
	private ExchangeRateRepresentation paymentExchangeRate;
	private ExchangeRateRepresentation pricingExchangeRate;
	private ExchangeRateRepresentation taxExchangeRate;
	private MonetaryTotalRepresentation anticipatedMonetaryTotal;
	private List<OrderLineRepresentation> orderLines = new ArrayList<>();
	private PartyRepresentation freightForwarderParty;
	private List<PaymentMeansRepresentation> paymentMeanses = new ArrayList<>();
	private List<PaymentTermsRepresentation> paymentTermses = new ArrayList<>();
	private PeriodRepresentation validityPeriod;
	private List<ProjectReferenceRepresentation> projectReferences = new ArrayList<>();
	private List<SignatureRepresentation> signatures = new ArrayList<>();
	private SupplierPartyRepresentation sellerSupplierParty;
	private List<TaxTotalRepresentation> taxTotals = new ArrayList<>();
	private List<TransactionConditionsRepresentation> transactionConditionses = new ArrayList<>();

}
