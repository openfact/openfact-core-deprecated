//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.14 at 11:44:49 AM PET 
//

package org.openfact.models.jpa.entities.ubl.common;

import java.time.LocalDate;
import java.time.LocalTime;
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
import org.hibernate.annotations.Type;

@Entity
@Table(name = "CONTRACT")
@Inheritance(strategy = InheritanceType.JOINED)
public class ContractEntity {

    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Access(AccessType.PROPERTY)
    protected String id;

    @Column(name = "ID_UBL")
    protected String ID;

    @Column(name = "ISSUE_DATE")
    @Type(type = "org.hibernate.type.LocalDateType")
    protected LocalDate issueDate;

    @Column(name = "ISSUE_TIME")
    @Type(type = "org.hibernate.type.LocalTimeType")
    protected LocalTime issueTime;

    @Column(name = "CONTRACT_TYPE_CODE")
    protected String contractTypeCode;

    @Column(name = "CONTRACT_TYPE")
    protected String contractType;

    @ManyToOne(targetEntity = PeriodEntity.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "VALIDITYPERIOD_CONTRACT")
    protected PeriodEntity validityPeriod;

    @OneToMany(targetEntity = DocumentReferenceEntity.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "CONTRACTDOCUMENTREFERENCE_CONTRACT")
    protected List<DocumentReferenceEntity> contractDocumentReference;

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
     * @return the iD
     */
    public String getID() {
        return ID;
    }

    /**
     * @param iD
     *            the iD to set
     */
    public void setID(String iD) {
        ID = iD;
    }

    /**
     * @return the issueDate
     */
    public LocalDate getIssueDate() {
        return issueDate;
    }

    /**
     * @param issueDate
     *            the issueDate to set
     */
    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    /**
     * @return the issueTime
     */
    public LocalTime getIssueTime() {
        return issueTime;
    }

    /**
     * @param issueTime
     *            the issueTime to set
     */
    public void setIssueTime(LocalTime issueTime) {
        this.issueTime = issueTime;
    }    

    /**
     * @param contractCode
     *            the contractCode to set
     */
  
    public String getContractTypeCode() {
		return contractTypeCode;
	}

	public void setContractTypeCode(String contractTypeCode) {
		this.contractTypeCode = contractTypeCode;
	}

	/**
     * @return the contractType
     */
    public String getContractType() {
        return contractType;
    }

    /**
     * @param contractType
     *            the contractType to set
     */
    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    /**
     * @return the validityPeriod
     */
    public PeriodEntity getValidityPeriod() {
        if (this.validityPeriod == null) {
            this.validityPeriod = new PeriodEntity();
        }
        return validityPeriod;
    }

    /**
     * @param validityPeriod
     *            the validityPeriod to set
     */
    public void setValidityPeriod(PeriodEntity validityPeriod) {
        this.validityPeriod = validityPeriod;
    }

    /**
     * @return the contractDocumentReference
     */
    public List<DocumentReferenceEntity> getContractDocumentReference() {
        if (this.contractDocumentReference == null) {
            this.contractDocumentReference = new ArrayList<>();
        }
        return contractDocumentReference;
    }

    /**
     * @param contractDocumentReference
     *            the contractDocumentReference to set
     */
    public void setContractDocumentReference(List<DocumentReferenceEntity> contractDocumentReference) {
        this.contractDocumentReference = contractDocumentReference;
    }

}
