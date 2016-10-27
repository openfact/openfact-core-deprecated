//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.14 at 11:44:49 AM PET 
//

package org.openfact.models.jpa.entities.ubl;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import org.openfact.models.enums.RequeridActionDocument;
import org.openfact.models.jpa.entities.OrganizationEntity;
import org.openfact.models.jpa.entities.ubl.common.AllowanceChargeEntity;
import org.openfact.models.jpa.entities.ubl.common.BillingReferenceEntity;
import org.openfact.models.jpa.entities.ubl.common.CreditNoteLineEntity;
import org.openfact.models.jpa.entities.ubl.common.CustomerPartyEntity;
import org.openfact.models.jpa.entities.ubl.common.DocumentReferenceEntity;
import org.openfact.models.jpa.entities.ubl.common.ExchangeRateEntity;
import org.openfact.models.jpa.entities.ubl.common.MonetaryTotalEntity;
import org.openfact.models.jpa.entities.ubl.common.OrderReferenceEntity;
import org.openfact.models.jpa.entities.ubl.common.PartyEntity;
import org.openfact.models.jpa.entities.ubl.common.PeriodEntity;
import org.openfact.models.jpa.entities.ubl.common.ResponseEntity;
import org.openfact.models.jpa.entities.ubl.common.SignatureEntity;
import org.openfact.models.jpa.entities.ubl.common.SupplierPartyEntity;
import org.openfact.models.jpa.entities.ubl.common.TaxTotalEntity;
import org.openfact.models.jpa.entities.ubl.common.UBLExtensionsEntity;

@Entity
@Table(name = "CREDIT_NOTE", uniqueConstraints = { @UniqueConstraint(columnNames = { "ORGANIZATION_ID", "ID_UBL" }) })
@NamedQueries({
		@NamedQuery(name = "getAllCreditNotesByOrganization", query = "select i from CreditNoteEntity i where i.organization.id = :organizationId order by i.issueDateTime"),
		@NamedQuery(name = "getOrganizationCreditNoteById", query = "select i from CreditNoteEntity i where i.id = :id and i.organization.id = :organizationId"),
		@NamedQuery(name = "getOrganizationCreditNoteByID", query = "select i from CreditNoteEntity i where i.ID = :ID and i.organization.id = :organizationId"),
		@NamedQuery(name = "searchForCreditNote", query = "select i from CreditNoteEntity i where i.organization.id = :organizationId and i.ID like :search order by i.issueDateTime"),
		@NamedQuery(name = "getOrganizationCreditNoteCount", query = "select count(i) from CreditNoteEntity i where i.organization.id = :organizationId"),
		@NamedQuery(name = "getLastCreditNoteByOrganization", query = "select i from CreditNoteEntity i where i.organization.id = :organizationId and length(i.ID)=:IDLength and i.ID like :formatter order by i.issueDateTime desc"), })
public class CreditNoteEntity {

	@Id
	@Column(name = "ID")
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Access(AccessType.PROPERTY)
	protected String id;

	@OneToMany(cascade = CascadeType.REMOVE, orphanRemoval = true, mappedBy = "creditNote")
	protected Collection<CreditNoteAttributeEntity> attributes = new ArrayList<>();

	@ManyToMany(mappedBy = "creditNotes", cascade = { CascadeType.ALL })
	protected List<SendEventEntity> sendEvents = new ArrayList<>();

	@NotNull
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(foreignKey = @ForeignKey, name = "ORGANIZATION_ID")
	private OrganizationEntity organization;

	/**
	 * */
	@ManyToOne(targetEntity = UBLExtensionsEntity.class, cascade = { CascadeType.ALL })
	@JoinColumn(name = "UBLEXTENSIONS_CREDITNOTE")
	protected UBLExtensionsEntity ublExtensions = new UBLExtensionsEntity();

	@Column(name = "UBL_VERSIONID")
	protected String ublVersionID;

	@Column(name = "CUSTOMIZATIONID")
	protected String customizationID;

	@Column(name = "PROFILEID")
	protected String profileID;

	@Column(name = "ID_UBL")
	protected String ID;

	@Column(name = "COPY_INDICATOR")
	@Type(type = "org.hibernate.type.NumericBooleanType")
	protected boolean copyIndicator;

	@Column(name = "UUID")
	protected String uuid;

