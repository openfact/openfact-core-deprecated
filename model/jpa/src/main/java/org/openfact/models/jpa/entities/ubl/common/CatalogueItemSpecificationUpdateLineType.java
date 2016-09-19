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

@Entity(name = "CatalogueItemSpecificationUpdateLineType")
@Table(name = "CATALOGUEITEMSPECIFICATIONUP_0")
@Inheritance(strategy = InheritanceType.JOINED)
public class CatalogueItemSpecificationUpdateLineType {

    protected IDType ID;
    protected CustomerPartyType contractorCustomerParty;
    protected SupplierPartyEntity sellerSupplierParty;
    protected ItemType item;
    protected String id;

    @ManyToOne(targetEntity = IDType.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "ID_CATALOGUEITEMSPECIFICATIO_0")
    public IDType getID() {
        return ID;
    }

    public void setID(IDType value) {
        this.ID = value;
    }

    @ManyToOne(targetEntity = CustomerPartyType.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "CONTRACTORCUSTOMERPARTY_CATA_0")
    public CustomerPartyType getContractorCustomerParty() {
        return contractorCustomerParty;
    }

    public void setContractorCustomerParty(CustomerPartyType value) {
        this.contractorCustomerParty = value;
    }

    @ManyToOne(targetEntity = SupplierPartyEntity.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "SELLERSUPPLIERPARTY_CATALOGU_0")
    public SupplierPartyEntity getSellerSupplierParty() {
        return sellerSupplierParty;
    }

    public void setSellerSupplierParty(SupplierPartyEntity value) {
        this.sellerSupplierParty = value;
    }

    @ManyToOne(targetEntity = ItemType.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "ITEM_CATALOGUEITEMSPECIFICAT_0")
    public ItemType getItem() {
        return item;
    }

    public void setItem(ItemType value) {
        this.item = value;
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
