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
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity(name = "SummaryDocumentsLineType")
@Table(name = "SUMMARYDOCUMENTSLINETYPE")
@Inheritance(strategy = InheritanceType.JOINED)
public class SummaryDocumentsLineType {

    protected LineIDType lineID;
    protected DocumentTypeCodeType documentTypeCode;
    protected IdentifierType documentSerialID;
    protected IdentifierType startDocumentNumberID;
    protected IdentifierType endDocumentNumberID;
    protected AmountTypeCommBas totalAmount;
    protected List<PaymentType> billingPayment;
    protected List<AllowanceChargeEntity> allowanceCharge;
    protected List<TaxTotalEntity> taxTotal;
    protected String id;

    @ManyToOne(targetEntity = LineIDType.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "LINEID_SUMMARYDOCUMENTSLINET_0")
    public LineIDType getLineID() {
        return lineID;
    }

    public void setLineID(LineIDType value) {
        this.lineID = value;
    }

    @ManyToOne(targetEntity = DocumentTypeCodeType.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "DOCUMENTTYPECODE_SUMMARYDOCU_0")
    public DocumentTypeCodeType getDocumentTypeCode() {
        return documentTypeCode;
    }

    public void setDocumentTypeCode(DocumentTypeCodeType value) {
        this.documentTypeCode = value;
    }

    @ManyToOne(targetEntity = IdentifierType.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "DOCUMENTSERIALID_SUMMARYDOCU_0")
    public IdentifierType getDocumentSerialID() {
        return documentSerialID;
    }

    public void setDocumentSerialID(IdentifierType value) {
        this.documentSerialID = value;
    }

    @ManyToOne(targetEntity = IdentifierType.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "STARTDOCUMENTNUMBERID_SUMMAR_0")
    public IdentifierType getStartDocumentNumberID() {
        return startDocumentNumberID;
    }

    public void setStartDocumentNumberID(IdentifierType value) {
        this.startDocumentNumberID = value;
    }

    @ManyToOne(targetEntity = IdentifierType.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "ENDDOCUMENTNUMBERID_SUMMARYD_0")
    public IdentifierType getEndDocumentNumberID() {
        return endDocumentNumberID;
    }

    public void setEndDocumentNumberID(IdentifierType value) {
        this.endDocumentNumberID = value;
    }

    @ManyToOne(targetEntity = AmountTypeCommBas.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "TOTALAMOUNT_SUMMARYDOCUMENTS_0")
    public AmountTypeCommBas getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(AmountTypeCommBas value) {
        this.totalAmount = value;
    }

    @OneToMany(targetEntity = PaymentType.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "BILLINGPAYMENT_SUMMARYDOCUME_0")
    public List<PaymentType> getBillingPayment() {
        if (billingPayment == null) {
            billingPayment = new ArrayList<PaymentType>();
        }
        return this.billingPayment;
    }

    public void setBillingPayment(List<PaymentType> billingPayment) {
        this.billingPayment = billingPayment;
    }

    @OneToMany(targetEntity = AllowanceChargeEntity.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "ALLOWANCECHARGE_SUMMARYDOCUM_0")
    public List<AllowanceChargeEntity> getAllowanceCharge() {
        if (allowanceCharge == null) {
            allowanceCharge = new ArrayList<AllowanceChargeEntity>();
        }
        return this.allowanceCharge;
    }

    public void setAllowanceCharge(List<AllowanceChargeEntity> allowanceCharge) {
        this.allowanceCharge = allowanceCharge;
    }

    @OneToMany(targetEntity = TaxTotalEntity.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "TAXTOTAL_SUMMARYDOCUMENTSLIN_0")
    public List<TaxTotalEntity> getTaxTotal() {
        if (taxTotal == null) {
            taxTotal = new ArrayList<TaxTotalEntity>();
        }
        return this.taxTotal;
    }

    public void setTaxTotal(List<TaxTotalEntity> taxTotal) {
        this.taxTotal = taxTotal;
    }

    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Access(AccessType.PROPERTY)
    public String getId() {
        return id;
    }

    public void setId(String value) {
        this.id = value;
    }

}
