//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.14 at 11:44:49 AM PET 
//

package org.openfact.models.jpa.entities.ubl.common;

import java.time.LocalDate;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "CARDACCOUNT")
public class CardAccountEntity {

    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Access(AccessType.PROPERTY)
    protected String id;

    protected String primaryAccountNumberID;
    protected String networkID;
    protected String cardCode;
    protected LocalDate validityStartDate;
    protected LocalDate expiryDate;
    protected String issuerID;
    protected String issueNumberID;
    protected String cv2ID;
    protected String cardChipCode;
    protected String chipApplicationID;
    protected String holderName;

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
     * @return the primaryAccountNumberID
     */
    public String getPrimaryAccountNumberID() {
        return primaryAccountNumberID;
    }

    /**
     * @param primaryAccountNumberID
     *            the primaryAccountNumberID to set
     */
    public void setPrimaryAccountNumberID(String primaryAccountNumberID) {
        this.primaryAccountNumberID = primaryAccountNumberID;
    }

    /**
     * @return the networkID
     */
    public String getNetworkID() {
        return networkID;
    }

    /**
     * @param networkID
     *            the networkID to set
     */
    public void setNetworkID(String networkID) {
        this.networkID = networkID;
    }

    /**
     * @return the cardCode
     */
    public String getCardCode() {
        return cardCode;
    }

    /**
     * @param cardCode
     *            the cardCode to set
     */
    public void setCardCode(String cardCode) {
        this.cardCode = cardCode;
    }

    /**
     * @return the validityStartDate
     */
    public LocalDate getValidityStartDate() {
        return validityStartDate;
    }

    /**
     * @param validityStartDate
     *            the validityStartDate to set
     */
    public void setValidityStartDate(LocalDate validityStartDate) {
        this.validityStartDate = validityStartDate;
    }

    /**
     * @return the expiryDate
     */
    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    /**
     * @param expiryDate
     *            the expiryDate to set
     */
    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    /**
     * @return the issuerID
     */
    public String getIssuerID() {
        return issuerID;
    }

    /**
     * @param issuerID
     *            the issuerID to set
     */
    public void setIssuerID(String issuerID) {
        this.issuerID = issuerID;
    }

    /**
     * @return the issueNumberID
     */
    public String getIssueNumberID() {
        return issueNumberID;
    }

    /**
     * @param issueNumberID
     *            the issueNumberID to set
     */
    public void setIssueNumberID(String issueNumberID) {
        this.issueNumberID = issueNumberID;
    }

    /**
     * @return the cv2ID
     */
    public String getCv2ID() {
        return cv2ID;
    }

    /**
     * @param cv2id
     *            the cv2ID to set
     */
    public void setCv2ID(String cv2id) {
        cv2ID = cv2id;
    }

    /**
     * @return the cardChipCode
     */
    public String getCardChipCode() {
        return cardChipCode;
    }

    /**
     * @param cardChipCode
     *            the cardChipCode to set
     */
    public void setCardChipCode(String cardChipCode) {
        this.cardChipCode = cardChipCode;
    }

    /**
     * @return the chipApplicationID
     */
    public String getChipApplicationID() {
        return chipApplicationID;
    }

    /**
     * @param chipApplicationID
     *            the chipApplicationID to set
     */
    public void setChipApplicationID(String chipApplicationID) {
        this.chipApplicationID = chipApplicationID;
    }

    /**
     * @return the holderName
     */
    public String getHolderName() {
        return holderName;
    }

    /**
     * @param holderName
     *            the holderName to set
     */
    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

}