	@Column(name = "ISSUE_DATE")
	@Type(type = "org.hibernate.type.LocalDateTimeType")
	protected LocalDateTime issueDateTime;

	@Column(name = "TAX_POINT_DATE")
	@Type(type = "org.hibernate.type.LocalDateType")
	protected LocalDate taxPointDate;

	@ElementCollection
	@Column(name = "VALUE")
	@CollectionTable(name = "NOTE_CREDITNOTE", joinColumns = { @JoinColumn(name = "CREDITNOTE_ID") })
	protected List<String> note = new ArrayList<>();

	@Column(name = "DOCUMENT_CURRENCY_CODE")
	protected String documentCurrencyCode;

	@Column(name = "TAX_CURRENCY_CODE")
	protected String taxCurrencyCode;

	@Column(name = "PRICING_CURRENCY_CODE")
	protected String pricingCurrencyCode;

	@Column(name = "PAYMENT_CURRENCY_CODE")
	protected String paymentCurrencyCode;

	@Column(name = "PAYMENT_ALTERNATIVE_CURRENCY_CODE")
	protected String paymentAlternativeCurrencyCode;

	@Column(name = "ACCOUNTING_COST_CODE")
	protected String accountingCostCode;

	@Column(name = "ACCOUNTING_COST")
	protected String accountingCost;

	@Column(name = "LINE_COUNT_NUMERIC")
	protected BigDecimal lineCountNumeric;

	@OneToMany(targetEntity = PeriodEntity.class, cascade = { CascadeType.ALL })
	@JoinColumn(name = "INVOICEPERIOD_CREDITNOTE")
	protected List<PeriodEntity> invoicePeriod = new ArrayList<>();

	@OneToMany(targetEntity = ResponseEntity.class, cascade = { CascadeType.ALL })
	@JoinColumn(name = "DISCREPANCYRESPONSE_CREDITNOTE")
	protected List<ResponseEntity> discrepancyResponse = new ArrayList<>();

	@ManyToOne(targetEntity = OrderReferenceEntity.class, cascade = { CascadeType.ALL })
	@JoinColumn(name = "ORDERREFERENCE_CREDITNOTE")
	protected OrderReferenceEntity orderReference = new OrderReferenceEntity();

	@OneToMany(targetEntity = BillingReferenceEntity.class, cascade = { CascadeType.ALL })
	@JoinColumn(name = "BILLINGREFERENCE_CREDITNOTE")
	protected List<BillingReferenceEntity> billingReference = new ArrayList<>();

	@OneToMany(targetEntity = DocumentReferenceEntity.class, cascade = { CascadeType.ALL })
	@JoinColumn(name = "DESPATCHDOCUMENTREFERENCE_CREDITNOTE")
	protected List<DocumentReferenceEntity> despatchDocumentReference = new ArrayList<>();

	@OneToMany(targetEntity = DocumentReferenceEntity.class, cascade = { CascadeType.ALL })
	@JoinColumn(name = "RECEIPTDOCUMENTREFERENCE_CREDITNOTE")
	protected List<DocumentReferenceEntity> receiptDocumentReference = new ArrayList<>();

	@OneToMany(targetEntity = DocumentReferenceEntity.class, cascade = { CascadeType.ALL })
	@JoinColumn(name = "CONTRACTDOCUMENTREFERENCE_CREDITNOTE")
	protected List<DocumentReferenceEntity> contractDocumentReference = new ArrayList<>();

	@OneToMany(targetEntity = DocumentReferenceEntity.class, cascade = { CascadeType.ALL })
	@JoinColumn(name = "ADDITIONALDOCUMENTREFERENCE_CREDITNOTE")
	protected List<DocumentReferenceEntity> additionalDocumentReference = new ArrayList<>();

	@OneToMany(targetEntity = SignatureEntity.class, cascade = { CascadeType.ALL })
	@JoinColumn(name = "SIGNATURE_CREDITNOTETYPE_ID")
	protected List<SignatureEntity> signature = new ArrayList<>();

	@ManyToOne(targetEntity = SupplierPartyEntity.class, cascade = { CascadeType.ALL })
	@JoinColumn(name = "ACCOUNTINGSUPPLIERPARTY_CREDITNOTE")
	protected SupplierPartyEntity accountingSupplierParty = new SupplierPartyEntity();

