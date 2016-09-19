//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.14 at 11:44:49 AM PET 
//

package org.openfact.models.jpa.entities.ubl.common;

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
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity(name = "DespatchType")
@Table(name = "DESPATCHTYPE")
@Inheritance(strategy = InheritanceType.JOINED)
public class DespatchType {

    protected IDType ID;
    protected RequestedDespatchDateType requestedDespatchDate;
    protected RequestedDespatchTimeType requestedDespatchTime;
    protected EstimatedDespatchDateType estimatedDespatchDate;
    protected EstimatedDespatchTimeType estimatedDespatchTime;
    protected ActualDespatchDateType actualDespatchDate;
    protected ActualDespatchTimeType actualDespatchTime;
    protected AddressEntity despatchAddress;
    protected PartyType despatchParty;
    protected ContactType contact;
    protected String id;

    @ManyToOne(targetEntity = IDType.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "ID_DESPATCHTYPE_OFID")
    public IDType getID() {
        return ID;
    }

    public void setID(IDType value) {
        this.ID = value;
    }

    @ManyToOne(targetEntity = RequestedDespatchDateType.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "REQUESTEDDESPATCHDATE_DESPAT_0")
    public RequestedDespatchDateType getRequestedDespatchDate() {
        return requestedDespatchDate;
    }

    public void setRequestedDespatchDate(RequestedDespatchDateType value) {
        this.requestedDespatchDate = value;
    }

    @ManyToOne(targetEntity = RequestedDespatchTimeType.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "REQUESTEDDESPATCHTIME_DESPAT_0")
    public RequestedDespatchTimeType getRequestedDespatchTime() {
        return requestedDespatchTime;
    }

    public void setRequestedDespatchTime(RequestedDespatchTimeType value) {
        this.requestedDespatchTime = value;
    }

    @ManyToOne(targetEntity = EstimatedDespatchDateType.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "ESTIMATEDDESPATCHDATE_DESPAT_0")
    public EstimatedDespatchDateType getEstimatedDespatchDate() {
        return estimatedDespatchDate;
    }

    public void setEstimatedDespatchDate(EstimatedDespatchDateType value) {
        this.estimatedDespatchDate = value;
    }

    @ManyToOne(targetEntity = EstimatedDespatchTimeType.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "ESTIMATEDDESPATCHTIME_DESPAT_0")
    public EstimatedDespatchTimeType getEstimatedDespatchTime() {
        return estimatedDespatchTime;
    }

    public void setEstimatedDespatchTime(EstimatedDespatchTimeType value) {
        this.estimatedDespatchTime = value;
    }

    @ManyToOne(targetEntity = ActualDespatchDateType.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "ACTUALDESPATCHDATE_DESPATCHT_0")
    public ActualDespatchDateType getActualDespatchDate() {
        return actualDespatchDate;
    }

    public void setActualDespatchDate(ActualDespatchDateType value) {
        this.actualDespatchDate = value;
    }

    @ManyToOne(targetEntity = ActualDespatchTimeType.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "ACTUALDESPATCHTIME_DESPATCHT_0")
    public ActualDespatchTimeType getActualDespatchTime() {
        return actualDespatchTime;
    }

    public void setActualDespatchTime(ActualDespatchTimeType value) {
        this.actualDespatchTime = value;
    }

    @ManyToOne(targetEntity = AddressEntity.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "DESPATCHADDRESS_DESPATCHTYPE_0")
    public AddressEntity getDespatchAddress() {
        return despatchAddress;
    }

    public void setDespatchAddress(AddressEntity value) {
        this.despatchAddress = value;
    }

    @ManyToOne(targetEntity = PartyType.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "DESPATCHPARTY_DESPATCHTYPE_H_0")
    public PartyType getDespatchParty() {
        return despatchParty;
    }

    public void setDespatchParty(PartyType value) {
        this.despatchParty = value;
    }

    @ManyToOne(targetEntity = ContactType.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "CONTACT_DESPATCHTYPE_OFID")
    public ContactType getContact() {
        return contact;
    }

    public void setContact(ContactType value) {
        this.contact = value;
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
