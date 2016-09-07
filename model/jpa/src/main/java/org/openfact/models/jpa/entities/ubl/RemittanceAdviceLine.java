package org.openfact.models.jpa.entities.ubl;


/**
 * A class to define a line in a Remittance Advice.
 * @author Erik
 * @version 2.0
 * @created 07-Set.-2016 9:17:25 a. m.
 */
public class RemittanceAdviceLine {

	/**
	 * The monetary balance associated with this remittance advice line.
	 */
	private BigDecimal BalanceAmount;
	/**
	 * The amount credited on this remittance advice line.
	 */
	private BigDecimal CreditLineAmount;
	/**
	 * The amount debited on this remittance advice line.
	 */
	private BigDecimal DebitLineAmount;
	/**
	 * An identifier for this remittance advice line.
	 */
	private String ID;
	/**
	 * A reference to the order for payment used by the invoicing party. This may have
	 * been requested of the payer by the payee to accompany its remittance.
	 */
	private String InvoicingPartyReference;
	/**
	 * Free-form text conveying information that is not contained explicitly in other
	 * structures.
	 */
	private String Note;
	/**
	 * A code signifying the business purpose for this payment.
	 */
	private String PaymentPurposeCode;
	/**
	 * A universally unique identifier for this remittance advice line.
	 */
	private String UUID;
	private Billing Reference m_Billing Reference;
	private CustomerParty Originator CustomerParty;
	private CustomerParty Accounting CustomerParty;
	private CustomerParty Buyer CustomerParty;
	private DocumentReference m_DocumentReference;
	private ExchangeRate m_ExchangeRate;
	private Party Payee Party;
	private Period Invoice Period;
	private Supplier Party Accounting Supplier Party;
	private Supplier Party Seller Supplier Party;

	public Remittance Advice Line(){

	}

	public void finalize() throws Throwable {

	}
	public CustomerParty getAccounting CustomerParty(){
		return Accounting CustomerParty;
	}

	public Supplier Party getAccounting Supplier Party(){
		return Accounting Supplier Party;
	}

	public BigDecimal getBalanceAmount(){
		return BalanceAmount;
	}

	public Billing Reference getBilling Reference(){
		return m_Billing Reference;
	}

	public CustomerParty getBuyer CustomerParty(){
		return Buyer CustomerParty;
	}

	public BigDecimal getCreditLineAmount(){
		return CreditLineAmount;
	}

	public BigDecimal getDebitLineAmount(){
		return DebitLineAmount;
	}

	public DocumentReference getDocumentReference(){
		return m_DocumentReference;
	}

	public ExchangeRate getExchangeRate(){
		return m_ExchangeRate;
	}

	public String getID(){
		return ID;
	}

	public Period getInvoice Period(){
		return Invoice Period;
	}

	public String getInvoicingPartyReference(){
		return InvoicingPartyReference;
	}

	public String getNote(){
		return Note;
	}

	public CustomerParty getOriginator CustomerParty(){
		return Originator CustomerParty;
	}

	public Party getPayee Party(){
		return Payee Party;
	}

	public String getPaymentPurposeCode(){
		return PaymentPurposeCode;
	}

	public Supplier Party getSeller Supplier Party(){
		return Seller Supplier Party;
	}

	public String getUUID(){
		return UUID;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setAccounting CustomerParty(CustomerParty newVal){
		Accounting CustomerParty = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setAccounting Supplier Party(Supplier Party newVal){
		Accounting Supplier Party = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setBalanceAmount(BigDecimal newVal){
		BalanceAmount = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setBilling Reference(Billing Reference newVal){
		m_Billing Reference = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setBuyer CustomerParty(CustomerParty newVal){
		Buyer CustomerParty = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setCreditLineAmount(BigDecimal newVal){
		CreditLineAmount = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setDebitLineAmount(BigDecimal newVal){
		DebitLineAmount = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setDocumentReference(DocumentReference newVal){
		m_DocumentReference = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setExchangeRate(ExchangeRate newVal){
		m_ExchangeRate = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setID(String newVal){
		ID = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setInvoice Period(Period newVal){
		Invoice Period = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setInvoicingPartyReference(String newVal){
		InvoicingPartyReference = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setNote(String newVal){
		Note = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setOriginator CustomerParty(CustomerParty newVal){
		Originator CustomerParty = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setPayee Party(Party newVal){
		Payee Party = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setPaymentPurposeCode(String newVal){
		PaymentPurposeCode = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setSeller Supplier Party(Supplier Party newVal){
		Seller Supplier Party = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setUUID(String newVal){
		UUID = newVal;
	}
}//end Remittance Advice Line