	@ManyToOne(targetEntity = CustomerPartyEntity.class, cascade = { CascadeType.ALL })
	@JoinColumn(name = "ACCOUNTINGCUSTOMERPARTY_CREDITNOTE")
	protected CustomerPartyEntity accountingCustomerParty = new CustomerPartyEntity();

	@ManyToOne(targetEntity = PartyEntity.class, cascade = { CascadeType.ALL })
	@JoinColumn(name = "PAYEEPARTY_CREDITNOTE_ID")
	protected PartyEntity payeeParty = new PartyEntity();

	@ManyToOne(targetEntity = PartyEntity.class, cascade = { CascadeType.ALL })
	@JoinColumn(name = "TAXREPRESENTATIVEPARTY_CREDITNOTE")
	protected PartyEntity taxRepresentativeParty = new PartyEntity();

	@ManyToOne(targetEntity = ExchangeRateEntity.class, cascade = { CascadeType.ALL })
	@JoinColumn(name = "TAXEXCHANGERATE_CREDITNOTE")
	protected ExchangeRateEntity taxExchangeRate = new ExchangeRateEntity();

	@ManyToOne(targetEntity = ExchangeRateEntity.class, cascade = { CascadeType.ALL })
	@JoinColumn(name = "PRICINGEXCHANGERATE_CREDITNOTE")
	protected ExchangeRateEntity pricingExchangeRate = new ExchangeRateEntity();

	@ManyToOne(targetEntity = ExchangeRateEntity.class, cascade = { CascadeType.ALL })
	@JoinColumn(name = "PAYMENTEXCHANGERATE_CREDITNOTE")
	protected ExchangeRateEntity paymentExchangeRate = new ExchangeRateEntity();

	@ManyToOne(targetEntity = ExchangeRateEntity.class, cascade = { CascadeType.ALL })
	@JoinColumn(name = "PAYMENTALTERNATIVEEXCHANGERATE_CREDITNOTE")
	protected ExchangeRateEntity paymentAlternativeExchangeRate = new ExchangeRateEntity();

	@OneToMany(targetEntity = AllowanceChargeEntity.class, cascade = { CascadeType.ALL })
	@JoinColumn(name = "ALLOWANCECHARGE_CREDITNOTE")
	protected List<AllowanceChargeEntity> allowanceCharge = new ArrayList<>();

	@OneToMany(targetEntity = TaxTotalEntity.class, cascade = { CascadeType.ALL })
	@JoinColumn(name = "TAXTOTAL_CREDITNOTE_ID")
	protected List<TaxTotalEntity> taxTotal = new ArrayList<>();

	@ManyToOne(targetEntity = MonetaryTotalEntity.class, cascade = { CascadeType.ALL })
	@JoinColumn(name = "LEGALMONETARYTOTAL_CREDITNOT_0")
	protected MonetaryTotalEntity legalMonetaryTotal = new MonetaryTotalEntity();

	@OneToMany(targetEntity = CreditNoteLineEntity.class, cascade = { CascadeType.ALL })
	@JoinColumn(name = "CREDITNOTELINE_CREDITNOTE")
	protected List<CreditNoteLineEntity> creditNoteLine = new ArrayList<>();

	@Lob
	@Column(name = "XML_DOCUMENT")
	protected Byte[] xmlDocument;

	@ElementCollection
	@Column(name = "REQUERID_ACTION")
	@CollectionTable(name = "CREDITNOTE_REQUERID_ACTION", joinColumns = { @JoinColumn(name = "CREDITNOTE_ID") })
	@Enumerated(EnumType.STRING)
	protected List<RequeridActionDocument> requeridAction = new ArrayList<>();

	public Byte[] getXmlDocument() {
		return xmlDocument;
	}

