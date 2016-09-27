//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.14 at 11:44:49 AM PET 
//

package org.openfact.models.jpa.entities.ubl.common;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "BILLINGREFERENCE")
public class BillingReferenceEntity {

    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Access(AccessType.PROPERTY)
    protected String id;

    @ManyToOne(targetEntity = DocumentReferenceEntity.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "INVOICEDOCUMENTREFERENCE_BIL")
    protected DocumentReferenceEntity invoiceDocumentReference = new DocumentReferenceEntity();

    @ManyToOne(targetEntity = DocumentReferenceEntity.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "SELFBILLEDINVOICEDOCUMENTREF")
    protected DocumentReferenceEntity selfBilledInvoiceDocumentReference = new DocumentReferenceEntity();

    @ManyToOne(targetEntity = DocumentReferenceEntity.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "CREDITNOTEDOCUMENTREFERENCE")
    protected DocumentReferenceEntity creditNoteDocumentReference = new DocumentReferenceEntity();

    @ManyToOne(targetEntity = DocumentReferenceEntity.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "SELFBILLEDCREDITNOTEDOCUMENT")
    protected DocumentReferenceEntity selfBilledCreditNoteDocumentReference = new DocumentReferenceEntity();

    @ManyToOne(targetEntity = DocumentReferenceEntity.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "DEBITNOTEDOCUMENTREFERENCE")
    protected DocumentReferenceEntity debitNoteDocumentReference = new DocumentReferenceEntity();

    @ManyToOne(targetEntity = DocumentReferenceEntity.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "ADDITIONALDOCUMENTREFERENCE")
    protected DocumentReferenceEntity reminderDocumentReference = new DocumentReferenceEntity();

    @ManyToOne(targetEntity = DocumentReferenceEntity.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "BILLINGREFERENCELINE_BILLING")
    protected DocumentReferenceEntity additionalDocumentReference = new DocumentReferenceEntity();

    @OneToMany(targetEntity = BillingReferenceLineEntity.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "BILLINGREFERENCELINE_BILLING")
    protected List<BillingReferenceLineEntity> billingReferenceLine = new ArrayList<>();

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     *            the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the invoiceDocumentReference
     */
    public DocumentReferenceEntity getInvoiceDocumentReference() {
        return invoiceDocumentReference;
    }

    /**
     * @param invoiceDocumentReference
     *            the invoiceDocumentReference to set
     */
    public void setInvoiceDocumentReference(DocumentReferenceEntity invoiceDocumentReference) {
        this.invoiceDocumentReference = invoiceDocumentReference;
    }

    /**
     * @return the selfBilledInvoiceDocumentReference
     */
    public DocumentReferenceEntity getSelfBilledInvoiceDocumentReference() {
        return selfBilledInvoiceDocumentReference;
    }

    /**
     * @param selfBilledInvoiceDocumentReference
     *            the selfBilledInvoiceDocumentReference to set
     */
    public void setSelfBilledInvoiceDocumentReference(
            DocumentReferenceEntity selfBilledInvoiceDocumentReference) {
        this.selfBilledInvoiceDocumentReference = selfBilledInvoiceDocumentReference;
    }

    /**
     * @return the creditNoteDocumentReference
     */
    public DocumentReferenceEntity getCreditNoteDocumentReference() {
        return creditNoteDocumentReference;
    }

    /**
     * @param creditNoteDocumentReference
     *            the creditNoteDocumentReference to set
     */
    public void setCreditNoteDocumentReference(DocumentReferenceEntity creditNoteDocumentReference) {
        this.creditNoteDocumentReference = creditNoteDocumentReference;
    }

    /**
     * @return the selfBilledCreditNoteDocumentReference
     */
    public DocumentReferenceEntity getSelfBilledCreditNoteDocumentReference() {
        return selfBilledCreditNoteDocumentReference;
    }

    /**
     * @param selfBilledCreditNoteDocumentReference
     *            the selfBilledCreditNoteDocumentReference to set
     */
    public void setSelfBilledCreditNoteDocumentReference(
            DocumentReferenceEntity selfBilledCreditNoteDocumentReference) {
        this.selfBilledCreditNoteDocumentReference = selfBilledCreditNoteDocumentReference;
    }

    /**
     * @return the debitNoteDocumentReference
     */
    public DocumentReferenceEntity getDebitNoteDocumentReference() {
        return debitNoteDocumentReference;
    }

    /**
     * @param debitNoteDocumentReference
     *            the debitNoteDocumentReference to set
     */
    public void setDebitNoteDocumentReference(DocumentReferenceEntity debitNoteDocumentReference) {
        this.debitNoteDocumentReference = debitNoteDocumentReference;
    }

    /**
     * @return the reminderDocumentReference
     */
    public DocumentReferenceEntity getReminderDocumentReference() {
        return reminderDocumentReference;
    }

    /**
     * @param reminderDocumentReference
     *            the reminderDocumentReference to set
     */
    public void setReminderDocumentReference(DocumentReferenceEntity reminderDocumentReference) {
        this.reminderDocumentReference = reminderDocumentReference;
    }

    /**
     * @return the additionalDocumentReference
     */
    public DocumentReferenceEntity getAdditionalDocumentReference() {
        return additionalDocumentReference;
    }

    /**
     * @param additionalDocumentReference
     *            the additionalDocumentReference to set
     */
    public void setAdditionalDocumentReference(DocumentReferenceEntity additionalDocumentReference) {
        this.additionalDocumentReference = additionalDocumentReference;
    }

    /**
     * @return the billingReferenceLine
     */
    public List<BillingReferenceLineEntity> getBillingReferenceLine() {
        return billingReferenceLine;
    }

    /**
     * @param billingReferenceLine
     *            the billingReferenceLine to set
     */
    public void setBillingReferenceLine(List<BillingReferenceLineEntity> billingReferenceLine) {
        this.billingReferenceLine = billingReferenceLine;
    }

}