	public void setXmlDocument(Byte[] xmlDocument) {
		this.xmlDocument = xmlDocument;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Collection<CreditNoteAttributeEntity> getAttributes() {
		return attributes;
	}

	public void setAttributes(Collection<CreditNoteAttributeEntity> attributes) {
		this.attributes = attributes;
	}

	public OrganizationEntity getOrganization() {
		return organization;
	}

	public void setOrganization(OrganizationEntity organization) {
		this.organization = organization;
	}

	public UBLExtensionsEntity getUblExtensions() {
		return ublExtensions;
	}

	public void setUblExtensions(UBLExtensionsEntity ublExtensions) {
		this.ublExtensions = ublExtensions;
	}

	public String getUblVersionID() {
		return ublVersionID;
	}

	public void setUblVersionID(String ublVersionID) {
		this.ublVersionID = ublVersionID;
	}

	public String getCustomizationID() {
		return customizationID;
	}

	public void setCustomizationID(String customizationID) {
		this.customizationID = customizationID;
	}

	public String getProfileID() {
		return profileID;
	}

	public void setProfileID(String profileID) {
		this.profileID = profileID;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public boolean isCopyIndicator() {
		return copyIndicator;
	}

	public void setCopyIndicator(boolean copyIndicator) {
		this.copyIndicator = copyIndicator;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public LocalDateTime getIssueDateTime() {
		return issueDateTime;
	}

	public void setIssueDateTime(LocalDateTime issueDateTime) {
		this.issueDateTime = issueDateTime;
	}

	public LocalDate getTaxPointDate() {
		return taxPointDate;
	}

	public void setTaxPointDate(LocalDate taxPointDate) {
		this.taxPointDate = taxPointDate;
	}

	public List<String> getNote() {
		return note;
	}

	public void setNote(List<String> note) {
		this.note = note;
	}

	public String getDocumentCurrencyCode() {
		return documentCurrencyCode;
	}

	public void setDocumentCurrencyCode(String documentCurrencyCode) {
		this.documentCurrencyCode = documentCurrencyCode;
	}

	public String getTaxCurrencyCode() {
		return taxCurrencyCode;
	}

	public void setTaxCurrencyCode(String taxCurrencyCode) {
		this.taxCurrencyCode = taxCurrencyCode;
	}

	public String getPricingCurrencyCode() {
		return pricingCurrencyCode;
	}

	public void setPricingCurrencyCode(String pricingCurrencyCode) {
		this.pricingCurrencyCode = pricingCurrencyCode;
	}

	public String getPaymentCurrencyCode() {
		return paymentCurrencyCode;
	}

	public void setPaymentCurrencyCode(String paymentCurrencyCode) {
		this.paymentCurrencyCode = paymentCurrencyCode;
	}

	public String getPaymentAlternativeCurrencyCode() {
		return paymentAlternativeCurrencyCode;
	}

	public void setPaymentAlternativeCurrencyCode(String paymentAlternativeCurrencyCode) {
		this.paymentAlternativeCurrencyCode = paymentAlternativeCurrencyCode;
	}

	public String getAccountingCostCode() {
		return accountingCostCode;
	}

	public void setAccountingCostCode(String accountingCostCode) {
		this.accountingCostCode = accountingCostCode;
	}

	public String getAccountingCost() {
		return accountingCost;
	}

	public void setAccountingCost(String accountingCost) {
		this.accountingCost = accountingCost;
	}

	public BigDecimal getLineCountNumeric() {
		return lineCountNumeric;
	}

	public void setLineCountNumeric(BigDecimal lineCountNumeric) {
		this.lineCountNumeric = lineCountNumeric;
	}

	public List<PeriodEntity> getInvoicePeriod() {
		return invoicePeriod;
	}

	public void setInvoicePeriod(List<PeriodEntity> invoicePeriod) {
		this.invoicePeriod = invoicePeriod;
	}

	public List<ResponseEntity> getDiscrepancyResponse() {
		return discrepancyResponse;
	}

	public void setDiscrepancyResponse(List<ResponseEntity> discrepancyResponse) {
		this.discrepancyResponse = discrepancyResponse;
	}

	public OrderReferenceEntity getOrderReference() {
		return orderReference;
	}

	public void setOrderReference(OrderReferenceEntity orderReference) {
		this.orderReference = orderReference;
	}

	public List<BillingReferenceEntity> getBillingReference() {
		return billingReference;
	}

	public void setBillingReference(List<BillingReferenceEntity> billingReference) {
		this.billingReference = billingReference;
	}

	public List<DocumentReferenceEntity> getDespatchDocumentReference() {
		return despatchDocumentReference;
	}

	public void setDespatchDocumentReference(List<DocumentReferenceEntity> despatchDocumentReference) {
		this.despatchDocumentReference = despatchDocumentReference;
	}

	public List<DocumentReferenceEntity> getReceiptDocumentReference() {
		return receiptDocumentReference;
	}

	public void setReceiptDocumentReference(List<DocumentReferenceEntity> receiptDocumentReference) {
		this.receiptDocumentReference = receiptDocumentReference;
	}

	public List<DocumentReferenceEntity> getContractDocumentReference() {
		return contractDocumentReference;
	}

	public void setContractDocumentReference(List<DocumentReferenceEntity> contractDocumentReference) {
		this.contractDocumentReference = contractDocumentReference;
	}

	public List<DocumentReferenceEntity> getAdditionalDocumentReference() {
		return additionalDocumentReference;
	}

	public void setAdditionalDocumentReference(List<DocumentReferenceEntity> additionalDocumentReference) {
		this.additionalDocumentReference = additionalDocumentReference;
	}

	public List<SignatureEntity> getSignature() {
		return signature;
	}

	public void setSignature(List<SignatureEntity> signature) {
		this.signature = signature;
	}

	public SupplierPartyEntity getAccountingSupplierParty() {
		return accountingSupplierParty;
	}

	public void setAccountingSupplierParty(SupplierPartyEntity accountingSupplierParty) {
		this.accountingSupplierParty = accountingSupplierParty;
	}

	public CustomerPartyEntity getAccountingCustomerParty() {
		return accountingCustomerParty;
	}

	public void setAccountingCustomerParty(CustomerPartyEntity accountingCustomerParty) {
		this.accountingCustomerParty = accountingCustomerParty;
	}

	public PartyEntity getPayeeParty() {
		return payeeParty;
	}

	public void setPayeeParty(PartyEntity payeeParty) {
		this.payeeParty = payeeParty;
	}

	public PartyEntity getTaxRepresentativeParty() {
		return taxRepresentativeParty;
	}

	public void setTaxRepresentativeParty(PartyEntity taxRepresentativeParty) {
		this.taxRepresentativeParty = taxRepresentativeParty;
	}

	public ExchangeRateEntity getTaxExchangeRate() {
		return taxExchangeRate;
	}

	public void setTaxExchangeRate(ExchangeRateEntity taxExchangeRate) {
		this.taxExchangeRate = taxExchangeRate;
	}

	public ExchangeRateEntity getPricingExchangeRate() {
		return pricingExchangeRate;
	}

	public void setPricingExchangeRate(ExchangeRateEntity pricingExchangeRate) {
		this.pricingExchangeRate = pricingExchangeRate;
	}

	public ExchangeRateEntity getPaymentExchangeRate() {
		return paymentExchangeRate;
	}

	public void setPaymentExchangeRate(ExchangeRateEntity paymentExchangeRate) {
		this.paymentExchangeRate = paymentExchangeRate;
	}

	public ExchangeRateEntity getPaymentAlternativeExchangeRate() {
		return paymentAlternativeExchangeRate;
	}

	public void setPaymentAlternativeExchangeRate(ExchangeRateEntity paymentAlternativeExchangeRate) {
		this.paymentAlternativeExchangeRate = paymentAlternativeExchangeRate;
	}

	public List<AllowanceChargeEntity> getAllowanceCharge() {
		return allowanceCharge;
	}

	public void setAllowanceCharge(List<AllowanceChargeEntity> allowanceCharge) {
		this.allowanceCharge = allowanceCharge;
	}

	public List<TaxTotalEntity> getTaxTotal() {
		return taxTotal;
	}

	public void setTaxTotal(List<TaxTotalEntity> taxTotal) {
		this.taxTotal = taxTotal;
	}

	public MonetaryTotalEntity getLegalMonetaryTotal() {
		return legalMonetaryTotal;
	}

	public void setLegalMonetaryTotal(MonetaryTotalEntity legalMonetaryTotal) {
		this.legalMonetaryTotal = legalMonetaryTotal;
	}

	public List<CreditNoteLineEntity> getCreditNoteLine() {
		return creditNoteLine;
	}

	public void setCreditNoteLine(List<CreditNoteLineEntity> creditNoteLine) {
		this.creditNoteLine = creditNoteLine;
	}

	public List<SendEventEntity> getSendEvents() {
		return sendEvents;
	}

	public void setSendEvents(List<SendEventEntity> sendEvents) {
		this.sendEvents = sendEvents;
	}

	public List<RequeridActionDocument> getRequeridAction() {
		return requeridAction;
	}

	public void setRequeridAction(List<RequeridActionDocument> requeridAction) {
		this.requeridAction = requeridAction;
	}

}
